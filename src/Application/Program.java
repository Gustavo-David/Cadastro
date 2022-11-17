package Application;

import java.util.Scanner;

import Entities.Usuario;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        
        try {

            System.out.println("Digite o nome!");
            String name = sc.nextLine();

            System.out.println("digite a idade!");
            Integer idade = sc.nextInt();

            sc.nextLine();

            System.out.println("Digite o cpf!");
            String cpf = sc.nextLine();

            usuario = new Usuario(name, idade, cpf);

        } catch (NullPointerException e) {
            throw new Exception(e.getMessage());
        } finally {
            sc.close();
        }

        System.out.println("========================================================================");

        System.out.println(usuario);

    }
}
