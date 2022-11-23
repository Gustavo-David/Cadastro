package BancoDeDados;

public class DbExeption extends RuntimeException{
    public DbExeption(String msg){
        super(msg);
    }
}
