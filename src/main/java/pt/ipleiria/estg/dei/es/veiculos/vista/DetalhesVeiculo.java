/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.dei.es.veiculos.vista;

import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import pt.ipleiria.estg.dei.es.veiculos.modelo.DadosAplicacao;
import pt.ipleiria.estg.dei.es.veiculos.modelo.Data;
import pt.ipleiria.estg.dei.es.veiculos.modelo.Marca;
import pt.ipleiria.estg.dei.es.veiculos.modelo.Utilizador;
import pt.ipleiria.estg.dei.es.veiculos.modelo.Veiculo;

/**
 *
 * @author luis
 */
public class DetalhesVeiculo extends javax.swing.JDialog {

    private Utilizador utilizador;

    private static final int ERRO_CAMPOS_VAZIOS = 1;
    private static final int ERRO_NUM_SERIE_INV = 2;
    private static final int ERRO_NUM_SERIE_UTL = 3;
    private static final int ERRO_FORMATO_DATA = 4;
    private static final int ERRO_DATA_INVALIDA = 5;

    /**
     * Creates new form DetalhesVeiculo
     */
    public DetalhesVeiculo(java.awt.Frame parent, boolean modal, Utilizador utilizador) {
        super(parent, modal);
        initComponents();

        this.utilizador = utilizador;

        atualizarMarcas();
        atualizarUtilizador();
    }

    public void atualizarMarcas()
    {
        cbMarca.setModel(new DefaultComboBoxModel<>(Marca.values()));
    }

    public void atualizarUtilizador()
    {
        lblUtilizador.setText(utilizador.toString());
    }

    public void mostrar()
    {
        this.setVisible(true);
    }

    private void fechar()
    {
        this.setVisible(false);
    }

    private void mostrarErro(int erro)
    {
        String msg;

        switch(erro)
        {
            case ERRO_CAMPOS_VAZIOS: msg = "Campo(s) vazio(s)! Por favor preencha o número de série, a marca e a data"; break;
            case ERRO_NUM_SERIE_INV: msg = "Número de série inválido. Por favor introduza um número de série entre 10000 e 99999"; break;
            case ERRO_NUM_SERIE_UTL: msg = "Número de série está a ser utilizado. Por favor introduza um número de série diferente"; break;
            case ERRO_FORMATO_DATA: msg = "Formato da data inválido! Por favor preencha a data com formato dd/mm/yyyy"; break;
            case ERRO_DATA_INVALIDA: msg = "Data inválida! Por favor preencha uma data posterior ou igual a 01/01/1970"; break;
            default: msg = "Um erro ocurreu!";
        }

        JOptionPane.showMessageDialog(this, msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtData = new javax.swing.JTextField();
        txtNumeroSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        btnAceitar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblUtilizador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtData.setName(""); // NOI18N

        jLabel1.setText("Data:");

        jLabel2.setText("Numero de Serie:");

        jLabel3.setText("Marca:");

        btnAceitar.setText("Aceitar");
        btnAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceitarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblUtilizador.setText("Utilizador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUtilizador)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroSerie)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUtilizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceitar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceitarActionPerformed
        DadosAplicacao appInst = DadosAplicacao.getInstance();
        if(txtData.getText().isEmpty() || txtNumeroSerie.getText().isEmpty())
            mostrarErro(ERRO_CAMPOS_VAZIOS);
        else {
            int numeroSerie = Integer.parseInt(txtNumeroSerie.getText());
            if(numeroSerie < 10000 || numeroSerie > 99999)
                mostrarErro(ERRO_NUM_SERIE_INV);
            else if(appInst.procurarNumeroSerie(numeroSerie))
                mostrarErro(ERRO_NUM_SERIE_UTL);
            else {
                try {
                    Data data = Data.parse(txtData.getText());
                    if(data.getCalendar().compareTo(new GregorianCalendar(1970,1,1)) < 0)
                        mostrarErro(ERRO_DATA_INVALIDA);
                    else
                    {
                        Veiculo v = new Veiculo(numeroSerie, (Marca) cbMarca.getSelectedItem(), data);
                        appInst.adicionarVeiculo(v);
                        fechar();
                    }
                } catch(IllegalArgumentException ex)
                {
                    mostrarErro(ERRO_FORMATO_DATA);
                }
            }
        }

    }//GEN-LAST:event_btnAceitarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fechar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceitar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Marca> cbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblUtilizador;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables
}