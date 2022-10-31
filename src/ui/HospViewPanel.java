/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Community;
import models.CommunityStore;
import models.Hospital;
import models.HospitalStore;

/**
 *
 * @author sagred
 */
public class HospViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospViewPanel
     */
    HospitalStore hospitalStore;
    CommunityStore communityStore;
    models.SystemAdmin systemAdmin;
    public HospViewPanel(HospitalStore hospitalStore,
    CommunityStore communityStore, models.SystemAdmin systemAdmin) {
        initComponents();
        
        this.hospitalStore = hospitalStore;
        this.communityStore = communityStore;
        this.systemAdmin = systemAdmin;
    
         addDataToTableFromStore();
    
    }

    private void addDataToTableFromStore() {
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        model.setRowCount(0);
        
        String communityIdInSystem = String.valueOf(systemAdmin.getCurrentCommunityId());
        String userInSystem = systemAdmin.getCurrentUser();
        String hospitalIdInSystem = String.valueOf(systemAdmin.getCurrentHospitalId());

        for(Hospital resource : hospitalStore.getStore()){
            
            Object[] row = new Object[11];
            row[0] = resource;
            row[1]= resource.getCommunityId();
            row[2] = resource.getName();
            
            if("Community Admin".matches(userInSystem)) {
                if(communityIdInSystem.matches(String.valueOf(resource.getCommunityId())) ) {
                       model.addRow(row);
                }
            } else if("Hospital Admin".matches(userInSystem)) {
                 if(hospitalIdInSystem.matches(String.valueOf(resource.getHospitalId())) ) {
                       model.addRow(row);
                }
            } else if("System Admin".matches(userInSystem)) {
                model.addRow(row);
                
            }
            
            
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResources = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        TextHospId = new javax.swing.JTextField();
        TextCommunityId = new javax.swing.JTextField();
        TextHospName = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Community Id");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" Name");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Hospital");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Id", "Community Id", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResources);
        if (tblResources.getColumnModel().getColumnCount() > 0) {
            tblResources.getColumnModel().getColumn(0).setResizable(false);
            tblResources.getColumnModel().getColumn(2).setResizable(false);
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

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hospital Id");

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
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextHospId)
                                .addComponent(TextCommunityId)
                                .addComponent(TextHospName)
                                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(TextHospId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSubmit)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Hospital currentResource =  (Hospital) model.getValueAt(currentRowIndex, 0);

        TextHospId.setText(String.valueOf(currentResource.getHospitalId()));
        TextCommunityId.setText(String.valueOf(currentResource.getCommunityId()));
        TextHospName.setText(currentResource.getName());
        TextPassword.setText(currentResource.getPassword());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Hospital currentResource =  (Hospital) model.getValueAt(currentRowIndex, 0);

        hospitalStore.deleteResource(currentResource);

        JOptionPane.showMessageDialog(this, "Resource successfully deleted");

        addDataToTableFromStore();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Hospital resource =  (Hospital) model.getValueAt(currentRowIndex, 0);

        resource.setHospitalId(Integer.parseInt(TextHospId.getText()));
        resource.setCommunityId(Integer.parseInt(TextCommunityId.getText()));

        resource.setName(TextHospName.getText());
        resource.setPassword(String.valueOf(TextPassword.getPassword()));

        JOptionPane.showMessageDialog(this,"Successfully updated");

        TextHospId.setText("");
        TextCommunityId.setText("");
        TextHospName.setText("");
        TextPassword.setText("");

        addDataToTableFromStore();
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCommunityId;
    private javax.swing.JTextField TextHospId;
    private javax.swing.JTextField TextHospName;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResources;
    // End of variables declaration//GEN-END:variables
}
