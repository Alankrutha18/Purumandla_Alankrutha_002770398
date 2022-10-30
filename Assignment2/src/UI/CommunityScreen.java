/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.City;
import Model.Community;
import Model.House;
import Model.MedSystem;
import Model.Person;
import Data.PersonDirectory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhema
 */
public class CommunityScreen extends javax.swing.JPanel {

    PersonDirectory persons_list;
    public CommunityScreen(PersonDirectory persons_list) {
        initComponents();
        this.persons_list = persons_list;
        populateCommunityData();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        txtUpdateCommunity = new javax.swing.JTextField();
        txtUpdateHouse = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        lblHouse = new javax.swing.JLabel();
        lblCommunity2 = new javax.swing.JLabel();
        lblHouse2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblCommunity.setText("Community");

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community", "House"
            }
        ));
        jScrollPane1.setViewportView(tblCommunity);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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

        btnModify.setText("Update");
        btnModify.setToolTipText("");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        lblHouse.setText("House");

        lblCommunity2.setText("Community");

        lblHouse2.setText("House");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCommunity)
                        .addGap(33, 33, 33)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblHouse)
                        .addGap(30, 30, 30)
                        .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnView))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCommunity2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUpdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnDelete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHouse2)
                                .addGap(50, 50, 50)
                                .addComponent(txtUpdateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModify)))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouse))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(txtUpdateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity2)
                    .addComponent(lblHouse2))
                .addContainerGap(483, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String community = txtCommunity.getText();
        String house = txtHouse.getText();
        
        Person per = persons_list.addNewPerson(house, new Community(community));
        per.setDisplayPerson(false);
        populateCommunityData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedrowindex = tblCommunity.getSelectedRow();
        if (selectedrowindex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        String selected_com = (String) model.getValueAt(selectedrowindex, 0);
        String selected_house = (String) model.getValueAt(selectedrowindex, 1);
        txtUpdateCommunity.setText(selected_com);
        txtUpdateHouse.setText(selected_house);
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        
        boolean duplicate_model = false;
        int selectedrowindex = tblCommunity.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        String selected_cm = (String) model.getValueAt(selectedrowindex, 0);
        String selected_house = (String) model.getValueAt(selectedrowindex, 1);
        boolean duplicate_community;
        duplicate_community = checkDuplicateCommunity(txtUpdateCommunity.getText());
        if (duplicate_community){
            JOptionPane.showMessageDialog(this, "Community with same name already exists");
            return;
        }
        for(Person per: persons_list.getPersons()){
            String personComm = per.getResidence().getCommunity().getCommunity();
            if(personComm.equals(selected_cm) && per.getResidence().getHouseNo().equals(selected_house)){
                
                House currHouse = per.getResidence();
                currHouse.setHouseNo(txtUpdateHouse.getText());
                Community comm = currHouse.getCommunity();
                comm.setCommunity(txtUpdateCommunity.getText());
            }
        }
        JOptionPane.showMessageDialog(this, "Community Info Modified successfully");
        populateCommunityData();
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                txtUpdateCommunity.setText("");
                txtUpdateHouse.setText("");
        int selectedrowindex = tblCommunity.getSelectedRow();
        if (selectedrowindex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        String selected_cm = (String) model.getValueAt(selectedrowindex, 0);
        String selected_house = (String) model.getValueAt(selectedrowindex, 1);
        ArrayList<Person> del_cm = new ArrayList<Person>();
        for (Person per : persons_list.getPersons()){
            String personComm = per.getResidence().getCommunity().getCommunity();
            if(personComm.equals(selected_cm) && per.isDisplayPerson() 
                    && per.getResidence().getHouseNo().equals(selected_house)){
                JOptionPane.showMessageDialog(this, "Community is in use, Please deleted the person associated with this community first");
                return;
            }
            else if (personComm.equals(selected_cm) && !per.isDisplayPerson()  
                    && per.getResidence().getHouseNo().equals(selected_house)){
                del_cm.add(per);
            }
        }
        for(Person delper: del_cm){
            persons_list.removePerson(delper);
          }
        JOptionPane.showMessageDialog(this, "Community Info Deleted Successfully");
        populateCommunityData();
       
    }//GEN-LAST:event_btnDeleteActionPerformed
                                                     
    private ArrayList<String> populateCommunityData() {
        
        ArrayList<String> cm_list = getCommunityList();
        ArrayList<String> house_list = getHouseList();
        
        DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
        model.setRowCount(0);
        for (int i = 0; i < cm_list.size(); i++){
            Object[] row = new Object [2];
            row[0] = cm_list.get(i);
            row[1] = house_list.get(i);
            model.addRow(row);
        }
        return cm_list;
    }

    private ArrayList<String> getCommunityList() {
        
        ArrayList<String> cm_list = new ArrayList<String>();
        for(Person per : persons_list.getPersons()){
            String personComm = per.getResidence().getCommunity().getCommunity();
            if(!(personComm == null || personComm.equals(""))){
                cm_list.add(personComm);
            }
        }
       return cm_list;
    }
    
    private ArrayList<String> getHouseList() {
        
        ArrayList<String> house_list = new ArrayList<String>();
        for(Person per : persons_list.getPersons()){
            String personComm = per.getResidence().getCommunity().getCommunity();
            String houseNo = per.getResidence().getHouseNo();
            if(!(personComm == null || personComm.equals(""))){
                house_list.add(houseNo);
            }
        }
       return house_list;
    }

    private boolean checkDuplicateCommunity(String cm_name) {
        
        for (Person per: persons_list.getPersons()){
            String personComm = per.getResidence().getCommunity().getCommunity();
            if (per.isDisplayPerson() && personComm.equals(cm_name)){
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnView;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunity2;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblHouse2;
    private javax.swing.JTable tblCommunity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtUpdateCommunity;
    private javax.swing.JTextField txtUpdateHouse;
    // End of variables declaration//GEN-END:variables
}
