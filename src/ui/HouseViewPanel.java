/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import models.CommunityStore;
import models.House;
import models.HouseStore;

/**
 *
 * @author sagred
 */
public class HouseViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseViewPanel
     */
    HouseStore houseStore;
    CommunityStore communityStore;
    public HouseViewPanel(HouseStore houseStore,
    CommunityStore communityStore) {
        initComponents();
        
        this.houseStore = houseStore;
        this.communityStore = communityStore;
        
         addDataToTableFromStore();
    }
    
    private void addDataToTableFromStore() {
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        model.setRowCount(0);

        for(House resource : houseStore.getStore()){
            
            Object[] row = new Object[11];
            row[0] = resource;
            row[1]= resource.getCommunityId();
            
            model.addRow(row);
            
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

        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResources = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        TextHouseId = new javax.swing.JTextField();
        TextCommunityId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View House");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("House Id");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House Id", "Community Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResources);
        if (tblResources.getColumnModel().getColumnCount() > 0) {
            tblResources.getColumnModel().getColumn(0).setResizable(false);
            tblResources.getColumnModel().getColumn(1).setResizable(false);
        }

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Community Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextHouseId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(TextCommunityId))
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(156, 156, 156))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        House resource =  (House) model.getValueAt(currentRowIndex, 0);

        resource.setHouseId(Integer.parseInt(TextHouseId.getText()));
        resource.setCommunityId(Integer.parseInt(TextCommunityId.getText()));

        JOptionPane.showMessageDialog(this,"Successfully updated");

        TextHouseId.setText("");
        TextCommunityId.setText("");

        addDataToTableFromStore();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        House currentResource =  (House) model.getValueAt(currentRowIndex, 0);

        TextHouseId.setText(String.valueOf(currentResource.getHouseId()));
        TextCommunityId.setText(String.valueOf(currentResource.getCommunityId()));

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        House currentResource =  (House) model.getValueAt(currentRowIndex, 0);

        houseStore.deleteResource(currentResource);

        JOptionPane.showMessageDialog(this, "Resource successfully deleted");

        addDataToTableFromStore();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCommunityId;
    private javax.swing.JTextField TextHouseId;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResources;
    // End of variables declaration//GEN-END:variables
}
