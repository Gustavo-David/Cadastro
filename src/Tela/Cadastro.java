package Tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import BancoDeDados.Controler;

public class Cadastro extends JFrame implements ActionListener {
    JFrame jFrame = new JFrame("Cadastro");

    ImageIcon img = new ImageIcon("C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\Cadastro\\src\\Tela\\Imagens\\ImagensMascaras\\KitsuneMask.png");


    JButton LoginButton = new JButton("Login");
    JButton CadastrarButton = new JButton("Cadastrar");

    JLabel TextNome = new JLabel(" Nome");
    JLabel TextEmail = new JLabel(" Email");
    JLabel TextSenha = new JLabel(" Senha");
    JLabel TextTitulo = new JLabel("|----- CADASTRO -----|");

    JLabel Imagen = new JLabel(img);

    JTextField CaixaNome = new JTextField("Nome");
    JTextField CaixaEmail = new JTextField("Email");
    JTextField CaixaSenha = new JTextField("Senha");

    public Cadastro() {
        setVisible(true);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(21, 24, 38));
        setLayout(null);

        LoginButton();
        CadastrarButton();
        TextNome();
        TextEmail();
        TextSenha();
        CaixaNome();
        CaixaEmail();
        CaixaSenha();
       // ImageMask();
       TextTitulo();
    }

    public void TextTitulo(){
        TextTitulo.setBounds(100,10, 500, 100);
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

    public void CadastrarButton() {
        CadastrarButton.setBounds(10, 390, 150, 50);
        CadastrarButton.setFont(new Font("Arial", Font.PLAIN, 20));
        CadastrarButton.setFocusPainted(false);
        CadastrarButton.setForeground(new Color(4, 161, 232));
        CadastrarButton.setBackground(new Color(21, 24, 38));
        CadastrarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        CadastrarButton.setMargin(new Insets(2, 1000, 2, 14));
        add(CadastrarButton);
        CadastrarButton.addActionListener(this);
    }

    public void TextNome() {
        TextNome.setBounds(10, 90, 100, 100);
        TextNome.setFont(new Font("Arial", Font.PLAIN, 20));
        TextNome.setForeground(new Color(4, 161, 232));
        TextNome.setBackground(new Color(21, 24, 38));
        add(TextNome);
    }

    public void TextEmail() {
        TextEmail.setBounds(10, 190, 100, 100);
        TextEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        TextEmail.setForeground(new Color(4, 161, 232));
        TextEmail.setBackground(new Color(21, 24, 38));
        add(TextEmail);
    }

    public void TextSenha() {
        TextSenha.setBounds(10, 290, 100, 100);
        TextSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        TextSenha.setForeground(new Color(4, 161, 232));
        TextSenha.setBackground(new Color(21, 24, 38));
        add(TextSenha);
    }

    public void CaixaNome() {
        CaixaNome.setBounds(100, 110, 200, 50);
        CaixaNome.setFont(new Font("Arial", Font.PLAIN, 20));
        CaixaNome.setForeground(new Color(4, 161, 232));
        CaixaNome.setBackground(new Color(21, 24, 38));
        CaixaNome.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        add(CaixaNome);
        CaixaNome.getText();
    }

    public void CaixaEmail() {
        CaixaEmail.setBounds(100, 210, 200, 50);
        CaixaEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        CaixaEmail.setForeground(new Color(4, 161, 232));
        CaixaEmail.setBackground(new Color(21, 24, 38));
        CaixaEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        add(CaixaEmail);
        CaixaEmail.getText();
    }

    public void CaixaSenha() {
        CaixaSenha.setBounds(100, 310, 200, 50);
        CaixaSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        CaixaSenha.setForeground(new Color(4, 161, 232));
        CaixaSenha.setBackground(new Color(21, 24, 38));
        CaixaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        add(CaixaSenha);
        CaixaSenha.getText();
    }

    public void ImageMask() {
        Imagen.setBounds(100, 100, 100, 100);
        add(Imagen);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginButton) {
            new Login();
        }
        if (e.getSource() == CadastrarButton) {
            String name = CaixaNome.getText();
            String email = CaixaEmail.getText();
            String senha = CaixaSenha.getText();
            new Controler(name, email, senha);
        }
    }
}
