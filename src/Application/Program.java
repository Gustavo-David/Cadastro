package Application;

import java.sql.Connection;
import java.util.Scanner;

import BancoDeDados.Db;
import Entities.Usuario;

public class Program {
    public static void main(String[] args) {
        int opcao = 0;
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);

        Connection conn = Db.getConnection();

        if (conn != null) {
            System.out.println("deu certo!");
        } else {
            System.out.println("deu ruim!");
        }
        sc.nextLine();

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

        sc.close();
        Db.closeConnection();

        System.out.println("========================================================================");

        System.out.println(usuario);
    }
}
