package Tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import BancoDeDados.Db;
import BancoDeDados.DbException;

public class Login extends JFrame implements ActionListener {
    JFrame jFrame = new JFrame();

    ImageIcon img = new ImageIcon(
            "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\Cadastro\\src\\Tela\\Imagens\\ImagensMascaras\\KitsuneMask.png");

    JButton LoginButton = new JButton("Login");
    JButton CadastroButton = new JButton("Cadastro");

    JLabel TextTitulo = new JLabel("|--------- LOGIN ---------|");

    JLabel TextEmail = new JLabel(" Email");
    JLabel TextSenha = new JLabel(" Senha");

    JLabel Imagen = new JLabel(img);

    JTextField CaixaEmail = new JTextField("Email");
    JTextField CaixaSenha = new JTextField("Senha");

    public Login() {
        setVisible(true);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(21, 24, 38));
        setLayout(null);

        LoginButton();
        CadastroButton();
        TextEmail();
        TextSenha();
        CaixaEmail();
        CaixaSenha();
        // ImageMask();
        TextTitulo();
    }

    public void TextTitulo() {
        TextTitulo.setBounds(100, 10, 500, 100);
        TextTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        TextTitulo.setForeground(new Color(4, 161, 232));
        TextTitulo.setBackground(new Color(21, 24, 38));
        add(TextTitulo);
    }

    public void LoginButton() {
        LoginButton.setBounds(225, 390, 150, 50);
        LoginButton.setFont(new Font("Arial", Font.PLAIN, 20));
        LoginButton.setFocusPainted(false);
        LoginButton.setForeground(new Color(4, 161, 232));
        LoginButton.setBackground(new Color(21, 24, 38));
        LoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        LoginButton.setMargin(new Insets(2, 1000, 2, 14));
        add(LoginButton);
        LoginButton.addActionListener(this);
    }

    public void CadastroButton() {
        CadastroButton.setBounds(10, 390, 150, 50);
        CadastroButton.setFont(new Font("Arial", Font.PLAIN, 20));
        CadastroButton.setFocusPainted(false);
        CadastroButton.setForeground(new Color(4, 161, 232));
        CadastroButton.setBackground(new Color(21, 24, 38));
        CadastroButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        CadastroButton.setMargin(new Insets(2, 1000, 2, 14));
        add(CadastroButton);
        CadastroButton.addActionListener(this);
    }

    public void TextEmail() {
        TextEmail.setBounds(10, 100, 100, 100);
        TextEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        TextEmail.setForeground(new Color(4, 161, 232));
        TextEmail.setBackground(new Color(21, 24, 38));
        add(TextEmail);
        TextEmail.getText();
    }

    public void TextSenha() {
        TextSenha.setBounds(10, 200, 100, 100);
        TextSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        TextSenha.setForeground(new Color(4, 161, 232));
        TextSenha.setBackground(new Color(21, 24, 38));
        add(TextSenha);
        TextSenha.getText();
    }

    public void CaixaEmail() {
        CaixaEmail.setBounds(100, 120, 200, 50);
        CaixaEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        CaixaEmail.setForeground(new Color(4, 161, 232));
        CaixaEmail.setBackground(new Color(21, 24, 38));
        CaixaEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        add(CaixaEmail);
        CaixaEmail.getText();
    }

    public void CaixaSenha() {
        CaixaSenha.setBounds(100, 220, 200, 50);
        CaixaSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        CaixaSenha.setForeground(new Color(4, 161, 232));
        CaixaSenha.setBackground(new Color(21, 24, 38));
        CaixaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        add(CaixaSenha);
        
    }

    public void ImageMask() {

        Imagen.setBounds(100, 100, 100, 100);
        add(Imagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginButton) {
            Connection conn = Db.getConnection();
            Statement st = null;
            ResultSet rs = null;
            
    
            try {
                st = conn.createStatement();
                rs = st.executeQuery("select * from cadastro");
    
                while(rs.next()){
                    if(rs.getString("senha").equals( CaixaSenha.getText())){
                        jFrame.dispose();
                        new Logado(rs.getString("Email"), rs.getString("Name"));
                    }
                }
    
            } catch (SQLException x) {
                throw new DbException("deu ruim" + x.getMessage());
            } finally {
                Db.closeStatement(st);
                Db.closeResultSet(rs);
                Db.closeConnection();
            }
        }



        if (e.getSource() == CadastroButton) {
            new Cadastro();
            jFrame.dispose();
        }
    }

}

// "C:\\Users\\gusta\\OneDrive\\Área de
// Trabalho\\Cadastro\\Imagens\\ImagensFundo\\Titulo.png"