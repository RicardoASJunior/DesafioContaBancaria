import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o nome do Usuário? " );
        String nomeConta = leitor.nextLine();

        System.out.println("Qual o Primeiro valor a ser despositado? ");
        double saldoConta = leitor.nextDouble();

        System.out.println("**************************************");
        System.out.println("Nome: " +     nomeConta);
        System.out.println("Saldo: "+     saldoConta);
        System.out.println("**************************************");
    
        int comandoUsuario;
        while (true) {
            System.out.println("""
                    O que você deseja?
                    Digite:
                    1- Consultar Saldo
                    2- Depositar Dinheiro
                    3- Sacar Dinheiro
                    4- Sair

                    """);
                    
            comandoUsuario = leitor.nextInt();

            if(comandoUsuario == 1){
                System.out.println("Seu saldo é de: " + saldoConta);
                System.out.println("\n");
            }
            if(comandoUsuario == 2){
                System.out.println("Digite o valor a ser depositado: ");
                double valorDepositado = leitor.nextDouble();
                if(valorDepositado > 0){
                    saldoConta += valorDepositado;
                    System.out.println("Agora seu saldo é de: " + saldoConta);
                    System.out.println("\n");
                }else{
                    System.out.println("Valor Inválido");
                    System.out.println("\n");
                }
            }
            if(comandoUsuario == 3){
                System.out.println("Digite o valor a ser sacado: ");
                double valorSacado = leitor.nextDouble();
                if(valorSacado <= saldoConta){
                    saldoConta -= valorSacado;
                    System.out.println("Agora seu saldo é de: " + saldoConta);
                    System.out.println("\n");
                }else{
                    System.out.println("Você não tem limite para essa transação!");
                    System.out.println("\n");
                }   
            } 
            if(comandoUsuario == 4){
                System.out.println("Operações Finalizadas!");
                break;
            }
            if(comandoUsuario!=1 && comandoUsuario!=2 && comandoUsuario!=3 && comandoUsuario!=4){
                System.out.println("Comando Inválido!");
            } 
        }
    }
}