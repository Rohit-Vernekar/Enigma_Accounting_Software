/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma.accounting.software;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell1
 */
public class User_Page extends javax.swing.JFrame {
    public static int flag;
    public static String user;
    /**
     * Creates new form User_Page
     * @param f
     */
    public User_Page(int f) {
        initComponents();
        this.dispose();
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        flag=f;
        if(flag==1)
            jLabel5.setText("MODIFY USER");
        getContentPane().setBackground(Color.WHITE);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        
        jTextField1.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
        jPasswordField1.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
        jPasswordField2.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
        jComboBox1.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("LOGIN ID : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("PASSWORD : ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("ADMIN : ");

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("CONFIRM PASSWORD : ");

        jPasswordField1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jPasswordField2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1)
                    .addComponent(jPasswordField2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 176, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        Connection conn=MySqlConnect.ConnectDB();
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "This Field Cannot be Empty!");
            jTextField1.requestFocus();
        }
        else{
            try {
                String sql="SELECT * FROM LOGINID WHERE ID='" +jTextField1.getText() +"';";
                Statement s=conn.createStatement();
                ResultSet rs=s.executeQuery(sql);
                if(rs.next()){
                    if(flag==0){
                        JOptionPane.showMessageDialog(null,"This User-ID is already used.");
                        jTextField1.requestFocus();
                        jTextField1.selectAll();
                    }
                    else{
                        if(!jTextField1.getText().equals(user)){
                            JOptionPane.showMessageDialog(null,"This User-ID is already used.");
                            jTextField1.requestFocus();
                            jTextField1.selectAll();
                        }
                        else{
                            jPasswordField1.requestFocus();
                            jPasswordField1.selectAll();
                        }
                    }
                }
                else{
                    jPasswordField1.requestFocus();
                    jPasswordField1.selectAll();
                }
            } 
            catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        if(jPasswordField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "This Field Cannot be Empty!");
            jPasswordField1.requestFocus();
        }
        else{
            jPasswordField2.requestFocus();
            jPasswordField2.selectAll();
        }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        if(!jPasswordField2.getText().equals(jPasswordField1.getText())){
            JOptionPane.showMessageDialog(null,"Passwords do not Match!");
            jPasswordField1.requestFocus();
            jPasswordField1.selectAll();
        }
        else{
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Connection conn=MySqlConnect.ConnectDB();
            String ObjButtons[] = {"Yes","No"};
            if(flag==0){
                int PromptResult = JOptionPane.showOptionDialog(null,"Add User?","SAVE CHANGES?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION){
                    try{
                        String sql="INSERT INTO LOGINID VALUES (?,?,?);";
                        PreparedStatement ps=conn.prepareStatement(sql);
                        ps.setString(1, jTextField1.getText());
                        ps.setString(2, jPasswordField1.getText());
                        if(jComboBox1.getSelectedIndex()==1)
                            ps.setBoolean(3, true);
                        else
                            ps.setBoolean(3, false);
                        ps.executeUpdate();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    new User_Page(flag).setVisible(true);
                    this.dispose();
                }
                else{
                    jTextField1.requestFocus();
                    jTextField1.selectAll();
                }
            }
            else{
                int PromptResult = JOptionPane.showOptionDialog(null,"Modify User Details?","SAVE CHANGES?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION){
                    try{
                        String sql="UPDATE LOGINID SET ID=?,PASS=?,ADMIN=? WHERE ID=?;";
                        PreparedStatement ps=conn.prepareStatement(sql);
                        ps.setString(1, jTextField1.getText());
                        ps.setString(2, jPasswordField1.getText());
                        if(jComboBox1.getSelectedIndex()==1)
                            ps.setBoolean(3, true);
                        else
                            ps.setBoolean(3, false);
                        ps.setString(4,user);
                        ps.executeUpdate();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    new User_List().setVisible(true);
                    this.dispose();
                }
                else{
                    jTextField1.requestFocus();
                    jTextField1.selectAll();
                }
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            jPasswordField2.requestFocus();
            jPasswordField2.selectAll();
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            jPasswordField1.requestFocus();
            jPasswordField1.selectAll();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            jTextField1.requestFocus();
            jTextField1.selectAll();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            if(jTextField1.getText().isEmpty())
                this.dispose();
            else{
                String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null,"Exit Without Saving Changes?","EXIT?",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION){
                    this.dispose();
                }
                else{
                    jTextField1.requestFocus();
                    jTextField1.selectAll();
                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(User_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Page(flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JPasswordField jPasswordField2;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
