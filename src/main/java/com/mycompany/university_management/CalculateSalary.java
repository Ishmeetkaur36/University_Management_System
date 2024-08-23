/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.university_management;

import com.mycompany.university_management.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author gr
 */
public class CalculateSalary extends javax.swing.JFrame {
        ArrayList<String> fList=new ArrayList<>();
        ArrayList<Integer> idsList=new ArrayList<>();
        ArrayList<String> nameList=new ArrayList<>();
    /**
     * Creates new form CalculateSalary
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public CalculateSalary() throws ClassNotFoundException, SQLException {
        initComponents();
        fetchFacultyList();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbFaculty = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        jComboBoxdepartment = new javax.swing.JComboBox<>();
        jComboBoxrole = new javax.swing.JComboBox<>();
        lbbonus = new javax.swing.JTextField();
        jTextFielddays = new javax.swing.JTextField();
        jTextFieldsalary = new javax.swing.JTextField();
        jTextFieldremarks = new javax.swing.JTextField();
        jButtonsubmit = new javax.swing.JButton();
        jButtonsubmit1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(808, 538));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 228, 227), 15));

        jPanel2.setBackground(java.awt.SystemColor.control);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setText("CALCULATE  SALARY");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Department");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Role");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("No.of days");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setText("Total Salary");

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setText("Month");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel17.setText("Remarks");

        cbFaculty.setBackground(java.awt.SystemColor.controlHighlight);
        cbFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFacultyActionPerformed(evt);
            }
        });

        cbMonth.setBackground(java.awt.SystemColor.controlHighlight);
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janurary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        jComboBoxdepartment.setBackground(java.awt.SystemColor.controlHighlight);
        jComboBoxdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Electronics", "Mechanical", "Electrical", "Civil", "Business", "Accounts", "Animation", "Marketing", "Economics", "Library Science" }));
        jComboBoxdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdepartmentActionPerformed(evt);
            }
        });

        jComboBoxrole.setBackground(java.awt.SystemColor.controlHighlight);
        jComboBoxrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Assistant Professor", "Head", "Clerk", "Librarian", " ", " ", " " }));

        lbbonus.setBackground(java.awt.SystemColor.controlHighlight);

        jTextFielddays.setBackground(java.awt.SystemColor.controlHighlight);
        jTextFielddays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddaysActionPerformed(evt);
            }
        });

        jTextFieldsalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextFieldremarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextFieldremarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldremarksActionPerformed(evt);
            }
        });

        jButtonsubmit.setBackground(new java.awt.Color(0, 0, 0));
        jButtonsubmit.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButtonsubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsubmit.setText("CALCULATE");
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });

        jButtonsubmit1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonsubmit1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButtonsubmit1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsubmit1.setText("SUBMIT");
        jButtonsubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmit1ActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 51));

        cancel.setBackground(java.awt.SystemColor.controlHighlight);
        cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        cancel.setText("x");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel18.setText("Bonus %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(204, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(cancel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonsubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel15)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldremarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(65, 65, 65))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbMonth, 0, 163, Short.MAX_VALUE)
                                            .addComponent(cbFaculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFielddays))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jComboBoxrole, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbbonus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(361, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbbonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielddays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(241, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxdepartmentActionPerformed

    private void jTextFielddaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddaysActionPerformed

    private void jTextFieldremarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldremarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldremarksActionPerformed

    private void cbFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFacultyActionPerformed
       error.setText("");
        Integer i = cbFaculty.getSelectedIndex();
        int selectedId = idsList.get(i);
        String selectedName = nameList.get(i);
        String id = String.valueOf(selectedId);
        //jTextFieldname.setText(selectedName);
       // jTextFieldid.setText(id);
        
        String sql = "select * from faculty where id = ?";
            
        Connection conn;
        try {
            conn = ConnectionUtil.getInstance();
            PreparedStatement  pst = conn.prepareStatement(sql);
            pst.setInt(1, selectedId);
            ResultSet rs = pst.executeQuery();
             
            if(rs.next())
            {
                String department = rs.getString("department");
                String role = rs.getString("role");   
         
                jComboBoxdepartment.setSelectedItem(department);
                jComboBoxrole.setSelectedItem(role);
                
                
            }} catch (ClassNotFoundException ex) {         
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            }         
    }//GEN-LAST:event_cbFacultyActionPerformed

            
    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed
             
        if(jTextFielddays.getText().isEmpty())
        {
            error.setVisible(true);
            error.setText("Enter no of days");
        }
        else
        {
            try {
                error.setText("");
                Integer i=cbFaculty.getSelectedIndex();
                int selectedId=idsList.get(i);
                String sql="select * from faculty where id=?";
                
                
                
                Connection conn = ConnectionUtil.getInstance();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, selectedId);
                ResultSet rs = pst.executeQuery();
                
                if(rs.next())
                {
                    int salary=rs.getInt("salary");
                    int days=Integer.parseInt(jTextFielddays.getText());
                    int month;
                    int cbM=cbMonth.getSelectedIndex();
                    month = switch (cbM)
                    {
                        case 0, 2, 4, 6, 7, 9, 11 -> 31;
                        case 1 -> 28;
                        default -> 30;
                    };
                    float perDaySalary=salary/days;
                    float totalSalary=(salary/30)*days;
                 
                    if(!lbbonus.getText().isEmpty())
                    {
                        float bonus=Float.parseFloat(lbbonus.getText());
                        totalSalary= totalSalary + (totalSalary * (bonus/100));
                        
                        
                    }
                    jTextFieldsalary.setText(totalSalary+" ");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }//GEN-LAST:event_jButtonsubmitActionPerformed

    private void jButtonsubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmit1ActionPerformed
            try {
                String sql="INSERT INTO salary(id,name,totalSalary,remarks,bonus,days,month) values(?,?,?,?,?,?,?) ";
                Connection conn=ConnectionUtil.getInstance();
                
                PreparedStatement pst=conn.prepareStatement(sql);
                
//                String sql2="fetch * from faculty where id=?";
//                PreparedStatement pst2=conn.prepareStatement(sql2);
//                ResultSet rs=pst2.executeQuery();
//                
//                if(rs.next())
//                {
                   String selectedId=(String)cbFaculty.getSelectedItem();
                   String id=selectedId.split("-")[0];
                   String selectedName = (String) cbFaculty.getSelectedItem();
                   String[] parts = selectedName.split("-");
                   String name = parts.length > 1 ? parts[1].trim() : "";
//                pst.setString(1,rs.getString("id"));
                 pst.setString(1,id);
                 pst.setString(2,name);
                pst.setString(3,jTextFieldsalary.getText());
                pst.setString(4,jTextFieldremarks.getText());
                pst.setString(5,lbbonus.getText());
                pst.setString(6,jTextFielddays.getText());
                pst.setString(7,(String)cbMonth.getSelectedItem());
                
                int a=pst.executeUpdate();
            if(a>0)
               
                {
                    error.setText("Added Successfully");
                }
                else
                {
                    error.setText("Error incurred");
                }//}
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_jButtonsubmit1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        AdminLogin ad=new AdminLogin();
       ad.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new CalculateSalary().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CalculateSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cbFaculty;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JButton jButtonsubmit1;
    private javax.swing.JComboBox<String> jComboBoxdepartment;
    private javax.swing.JComboBox<String> jComboBoxrole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFielddays;
    private javax.swing.JTextField jTextFieldremarks;
    private javax.swing.JTextField jTextFieldsalary;
    private javax.swing.JTextField lbbonus;
    // End of variables declaration//GEN-END:variables

    private void fetchFacultyList() throws ClassNotFoundException, SQLException
    {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      Connection conn=ConnectionUtil.getInstance();

      if(conn==null)
       {
         System.out.println("Connection Error");
           }
       else
       {
          System.out.println("Connection established");  
        }
      
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from faculty");

        while(rs.next())
        {
           idsList.add(rs.getInt("id"));
           nameList.add(rs.getString("name"));
           fList.add(rs.getInt("id")+"-"+rs.getString("name"));
           
         }
        String [] arr = new String[fList.size()];
            int i=0;
            for(String item :fList)
            {
                arr[i]= item;
                i++;
            }
         ComboBoxModel model = new DefaultComboBoxModel(arr);
         cbFaculty.setModel(model);

}}

    
