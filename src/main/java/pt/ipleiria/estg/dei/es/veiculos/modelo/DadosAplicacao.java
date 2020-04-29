/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.dei.es.veiculos.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class DadosAplicacao {
    private static DadosAplicacao INSTANCE;

    private List<Veiculo> veiculos;
    private List<Utilizador> utilizadores;

    DadosAplicacao()
    {
        this.veiculos = new ArrayList<Veiculo>();
        this.utilizadores = new ArrayList<Utilizador>();
    }

    public static DadosAplicacao getInstance()
    {
        return (INSTANCE == null)
                ? INSTANCE = new DadosAplicacao()
                : INSTANCE;
    }

    public void adicionarVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos()
    {
        return veiculos;
    }

    public boolean procurarNumeroSerie(int numeroSerie)
    {
        for(Veiculo v : veiculos)
            if(v.getNumeroSerie() == numeroSerie)
                return true;

        return false;
    }
}
