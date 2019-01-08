/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Orcamento;
import model.OrcamentoDAO;
import services.DB;

/**
 *
 * @author Dario
 */
public class FrameVenda extends javax.swing.JFrame {
    
    int linha =1;
    
    public void limparTabela1(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while(jTable1.getRowCount()>0){
            model.removeRow(0);
        }
    }
    public void limparTabela(){
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        while(Tabela.getRowCount()>0){
            model.removeRow(0);
        }
    }
    
    /**
     * Creates new form Cliente
     */
    public FrameVenda() {
        initComponents();
        setValues();
        updateTabela();
    }

    public void setValues(){
        DB bd = new DB();
        bd.getConnection();
        String sql = "Select cod_vendedor from vendedor";
        try{
            bd.st = bd.con.prepareStatement(sql);
            bd.rs = bd.st.executeQuery();
            while(bd.rs.next()){
                cbVendedor.addItem(bd.rs.getString(1));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        sql = "select cod_cliente from cliente";
        try{
            bd.st = bd.con.prepareStatement(sql);
            bd.rs = bd.st.executeQuery();
            while(bd.rs.next()){
                cbCliente.addItem(bd.rs.getString(1));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        bd.close();
    }
    
    public void updateTabela(){
        OrcamentoDAO odao = new OrcamentoDAO();
        ArrayList<Orcamento> lista = odao.lista(true);
        DefaultTableModel model = (DefaultTableModel)Tabela.getModel();
        Object[] linha = new Object[4];
        for(int i = 0; i<lista.size();i++){
            linha[0]=lista.get(i).getCod();
            linha[1]=lista.get(i).getData();
            linha[2]=lista.get(i).getVen();
            linha[3]=lista.get(i).getCli();
            model.addRow(linha);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbVendedor = new javax.swing.JComboBox<>();
        cbCliente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "data", "vendedor", "cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Data");

        jLabel2.setText("Vendedor");

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente");

        cbVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor" }));

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnProcurar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnProcurar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "produtos", "quantidade", "preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:
        String vendedor, cliente;
        if(cbVendedor.getSelectedItem().equals("Vendedor"))
            vendedor = "";
        else 
            vendedor = cbVendedor.getSelectedItem().toString();
        if(cbCliente.getSelectedItem().equals("Cliente"))
            cliente = "";
        else
            cliente = cbCliente.getSelectedItem().toString();
        
        if(txtData.getText().isEmpty()&&vendedor.isEmpty()&&cliente.isEmpty()){
            updateTabela();
        }
        else{
            limparTabela();
            String sql = "SELECT [cod_orcamento], [data_orcamento], [fk_vendedor], "
                    + "[fk_cliente], [venda] FROM [dbo].[orcamento]"
                    + "WHERE venda=1 and ";
            sql+= "[data_orcamento] like '"+txtData.getText()+"%' and ";
            sql+= "[fk_vendedor] like '"+vendedor+"%' and ";
            sql += "[fk_cliente] like '"+cliente+"%'";
            DB bd = new DB();
            bd.getConnection();
            try{
                System.out.println(sql);
                bd.st = bd.con.prepareStatement(sql);
                bd.rs = bd.st.executeQuery();
//                --------------------------------------------------------parei aqui---------------------
                DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
                Object[] i = new Object[6];
                while (bd.rs.next()) {
                    i[0] = bd.rs.getInt(1);
                    i[1] = bd.rs.getString(2);
                    i[2] = bd.rs.getInt(3);
                    i[3] = bd.rs.getInt(4);
                    i[4] = bd.rs.getInt(5);
                    i[5] = bd.rs.getBoolean(6);
                    model.addRow(i);
                }
            }catch(SQLException e){System.out.println(e.toString());}
            finally{
                bd.close();
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // TODO add your handling code here:
        linha = Tabela.getSelectedRow();
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        DB bd = new DB();
        bd.getConnection();
        String sql = "SELECT [fk_planta], [qtdprod_iorcamento], "
                + "[preco_iorcamento] FROM [dbo].[item_orcamento] "
                + "WHERE ";
        sql+= "[fk_orcamento] like '"+Tabela.getValueAt(linha, 0)+"'";
        try{
            bd.st = bd.con.prepareStatement(sql);
            bd.rs = bd.st.executeQuery();
            Object[] i = new Object[3];
            limparTabela1();
            while(bd.rs.next()){
                i[0] = bd.rs.getInt(1);
                i[1] = bd.rs.getInt(2);
                i[2] = bd.rs.getDouble(3);
                model1.addRow(i);
            }
        }catch(SQLException e){System.out.println(e.toString());}
    }//GEN-LAST:event_TabelaMouseClicked

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
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
