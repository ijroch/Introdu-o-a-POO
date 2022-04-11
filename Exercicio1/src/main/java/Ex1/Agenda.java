package Ex1;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Faça um programa de agenda telefônica, com as classes Agenda e Contato
 * @author isinhazinha
 */
public class Agenda {
    ArrayList<Produto> arrayDeProdutos= new ArrayList<>();
    
    public class Contato{
        String nome;
        String endereço;
        String email;
        int telefone;
        
        void inserirContato(){
            Contato contato = new Contato();
        }
        
        void deletarContato(){
            
        }
        
    }
}
