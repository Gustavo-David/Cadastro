package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controler {
    Connection conn = Db.getConnection();
    PreparedStatement st = null;

    private String name;
    private String email;
    private String senha;
    public Controler(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        Cadastro();
    }
    

    private void Cadastro() {
        try {
            st = conn.prepareStatement("INSERT INTO cadastro" + "(Name, Email, Senha)" + " VALUES" + "(?,?,?)");
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, senha);
            st.executeUpdate();

        } catch (SQLException e) {

            System.out.println("Error de SQlException: " + e.getMessage());

        } finally {
            Db.closeStatement(st);
            Db.closeConnection();
        }
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
