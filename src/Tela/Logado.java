package Tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Logado extends JFrame implements ActionListener {
    private String name;
    private String email;
    JFrame jFrame = new JFrame();

    JButton SairButton = new JButton("Sair");
    JButton CadastroButton = new JButton("Cadastro");

    JLabel TextTitulo = new JLabel("|------- LOGADO -------|");

    JLabel TextEmail = new JLabel("");
    JLabel TextName = new JLabel("");

    public Logado(String email, String name) {

        this.email = email;
        this.name = name;

        setVisible(true);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(21, 24, 38));
        setLayout(null);

        SairButton();
        TextEmail();
        TextName();
        TextTitulo();
    }

    public void TextTitulo() {
        TextTitulo.setBounds(100, 10, 500, 100);
        TextTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        TextTitulo.setForeground(new Color(4, 161, 232));
        TextTitulo.setBackground(new Color(21, 24, 38));
        add(TextTitulo);
    }

    public void TextName() {
        TextName = new JLabel("Name: " + name);
        TextName.setBounds(10, 100, 500, 100);
        TextName.setFont(new Font("Arial", Font.PLAIN, 20));
        TextName.setForeground(new Color(4, 161, 232));
        TextName.setBackground(new Color(21, 24, 38));
        add(TextName);
        TextName.getText();
    }

    public void TextEmail() {
        TextEmail = new JLabel("Email: " + email);
        TextEmail.setBounds(10, 150, 500, 100);
        TextEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        TextEmail.setForeground(new Color(4, 161, 232));
        TextEmail.setBackground(new Color(21, 24, 38));
        add(TextEmail);
        TextEmail.getText();
    }

    public void SairButton() {
        SairButton.setBounds(225, 390, 150, 50);
        SairButton.setFont(new Font("Arial", Font.PLAIN, 20));
        SairButton.setFocusPainted(false);
        SairButton.setForeground(new Color(4, 161, 232));
        SairButton.setBackground(new Color(21, 24, 38));
        SairButton.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(4, 161, 232), 3));
        SairButton.setMargin(new Insets(2, 1000, 2, 14));
        add(SairButton);
        SairButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
