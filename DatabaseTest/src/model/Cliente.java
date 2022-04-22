package model;

import java.sql.Date;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private float altura;
    private long cpf;
    private Date dataNasc;

    public Cliente(String nome, int idade, float altura, long cpf, Date dataNasc){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {

        String retorno = "";
        try{
            retorno = "ID: " + id
            + " Nome: " + nome
            + " Idade: " + idade
            + " Altura: " + altura
            + " CPF: " + cpf
            + " Data Nasc: " + dataNasc.toString();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return retorno;
    }
    
    public int getId() {
        return id;
    }

    public float getAltura() {
        return altura;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataNasc() {
        return dataNasc;
    }
}
