package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Cliente;

public class ClienteDAO extends ConnectionDAO {

    boolean sucesso = false;

    public void addCliente(Cliente cliente) {
        connectToDB();
        String sql = "INSERT INTO Cliente (nome, idade, altura, cpf, dataNasc) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, cliente.getNome());
            pst.setInt(2, cliente.getIdade());
            pst.setFloat(3, cliente.getAltura());
            pst.setLong(4, cliente.getCpf());
            pst.setDate(5, cliente.getDataNasc());
            pst.executeUpdate();

            ResultSet idGerado = pst.getGeneratedKeys();
            if(idGerado.next()){
                cliente.setId(idGerado.getInt(1));
            }
            System.out.println("ID: " + cliente.getId());

            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Inserir");
            exc.printStackTrace();
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("erro");
                System.out.println("Erro: " + exc.getMessage());
            }
        }
    }
}
