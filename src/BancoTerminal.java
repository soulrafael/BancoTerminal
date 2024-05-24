import java.util.Scanner;

import Usuario.Usuario;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!Banco Terminal");
        Scanner entrada = new Scanner(System.in);
        Usuario pessoa = new Usuario();
        pessoa.nome = entrada.next();
        pessoa.senha = entrada.next();
        System.out.println("Teste  "+ pessoa.nome);
        System.out.println(pessoa.senha);
        

    }
}