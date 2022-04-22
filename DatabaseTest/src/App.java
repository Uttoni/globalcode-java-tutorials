import java.sql.Date;

import DAO.ClienteDAO;
import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Date dataNasc = new Date(100, 2, 10);

        Cliente c1 = new Cliente("Uttoni", 20, 1.71f, 123456789, dataNasc);
        System.out.println(c1.toString());

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.addCliente(c1);
    }
}
