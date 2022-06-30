import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Bill.java
 *
 * Created on Oct 6, 2017, 8:15:47 PM
 */

/**
 *
 * @author Bits
 */
public class Bill extends javax.swing.JFrame {

    /** Creates new form Bill */
    public Bill() {
        initComponents();
      US.setText(String.valueOf(tk.a).toString());
        Toolkit tk=getToolkit();
       Dimension size=tk.getScreenSize(); 
       setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    getContentPane().setBackground(new Color(0,153,225));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EN = new javax.swing.JTextField();
        US = new javax.swing.JTextField();
        PA = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24));
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 283, -1, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24));
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24));
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Enter Amount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));

        EN.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 178, 48));

        US.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        getContentPane().add(US, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, 52));
        getContentPane().add(PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 169, 61));

        jButton3.setFont(new java.awt.Font("Andalus", 1, 18));
        jButton3.setText("Check the remaining bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 144, 279, 42));

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 463, -1, 45));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 36));
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Pay the Bill");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 29, 285, 82));

        jButton2.setFont(new java.awt.Font("Angsana New", 0, 24));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 464, 105, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2d69ccec07403570361bc2df1dfd838f.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Pay1().setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer","root","root");
            String User=US.getText();
            String pass =PA.getText();
            int sum =Integer.parseInt(EN.getText());
            String sql="Update Buy set Balance=Balance+'"+-sum+"' where Username='"+User+"'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Amount submitted");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"error"+e.getMessage());}

    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Farmer_portal frm1=new Farmer_portal();
        frm1.setVisible(true);
        this.hide();        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EN;
    private javax.swing.JPasswordField PA;
    private javax.swing.JTextField US;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}