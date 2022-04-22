package Model;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private long rg;
    private String dataNasc;

    //CONTRUTOR ========================================================================
    public Pessoa(String nome, long rg, String dataNasc){
        this.nome = nome;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }

    //EQUALS ============================================================================
    @Override
    public boolean equals(Object o){

        //VER SE O PARAMETRO É NULO
        if(o == null) return false;

        //VER SE O OBJETO É DA MESMA CLASSE
        if(!(this.getClass().equals(o.getClass()))) return false;


        Pessoa outro = (Pessoa) o;

        //RG IGUAL
        boolean rgIgual = this.rg == outro.getRg();

        //NOME IGUAL
        boolean nomeIgual = false;
        if(this.nome != null){
            nomeIgual = this.getNome().equals(outro.getNome());
        }else{
            nomeIgual = outro.getNome() == null;
        }

        boolean dataNascIgual = false;
        if (this.dataNasc != null) {
            dataNascIgual = this.getDataNasc().equals(outro.getDataNasc());
        } else {
            dataNascIgual = outro.getDataNasc() == null;
        }

        return rgIgual && nomeIgual && dataNascIgual;
    }


    //HASHCODE =========================================================================
    @Override
    public int hashCode(){
        String atributos = nome + rg + dataNasc;
        return atributos.hashCode();
    }


    //TO STRING ========================================================================
    @Override
    public String toString() {
        return "Nome: " + nome + ", RG: " + rg + ", Data de Nasc.: " + dataNasc;
    }


    //COMPARE TO ========================================================================
    @Override
    public int compareTo(Pessoa o) {
        String atributos = nome + rg;
        String outrosAtributos = o.getNome() + o.getRg();
        
        return atributos.compareTo(outrosAtributos);
    }

    //GETTER E SETTERS ===================================================================
    public String getNome() {
        return nome;
    }

    public long getRg() {
        return rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
