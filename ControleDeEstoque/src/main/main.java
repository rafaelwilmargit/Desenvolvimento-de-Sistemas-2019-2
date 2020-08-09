/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Produto;
import model.test;

/**
 *
 * @author RaelH
 */
public class main {
        /**
     * @param args the command line arguments
     */
    List<Produto> ListProdutos = new ArrayList<Produto>();
    
  
      
    main(){
        Scanner s = new Scanner(System.in);
        int valor = -1;
        
        mostrarDados(valor);
        do{
            valor = s.nextInt();
            mostrarDados(valor);
        }while(valor != 0);
    }
    
    void EntradaDeDados(){
        Scanner s = new Scanner(System.in);
        Produto e = new Produto();
        
        System.out.println("Digite o nome do produto:");
        e.setNome(s.nextLine());
        
        System.out.println("Digite o preço do produto:");
        e.setPreco( Double.parseDouble(s.nextLine()));
        
        System.out.println("Digite a quantidade do produto:");
        e.setQuantidade( Integer.parseInt(s.nextLine()));
        
        ListProdutos.add(e);
        mostrarDados(-1);
    }
    
    void EntradaListaDeProdutos(){
        int i = 0;
        
        for(i = 0; i < ListProdutos.size(); i++){
             System.out.println("id: " + i);
             System.out.println("Nome do produto: " + ListProdutos.get(i).getNome() );
             System.out.println("Preço do produto: " + ListProdutos.get(i).getPreco());
             System.out.println("Quantidade do produto: " + ListProdutos.get(i).getQuantidade());
        }
        mostrarDados(-1);
    }
    
    void mostrarDados(int valor){
        
        switch(valor){
            case 1:
                System.out.println("Entrada de dados");
                EntradaDeDados();
                break;
                
            case 2:
                System.out.println("Saída de dados");
                
                break;
                
            case 3:
                System.out.println("Mostrar lista");
                EntradaListaDeProdutos();
                break;
            
            default:
                 System.out.println("Digite a opcao:\n 0 - Sair\n 1 - Entrada\n 2 - Saída\n 3 - Mostrar lista");
            
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     //   main m = new main();  
     //Produto.testarMetodoStatic();
     test t = new test();
     
     t.TestOk();
     t.getNome();
     
     
     
     //;
     
     
    // Produto produto = new Produto("Rafael", 15);
     
     //produto.setNome("adas");
     

    }
    
}
