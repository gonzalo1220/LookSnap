package src;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    public static void main(String[] args){
        String user = "postgres";
        String pass = "David4309";

        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LookSnapDB", user,pass);
            System.out.println("Conectado con éxito");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
