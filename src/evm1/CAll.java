/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evm1;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class CAll extends javax.swing.JInternalFrame {

    /**
     * Creates new form CAll
     */
    public CAll() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CENTER ALLOTMENT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CENTER ADDRESS");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("CENTER CODE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("VOTER ID");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "S3035", "S3038", "S2021", "S4045", "S3078" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jTextField1.setText("");
        jComboBox1.setSelectedItem("SELECT");
        jTextArea1.setText("");



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        java.sql.Connection con;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom", "root", "a");
            st = (Statement) con.createStatement();

            String Query = " select  vid,code,address from CD where vid like  '" + jTextField1.getText() + "' ";
            rs = st.executeQuery(Query);
            while (rs.next()) {
                jTextField1.setText(rs.getString(1));
                jComboBox1.setSelectedItem(rs.getString(2));
                jTextArea1.setText(rs.getString(3));

            }




        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Connection con;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom", "root", "a");
            st = (Statement) con.createStatement();
            String Query = " delete from CD where vid like '" + jTextField1.getText() + "' ";
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "DATA DELETED SUCCESSFULLY");
            jTextField1.setText(" ");
            jComboBox1.setSelectedItem("SELECT");
            jTextArea1.setText("");



        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        Connection con;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom", "root", "a");
            st = (Statement) con.createStatement();

            String Query = " update CD set vid = '" + jTextField1.getText() + "' , code = '" + jComboBox1.getSelectedItem() + "',  address = '" + jTextArea1.getText() + "'   where  vid like '" + jTextField1.getText() + "'";
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "DATA UPDATED SUCCESSFULLY");
            jTextField1.setText(" ");
            jComboBox1.setSelectedItem("SELECT");
            jTextArea1.setText("");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        
        
        
             String r=String.valueOf( jComboBox1.getSelectedItem());
       
      if (jComboBox1.getSelectedItem()=="S3035")
      {
          jTextArea1.setText("Arya Girls Higher Sec. School,Ludhiana");
      }
      else if (jComboBox1.getSelectedItem()=="S3038")
      {
           jTextArea1.setText("Municipal Corporation,New Building,Ludhiana");
      }
    else  if (jComboBox1.getSelectedItem()=="S2021")
      {
           jTextArea1.setText("S.D.P Model Sen. Sec. School,Ludhiana");
      }
        else  if (jComboBox1.getSelectedItem()=="S4045")
      {
           jTextArea1.setText("Govi. Primary School Iqbal Gnaj,Ludhiana");
      }
        else  if (jComboBox1.getSelectedItem()=="S3078")
      {
           jTextArea1.setText("Airwing Christian High School,Ludhiana");
      }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        if("".equals(jTextField1.getText()))
        {
            JOptionPane.showMessageDialog(this,"ENTER VOTER ID");
        }
        else if("SELECT".equals(jComboBox1.getSelectedItem()))
                {
                    JOptionPane.showMessageDialog(this,"SELECT CODE");
                }
        else if("".equals(jTextArea1.getText()))
        {
            JOptionPane.showMessageDialog(this,"ENTER ADDRESS");
        }
       else
        {
         Connection con;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom", "root", "a");
            st = (Statement) con.createStatement();
            String Query = " insert into CD(vid,code,address) values('" + jTextField1.getText() + "' ,  '" + jComboBox1.getSelectedItem() + "',  '" + jTextArea1.getText() + "' )";
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(this, "DATA INSERTED SUCCESSFULLY");
            jTextField1.setText(" ");
            jComboBox1.setSelectedItem("SELECT");
            jTextArea1.setText("");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
