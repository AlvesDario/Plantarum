/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Estoque;
import model.EstoqueDAO;
import services.DB;
/**
 *
 * @author 1050481723010
 */
public class main extends javax.swing.JFrame {

    GerarOrcamento frameorcamento;
    private String codigo, nomep, nomec, familia, origem, descricao, porte, distancia, tamanhoc, cor, floracao, qtd, preco;
    
    public void updateDetalhes(){//----------------------------------------------------------erro aqui----
        getRow();
//        System.out.println(a.getNome());
        lblNomeCientifico.setText(nomec);
        lblNomePopular.setText(nomep);
    }
    
    public void updateTabela(){//aqui
        limparTabela();//esse não
        EstoqueDAO edao = new EstoqueDAO();
        ArrayList<Estoque> lista = edao.lista();
        DefaultTableModel model = (DefaultTableModel)Tabela.getModel();
        Object[] linha = new Object[12];
        for(int i = 0; i<lista.size();i++){
            linha[0]=lista.get(i).getCod();
            linha[1]=lista.get(i).getNome();
            linha[2]=lista.get(i).getNcientifico();
            linha[3]=lista.get(i).getFamilia();
            linha[4]=lista.get(i).getOrigem();
            linha[5]=lista.get(i).getPorte();
            linha[6]=lista.get(i).getDisplantio();
            linha[7]=lista.get(i).getTamcova();
            linha[8]=lista.get(i).getCor();
            linha[9]=lista.get(i).getFloracao();
            linha[10]=lista.get(i).getQtd();
            linha[11]=lista.get(i).getPreco();
            model.addRow(linha);
        }
    }
    
