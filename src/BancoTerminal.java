import java.util.Scanner;

//import Usuario.Usuario;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

    double saldo = 5000.0;   
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
            break;
                 case 2:
                 depositar =  entrada.nextDouble();
                 saldo = saldo + depositar;
                 System.out.println("Seu saldo atual é :"+ saldo);
                    break;
    
        default:
            break;
                }
            } while (escolhaServiço==2);
    }




       
        

    }

/*  System.out.println("Hello, World!Banco Terminal");
        double saldoConta = 0;
        Usuario pessoa = new Usuario();
        pessoa.nome = entrada.next();
        pessoa.senha = entrada.next();
        System.out.println("Teste  "+ pessoa.nome);
        System.out.println(pessoa.senha);*/