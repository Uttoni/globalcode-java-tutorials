import java.text.NumberFormat;

public class Celular {
    private static int contador;
    public int id;
    public String nome;
    public String marca;
    public int ram;
    public String armazenamentoInterno;
    public int bateria;
    public float preco;

    public Celular() {
        contador++;
        id = contador;
    }

    @Override
    public String toString() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance();

        String texto = "ID: " + id + "\n";
        texto += "Nome: " + nome + "\n";
        texto += "Marca: " + marca + "\n";
        texto += "RAM: " + ram + "GB\n";
        texto += "Memória: " + armazenamentoInterno + "GB\n";
        texto += "Bateria: " + bateria + "mAh\n";
        texto += "Preço: " + formatador.format(preco) + "\n";
        return texto;

    }
    
}
