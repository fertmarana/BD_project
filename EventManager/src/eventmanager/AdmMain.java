/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;
import eventmanager.EventMain;
import java.util.ArrayList;
import java.util.List;
import eventmanager.Filter;
import eventmanager.ListFilter;
/**
 *
 * @author macbook
 */
public class AdmMain extends javax.swing.JFrame {
    //private JFrame jf = new JFrame()
    List<Filter> conditions = new ArrayList<Filter>();
    int listSize;
    String[] Seventos = new String[] {"Nome", "Data", "Preço", "Tipo", "Endereço", "Representante", "Decorador","Tema"};
    String[] Spessoas = new String[] {"Nome", "RG", "CPF", "Categoria", "Telefone", "Email", "Funcao","Turno", "CNPJAssociado", "Apelido"};
    String[] Satracoes = new String[] {"Nome", "Artista","Restrição de Idade"};
    String[] Sempresas = new String[] {"CNPJ","Nome Fantasia", "Tipo de Serviço","Telefone","Preço do Serviço","Email"};
    public String SelectedAtribute;
    public String SelectedKey;
    public String SelectedOperation;
// create a combo box with the fixed array:

    /**
     * Creates new form AdmMain
     */
    public AdmMain(List<Filter> list) {
        this.conditions = list;
        
        listSize = 0;
        initComponents();
        lAtributes.setVisible(false);
        cBoxAtributes.setVisible(false);
        lAdd.setVisible(false);
        lFilltF.setVisible(false);
        lOperation.setVisible(false);
        cBoxOperation.setVisible(false);
        lManual.setVisible(false);
        btnAdd.setVisible(false);
        tFKey.setVisible(false);
    }
    public AdmMain() {
        //this.conditions = list;
        
        //listSize = 0;
        initComponents();
        lAtributes.setVisible(false);
        cBoxAtributes.setVisible(false);
        lAdd.setVisible(false);
        lFilltF.setVisible(false);
        lOperation.setVisible(false);
        cBoxOperation.setVisible(false);
        lManual.setVisible(false);
        btnAdd.setVisible(false);
        tFKey.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btnAddEvent = new javax.swing.JButton();
        btnRemoveEvent = new javax.swing.JButton();
        btnAlterEvent = new javax.swing.JButton();
        btnSearchEvent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lAtributes = new javax.swing.JLabel();
        cBoxAtributes = new javax.swing.JComboBox<>();
        lFilltF = new javax.swing.JLabel();
        tFKey = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lAdd = new javax.swing.JLabel();
        lManual = new javax.swing.JLabel();
        bntManual = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lOperation = new javax.swing.JLabel();
        cBoxOperation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Administrador");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel4.setText("Eventos");

        btnAddEvent.setText("Adicionar Evento");
        btnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventActionPerformed(evt);
            }
        });

        btnRemoveEvent.setText("Remover Evento");
        btnRemoveEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEventActionPerformed(evt);
            }
        });

        btnAlterEvent.setText("Editar Evento");
        btnAlterEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterEventActionPerformed(evt);
            }
        });

        btnSearchEvent.setText("Acessar Evento");
        btnSearchEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddEvent)
                            .addComponent(btnRemoveEvent)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearchEvent)
                                    .addComponent(btnAlterEvent)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel4)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAddEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveEvent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterEvent)
                        .addGap(48, 48, 48)
                        .addComponent(btnSearchEvent)
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Eventos", jPanel2);

        jLabel2.setText("Buscar:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eventos", "Pessoas", "Atrações", "Empresas", "Alimentação" }));

        jLabel3.setText("Por:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eventos", "Pessoas", "Atrações", "Empresas", "Alimentação" }));

        lAtributes.setText("Atributos:");

        cBoxAtributes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lFilltF.setText("Preencha com a chave do atributo selecionado que deseja (use * para selecionar todas)");

        tFKey.setText("null");

        btnFilter.setText("Filtrar");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar à lista de filtros");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lAdd.setText("Item adicionado.");

        lManual.setText("Para saber como adicionar essa chave acesse manual.");

        bntManual.setText("Manual");
        bntManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntManualActionPerformed(evt);
            }
        });

        btnList.setText("Acessar Lista de Filtros");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");

        lOperation.setText("Escolha uma operação:");

        cBoxOperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AND", "OR" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(lAtributes))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnFilter)))
                        .addGap(18, 18, 18)
                        .addComponent(cBoxAtributes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnList)
                                    .addGap(62, 62, 62)
                                    .addComponent(btnSearch))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lManual)
                                    .addComponent(tFKey, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lFilltF)
                                    .addComponent(lAdd)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lOperation)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd)
                                .addGap(9, 9, 9)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bntManual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAtributes)
                    .addComponent(cBoxAtributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lFilltF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFKey, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(lOperation)
                    .addComponent(cBoxOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lManual)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntManual)
                    .addComponent(btnList)
                    .addComponent(btnSearch)))
        );

        jTabbedPane1.addTab("Buscas Avançadas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        
        int i;
       // jComboBox1.setEnabled(false);
       if(!conditions.isEmpty()){
        lOperation.setVisible(true);
        cBoxOperation.setVisible(true);
       }
        lFilltF.setVisible(true);
        lAtributes.setVisible(true);
        btnAdd.setVisible(true);
        tFKey.setVisible(true);
        cBoxAtributes.setVisible(true);
        
        lOperation.setVisible(true);
        cBoxOperation.setVisible(true);
        cBoxAtributes.removeAllItems();
        if(jComboBox2.getSelectedIndex()==0){
            for (i=0; i < 8; i++){
                cBoxAtributes.addItem(Seventos[i]);
            }
            
        } else if(jComboBox2.getSelectedIndex()==1){
            for (i=0; i < 10; i++){
                cBoxAtributes.addItem(Spessoas[i]);
            }
            
            
        } else if(jComboBox2.getSelectedIndex()==2){
                        for (i=0; i < 3; i++){
                cBoxAtributes.addItem(Satracoes[i]);
            }

            
        } else if(jComboBox2.getSelectedIndex()==3){
                        for (i=0; i < 6; i++){
                cBoxAtributes.addItem(Sempresas[i]);
            }

            
        }
        
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        System.out.printf("ANTES: %d",conditions.size());
        this.dispose();
        new ListFilter(conditions).setVisible(true);
        
    }//GEN-LAST:event_btnListActionPerformed

    private void bntManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntManualActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       // String s = 
       String op;
        String Search = jComboBox1.getSelectedItem().toString();
        System.out.printf("%s", Search);
        String Atribute = jComboBox2.getSelectedItem().toString();
        String Key = tFKey.getText();
        if(conditions.isEmpty()) {
           op = "-";
        }else{
            op = cBoxOperation.getSelectedItem().toString();
        }
        conditions.add(new Filter(Search, Atribute, Key, op));
        System.out.printf("%d",conditions.size());
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEventActionPerformed
        // TODO add your handling code here:
        new ExtEventConfiguration().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSearchEventActionPerformed

    private void btnAlterEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterEventActionPerformed

    private void btnRemoveEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveEventActionPerformed

    private void btnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventActionPerformed
        // TODO add your handling code here:
        new AddEvent().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEventActionPerformed

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
            java.util.logging.Logger.getLogger(AdmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntManual;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddEvent;
    private javax.swing.JButton btnAlterEvent;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemoveEvent;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchEvent;
    private javax.swing.JComboBox<String> cBoxAtributes;
    private javax.swing.JComboBox<String> cBoxOperation;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lAdd;
    private javax.swing.JLabel lAtributes;
    private javax.swing.JLabel lFilltF;
    private javax.swing.JLabel lManual;
    private javax.swing.JLabel lOperation;
    private javax.swing.JTextField tFKey;
    // End of variables declaration//GEN-END:variables
}
