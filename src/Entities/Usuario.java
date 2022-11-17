package Entities;

public class Usuario {
    private String name;
    private Integer idade;
    private String cpf;

    public Usuario() {
    }
    
    public Usuario(String name, Integer idade, String cpf) {
        this.name = name;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario [name=" + name + ", idade=" + idade + ", cpf=" + cpf + "]";
    }

}
