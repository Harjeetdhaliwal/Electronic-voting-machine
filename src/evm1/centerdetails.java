/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evm1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class centerdetails extends javax.swing.JInternalFrame {
String Ccode,address,Dofficer;
    /**
     * Creates new form centerdetails
     */
    public centerdetails() {
        initComponents();
       userinfo();
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
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CENTER DETAILS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CENTER CODE", "CENTER ADDRESS", "DUTY OFFICER"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


 public void userinfo()
    {
        DefaultTableModel model;
        model = (DefaultTableModel)jTable1.getModel();
       // model.addTableModelListener(jTable1);
        model.addRow (new Object[] {Ccode,address,Dofficer});
                   Connection con;
            Statement stmt;
            ResultSet rs;
            
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom","root","a");
                stmt=(Statement)con.createStatement();
                String Query="select Ccode,address,Dofficer from CA";
                rs=(ResultSet) stmt.executeQuery(Query);
              // jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                int i=0; 
                while(rs.next())
                  {                  
                   jTable1.setValueAt(rs.getString(1),i,0);
                    jTable1.setValueAt(rs.getString(2),i,1);
                    jTable1.setValueAt(rs.getString(3),i,2);
                   i++;
                    model.addRow (new Object[] {Ccode,address,Dofficer});

                  }

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        

    
    }

    private void info() {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}



