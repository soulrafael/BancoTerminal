import java.util.Scanner;

//import Usuario.Usuario;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

    double saldo=0 ;   
    double depositar; 
    double sacar;
//menu de escolher as opçoes no terminal
System.out.println("Escolha as opções de serviço escolha um numero");
System.out.println("DIGITE 1 - SACAR");
System.out.println("DIGITE 2 - DEPOSITAR");
System.out.println("EXIT 3");
 int escolhaServiço = entrada.nextInt();

do{
    switch (escolhaServiço) {
        case 1:
            System.out.println("Qual o valor que deseja sacar: ");
             sacar = entrada.nextDouble();
                    if (saldo>sacar) {
                        saldo= saldo-sacar;
                            System.out.println("O valor será entregue ");
                                System.out.println(" saldo atualizado: "+ saldo);
                    }else{
                        System.out.println("Saldo insuficiente ! Saldo Atual: "+saldo);
                    }
                    System.out.println("Deseja sair DIGITE 3 ou digite 2 para depositar");
                    escolhaServiço = entrada.nextInt();
                    System.out.println("Saindo");
            break;
                 case 2:
                 System.out.print("Digite o valor que deseja Depositar:");
                 depositar =  entrada.nextDouble();
                 saldo = saldo + depositar;
                 System.out.println("Seu saldo atual é :"+ saldo);
                 System.out.println("Deseja sair DIGITE 3 ou Digite 1 para sacar");
                 escolhaServiço = entrada.nextInt();
                 System.out.println("Saindo");
                    break;
    
        default:
            break;
                }
            } while (escolhaServiço==2||escolhaServiço==1);
    }




       
        

    }

/*  System.out.println("Hello, World!Banco Terminal");
        double saldoConta = 0;
        Usuario pessoa = new Usuario();
        pessoa.nome = entrada.next();
        pessoa.senha = entrada.next();
        System.out.println("Teste  "+ pessoa.nome);
        System.out.println(pessoa.senha);*/