/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evm1;

/**
 *
 * @author Dell
 */
public class votersinst extends javax.swing.JInternalFrame {

    /**
     * Creates new form votersinst
     */
    public votersinst() {
        initComponents();
        jTextArea1.setEnabled(false);
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
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INSTRUCTIONS FOR VOTERS");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" What is the process of voting? How do you go about it? \n1 The poll date and hours are fixed by the Election Commission India \nand they are well publicized before all elections. \n2 When you reach the polling station, entry will be regulated by queues. \nThere will be separate queues for men and women voters and the physically \nhandicapped persons. The persons who enforce the queues will allow 3-4 \nvoters into the polling station at a time. Physically handicapped voters and \nwomen voters with babies in arm will be given precedence over the other \nvoters in the queue. \n3 Stage 1: When you enter the polling station, you will go to the First \nPolling Officer who is in-charge of the marked copy of the electoral roll and \nresponsible for identification of electors. You should keep your identity \ndocument ready to show to the First Polling Officer. You can also show to him \nthe unofficial identity slip giving your particulars. However, you should note \nthat unofficial identity slip only helps in locating your name in the electoral roll \nbut is not a guarantee of your identification. The First Polling Officer will then \ncall out your name and serial number so that the polling agents become \naware of your presence and your identity is not challenged.  6\n4 Stage 2: Thereafter, if your identity is not challenged, you will \nproceed to the Second Polling Officer who will mark your left forefinger with \nthe indelible ink. Thereafter, he will proceed to record your serial number in \nthe electoral roll in the Register of Voters. Once this is recorded, you are to \nsign in the appropriate column in the Register of Voters. If a voter cannot sign, \nhis/her thumb impression will be obtained. The Second Polling Officer will \nthen give you a signed voter???s slip which will record your serial number in the \nregister of voters and your serial number in the electoral roll. \n5 Stage 3: You will then proceed to the Third Polling Officer who will \ntake the voter???s slip issued to you by the Second Polling Officer. The Third \nPolling Officer will press the \"Ballot\" button on the Control Unit of voting \nmachine and direct you to the voting compartment where you will record your \nvote on the balloting unit of the voting machine. Please note that each voter \nwill proceed to the voting compartment in exactly the same sequence in which \nhis/her serial number is recorded in the voters??? register. \n6 Stage 4: Voting Procedure. \n??? Inside the voting compartment, you are to press the blue candidate button \non the Balloting Unit against the name and symbol of the candidate of your \nchoice. \n??? Press the button only once. \n??? On the candidate button being pressed, the red lamp will glow against the \nname and symbol of that candidate. \n??? There will also be a beep sound heard to indicate that your vote has been \nrecorded and the Busy lamp goes off in the Control Unit. \n??? This process is repeated for other voters till end of the poll. \n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
