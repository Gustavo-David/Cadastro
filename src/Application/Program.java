package Application;

import java.sql.Connection;

import BancoDeDados.Db;

public class Program {
    public static void main(String[] args) {

        Connection conn = Db.getConnection();

        if (conn != null) {
            System.out.println("deu certo!");
        } else {
            System.out.println("deu ruim!");
        }
        Db.closeConnection();

    }
}
