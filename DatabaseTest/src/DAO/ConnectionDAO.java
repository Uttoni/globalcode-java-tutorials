package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConnectionDAO {
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    String database = "projetoGC1";
    String url = "jdbc:mysql://127.0.0.1:3306/" + database
            + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "root";

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("deu certo");
        } catch (SQLException exc) {
            System.out.println("ERRO DE CONEXÃO");
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
