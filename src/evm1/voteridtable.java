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
 * @author Dell,
 */
public final class voteridtable extends javax.swing.JInternalFrame {
String Vid, name, area,age, gender;
    /**
     * Creates new form voteridtable
     */
    public voteridtable() {
        initComponents();
        update();
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
        setTitle("VOTER DETAILS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VOTER ID", "NAME", "AREA", "AGE", "GENDER"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

 public void update()
    {
        DefaultTableModel model;
        model = (DefaultTableModel)jTable1.getModel();
       // model.addTableModelListener(jTable1);
        model.addRow (new Object[] { Vid, name, area, age, gender});
                   Connection con;
            Statement stmt;
            ResultSet rs;
           try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evom","root","a");
                stmt=(Statement)con.createStatement();
                String Query="select Vid, name, area, age, gender  from MP ";
                rs=(ResultSet) stmt.executeQuery(Query);
              // jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                int i=0; 
                while(rs.next())
                  {                  
                   jTable1.setValueAt(rs.getString(1),i,0);
                    jTable1.setValueAt(rs.getString(2),i,1);
                    jTable1.setValueAt(rs.getString(3),i,2);
                    jTable1.setValueAt(rs.getString(4),i,3);
                    jTable1.setValueAt(rs.getString(5),i,4);
                    i++;
                    model.addRow (new Object[] { Vid, name, area, age, gender});
                  }
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
     }
}
