/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RaelH
 */
public class Produto {
    private String nome;
    private double preco;
    protected int  quantidade;

    public Produto() {
    }
 
    
    public static void testarMetodoStatic(){
        System.out.println("sem new - model.Produto.testarMetodoStatic()");
    }
    
    public Produto(String nome, double preco, int  quantidade) {
        this.nome       = nome;
        this.preco      = preco;
        this.quantidade = quantidade;
    }

    public void TestOk(){
        System.out.println("Testando herança - Produto");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