    public void getRow(){//-----------------------------------------------------não sei se funciona----
        int linha = Tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        try{
            codigo = model.getValueAt(linha, 0).toString();
            nomep = model.getValueAt(linha, 1).toString();
            nomec = model.getValueAt(linha, 2).toString();
            familia = model.getValueAt(linha, 3).toString();
            origem = model.getValueAt(linha, 4).toString();
//            descricao = model.getValueAt(linha, 0).toString();
            porte = model.getValueAt(linha, 5).toString();
            distancia = model.getValueAt(linha, 6).toString();
            tamanhoc = model.getValueAt(linha, 7).toString();
            cor = model.getValueAt(linha, 8).toString();
            floracao = model.getValueAt(linha, 9).toString();
            qtd = model.getValueAt(linha, 10).toString();
            preco = model.getValueAt(linha, 11).toString();
        }catch(Exception e){}
    }

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        updateTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lbp1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOrigem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAddOrcamento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNomePopular = new javax.swing.JLabel();
        lblNomeCientifico = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mniVendedor = new javax.swing.JMenuItem();
        mniCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniEstoque = new javax.swing.JMenuItem();
        mniOrcamentos = new javax.swing.JMenuItem();
        mniVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plantarum");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar");

        txtCod.setToolTipText("Codigo");

        lbp1.setText("Codigo");

        lblNome.setText("Nome");

        jLabel5.setText("Origem");

        jLabel6.setText("Cor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCod, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbp1)
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOrigem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(lbp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "nome", "nome cientifico", "familia", "origem", "porte", "distancia plantio", "tamanho cova", "cor", "floracao", "qtd", "preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ESTOQUE");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAddOrcamento.setText("Adicionar ao Orcamento");
        btnAddOrcamento.setEnabled(false);
        btnAddOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrcamentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detalhes");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("img");

        lblNomePopular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomePopular.setText("Nome Popular");

        lblNomeCientifico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeCientifico.setText("Nome Científico");

        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descricao");
        lblDescricao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomePopular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeCientifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomePopular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeCientifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddOrcamento)
                .addContainerGap())
        );

        jMenu3.setText("Pessoas");

        mniVendedor.setText("Vendedor");
        mniVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVendedorActionPerformed(evt);
            }
        });
        jMenu3.add(mniVendedor);

        mniCliente.setText("Cliente");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        jMenu3.add(mniCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Flora");

        mniEstoque.setText("Editar estoque");
        mniEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstoqueActionPerformed(evt);
            }
        });
        jMenu4.add(mniEstoque);

        mniOrcamentos.setText("Orcamentos");
        mniOrcamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOrcamentosActionPerformed(evt);
            }
        });
        jMenu4.add(mniOrcamentos);

        mniVendas.setText("Vendas");
        mniVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVendasActionPerformed(evt);
            }
        });
        jMenu4.add(mniVendas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVendasActionPerformed
        // TODO add your handling code here:
        new FrameVenda().setVisible(true);
    }//GEN-LAST:event_mniVendasActionPerformed

    private void mniVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVendedorActionPerformed
        // TODO add your handling code here:
        new FrameVendedor().setVisible(true);
        
    }//GEN-LAST:event_mniVendedorActionPerformed

    private void btnAddOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrcamentoActionPerformed
        // TODO add your handling code here:
        try{
            if(frameorcamento==null){
                frameorcamento = new GerarOrcamento();//colocar código no parentese----
                frameorcamento.setVisible(true);
            }
            frameorcamento.addProduto(Integer.parseInt(codigo), nomep, Float.parseFloat(preco),1);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAddOrcamentoActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // TODO add your handling code here:
        
        if(!btnAddOrcamento.isEnabled()){
            btnAddOrcamento.setEnabled(true);
        }
        updateDetalhes();
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void mniEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstoqueActionPerformed
        // TODO add your handling code here:
         new EditarEstoque().setVisible(true);       
    }//GEN-LAST:event_mniEstoqueActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(txtCod.getText().isEmpty()
                && txtNome.getText().isEmpty()
                && txtOrigem.getText().isEmpty()
                && txtCor.getText().isEmpty()){
            updateTabela();//esse é útil
        }
        else{
            limparTabela();
            String sql = "SELECT [cod_planta], [nome_planta], [ncientifico_planta], "
                    + "[familia_planta], [origem_planta], "
                    + "[porte_planta], [displantio_planta], [tamcova_planta], "
                    + "[cor_planta], [floracao_planta], [qtdestoque_planta], "
                    + "[preco_planta] FROM [dbo].[estoque] "
                    + "WHERE ";
            sql += "[cod_planta] like '%"+txtCod.getText()+"%' and";
            sql += "[nome_planta] like '%"+txtNome.getText()+"%' and";
            sql += "[origem_planta] like '%"+txtOrigem.getText()+"%' and";
            sql += "[cor_planta] like '%"+txtCor.getText()+"%'";
            DB bd = new DB();
            bd.getConnection();
            try{
                bd.st = bd.con.prepareStatement(sql);
                bd.rs = bd.st.executeQuery();
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                Object[] linha = new Object[12];
                while(bd.rs.next()){
                    linha[0]=bd.rs.getInt(1);
                    linha[1]=bd.rs.getString(2);
                    linha[2]=bd.rs.getString(3);
                    linha[3]=bd.rs.getString(4);
                    linha[4]=bd.rs.getString(5);
                    linha[5]=bd.rs.getFloat(6);
                    linha[6]=bd.rs.getFloat(7);
                    linha[7]=bd.rs.getFloat(8);
                    linha[8]=bd.rs.getString(9);
                    linha[9]=bd.rs.getString(10);
                    linha[10]=bd.rs.getInt(11);
                    linha[11]=bd.rs.getFloat(12);
                    model.addRow(linha);
                }
            }catch(SQLException e){System.out.println(e.toString());}
            finally{
                bd.close();
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mniOrcamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOrcamentosActionPerformed
        // TODO add your handling code here:
        new FrameOrcamento().setVisible(true);
    }//GEN-LAST:event_mniOrcamentosActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        // TODO add your handling code here:
        new FrameCliente().setVisible(true);
    }//GEN-LAST:event_mniClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAddOrcamento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeCientifico;
    private javax.swing.JLabel lblNomePopular;
    private javax.swing.JLabel lbp1;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniEstoque;
    private javax.swing.JMenuItem mniOrcamentos;
    private javax.swing.JMenuItem mniVendas;
    private javax.swing.JMenuItem mniVendedor;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOrigem;
    // End of variables declaration//GEN-END:variables

    private void limparTabela() {
        DefaultTableModel model = (DefaultTableModel)Tabela.getModel();
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
    }
}