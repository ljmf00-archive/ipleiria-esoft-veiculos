/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.dei.es.veiculos.modelo;

/**
 *
 * @author luis
 */
public class Utilizador {
    private String nome;
    
    public Utilizador(String nome)
    {
        this.nome = nome;
    }
    
    @Override
    public String toString()
    {
        return this.nome;
    }
}
