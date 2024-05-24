import java.util.Scanner;

import Usuario.Usuario;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!Banco Terminal");
        Login();

    }
    public static void Login(){
        Scanner entrada = new Scanner(System.in);
        Usuario pessoa = new Usuario();
        pessoa.nome = entrada.next();
        System.out.println("Teste  "+ pessoa.nome);


    }
}