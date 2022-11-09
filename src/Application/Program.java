package Application;

import java.util.Scanner;

import Entities.Usuario;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite o nome!");
        String name = sc.nextLine();

        System.out.println("digite a idade!");
        Integer idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o cpf!");
        String cpf = sc.nextLine();

        Usuario usuario = new Usuario(name, idade, cpf);


        System.out.println("========================================================================");

        System.out.println(usuario);
        sc.close();

    }
}
