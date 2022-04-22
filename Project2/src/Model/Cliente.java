package Model;

public class Cliente {
    private String nome;
    private int id;
    private int qtdPedidos;

    public Cliente(String nome, int id, int qtd){
        this.nome = nome;
        this.id = id;
        this.qtdPedidos = qtd;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id: " + id + "\tNome: " + nome + "\tPedidos: " + qtdPedidos;
    }
    
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getQtdPedidos() {
        return qtdPedidos;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQtdPedidos(int qtdPedidos) {
        this.qtdPedidos = qtdPedidos;
    }
}
