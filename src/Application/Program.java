package Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import BancoDeDados.Db;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = Db.getConnection();
        PreparedStatement st = null;
        try {

            st = conn.prepareStatement("INSERT INTO seller" + "(Name, Email, BirthDate)" + " VALUES" + "(?,?,?)");
            st.setString(1, "Gustavo");
            st.setString(2, "gustavodavid@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.executeUpdate();

        } catch (SQLException e) {

            System.out.println("error: " + e.getMessage());

        } catch (ParseException e) {

            System.out.println("error: " + e.getMessage());

        } finally {
            Db.closeStatement(st);
            Db.closeConnection();
        }

    }

}
