package admin;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class automatas extends javax.swing.JFrame {
    
    automata1 matriz[] = new automata1[5];

    public automatas() {
        initComponents();
        setLocationRelativeTo(null);
       // mostrar();
        mostrar1();
        mostrar2();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        LabelEq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
            },
            new String [] {
                "", "0", "1"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 110));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Tabla de estados: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 20));

        btnMinimizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMinimizar.setText("Minimiazar");
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 40));

        LabelEq.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(LabelEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        boolean eq= false;
        boolean eq1= false;
        int cont =0;
        
        ArrayList<automata1> afd = new ArrayList<>();
        for (int j = 0; j< matriz.length; j++) {
            for (int i = j+1; i < matriz.length; i++) {
                if (matriz[j].clase1.equals(matriz[i].clase1)){
                      eq=true;
                  }else{
                      eq=false;
                  }
                  if (matriz[j].clase2.equals(matriz[i].clase2)){
                      eq1=true;
                  }else{
                      eq1=false;
                  }
                  if(eq == true && eq1 == true){
                       System.out.println(matriz[j].estado + " es equivalante con: " + matriz[i].estado);
                       LabelEq.setText("\n" + matriz[j].estado + " es equivalante con: " + matriz[i].estado);
                       afd.add(new automata1(matriz[j], matriz[i], cont));
                       cont++;
                  }
            }
        }
        System.out.println(afd);
        
        for (int i = 0; i <matriz.length; i++) {
            for(int j=0; j<afd.size();j++){
                if((matriz[i].estado == afd.get(j).estado && matriz[i].estado == afd.get(j).eq) == false){
                    System.out.println("Ultimo estado");
                }
            }    
        }
         Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {afd.get(0).estado, afd.get(0).tr1, afd.get(0).tr2},
                {afd.get(1).estado, afd.get(1).tr1, afd.get(1).tr2},
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
            },
            new String [] {
                "", "0", "1"
            }
        ));
        

    }//GEN-LAST:event_btnMinimizarActionPerformed
  
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
            java.util.logging.Logger.getLogger(automatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(automatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(automatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(automatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new automatas().setVisible(true);
            }
        });
    }
    
    public void mostrar(){
        matriz[0] = new automata1("q0", "c0", "q1", "c0", "q2", "c0");
        matriz[1] = new automata1("q1", "c0", "q1", "c0", "q3", "c0");
        matriz[3] = new automata1("q3", "c0", "q1", "c0", "q4", "c1");
        matriz[4] = new automata1("q4", "c1", "q4", "c1", "q4", "c1");
        matriz[2] = new automata1("q2", "c0", "q1", "c0", "q4", "c1");
        
        
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {matriz[0].estado, matriz[0].tr1, matriz[0].tr2},
                {matriz[1].estado, matriz[1].tr1, matriz[1].tr2},
                {matriz[2].estado, matriz[2].tr1, matriz[2].tr2},
                {matriz[3].estado, matriz[3].tr1, matriz[3].tr2},
                {matriz[4].estado, matriz[4].tr1, matriz[4].tr2}
            },
            new String [] {
                "", "0", "1"
            }
        ));
    }
    public void mostrar1(){
        matriz[0] = new automata1("q0", "c0", "q1", "c0", "q2", "c0");
        matriz[1] = new automata1("q1", "c0", "q1", "c0", "q3", "c0");
        matriz[3] = new automata1("q3", "c0", "q1", "c0", "q4", "c1");
        matriz[4] = new automata1("q4", "c1", "q4", "c1", "q4", "c1");
        matriz[2] = new automata1("q2", "c0", "q1", "c0", "q4", "c1");
        
        
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {matriz[0].estado, matriz[0].tr1, matriz[0].tr2},
                {matriz[1].estado, matriz[1].tr1, matriz[1].tr2},
                {matriz[2].estado, matriz[2].tr1, matriz[2].tr2},
                {matriz[3].estado, matriz[3].tr1, matriz[3].tr2},
                {matriz[4].estado, matriz[4].tr1, matriz[4].tr2}
            },
            new String [] {
                "", "0", "1"
            }
        ));
    }
    public void mostrar2 (){
        matriz[0] = new automata1("q0", "c0", "q1", "c0", "q2", "c0");
        matriz[1] = new automata1("q1", "c0", "q1", "c0", "q3", "c0");
        matriz[3] = new automata1("q3", "c0", "q1", "c0", "q4", "c1");
        matriz[4] = new automata1("q4", "c1", "q4", "c1", "q4", "c1");
        matriz[2] = new automata1("q2", "c0", "q1", "c0", "q4", "c1");
        
        
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {matriz[0].estado, matriz[0].tr1, matriz[0].tr2},
                {matriz[1].estado, matriz[1].tr1, matriz[1].tr2},
                {matriz[2].estado, matriz[2].tr1, matriz[2].tr2},
                {matriz[3].estado, matriz[3].tr1, matriz[3].tr2},
                {matriz[4].estado, matriz[4].tr1, matriz[4].tr2}
            },
            new String [] {
                "", "0", "1"
            }
        ));
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEq;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
