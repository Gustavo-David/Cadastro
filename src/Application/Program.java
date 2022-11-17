package Application;

import java.util.Scanner;

import Entities.Usuario;

public class Program {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);
         
        try {
            do {

                System.out.println("digite a opcao!");
                System.out.println("1 - Cadastro!");
                System.out.println("2 - login!");
                System.out.println("3 - logoff!");
                System.out.println("0 - sair!");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:

                        System.out.println("Digite o nome!");
                        String name = sc.nextLine();

                        sc.nextLine();

                        System.out.println("digite a idade!");
                        Integer idade = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Digite o cpf!");
                        String cpf = sc.nextLine();

                        usuario = new Usuario(name, idade, cpf);

                        break;

                    case 2:
                        System.out.println("funçao invalida!");

                        break;
                    default:

                        if (opcao != 0) {
                            System.out.println("numero invalido");
                            sc.nextLine();
                        }

                        break;
                }

            } while (opcao != 0);
        } catch (NullPointerException e) {
            throw new Exception("Erro!  " + e.getMessage());
        } catch (IllegalStateException e) {
            throw new Exception("Erro de digitaçao!  " + e.getMessage());
        } finally {
            sc.close();
        }

        System.out.println("========================================================================");

        System.out.println(usuario);
    }
}
