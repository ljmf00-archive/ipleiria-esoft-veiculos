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
public class Veiculo {
    private int numeroSerie;
    private Marca marca;
    private Data data;

    public Veiculo(int numeroSerie, Marca marca, Data data)
    {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.data = data;
    }

    public String toString()
    {
        //TODO:
        return marca.toString() + " - " + String.valueOf(numeroSerie)
                + " (" + data.toString()
                + ")";
    }

    public int getNumeroSerie()
    {
        return this.numeroSerie;
    }
}
