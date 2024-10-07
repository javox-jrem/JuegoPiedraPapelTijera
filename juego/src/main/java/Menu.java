public class Menu extends javax.swing.JFrame {

    public String direc_historial=" ";
    public String direc_logros=" ";
    public String usuario=" ";
    public Menu() {
        initComponents();
    }
    
    public void setDirec_Historial(String direc_Historial) {
        this.direc_historial = direc_Historial;
    }

    public void setDirec_Logros(String direc_Logros) {
        this.direc_logros = direc_Logros;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        BT_jugar_pc = new javax.swing.JButton();
        BT_torneo = new javax.swing.JButton();
        BT_historial = new javax.swing.JButton();
        BT_logros = new javax.swing.JButton();
        BT_salir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        lbl_logo.setFont(new java.awt.Font("Imprint MT Shadow", 0, 40)); // NOI18N
        lbl_logo.setText("NIMBOR");

        BT_jugar_pc.setText("Jugar con la PC");
        BT_jugar_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_jugar_pcActionPerformed(evt);
            }
        });

        BT_torneo.setText("Modo Torneo");
        BT_torneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_torneoActionPerformed(evt);
            }
        });

        BT_historial.setText("Historial");
        BT_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_historialActionPerformed(evt);
            }
        });

        BT_logros.setText("Logros");
        BT_logros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_logrosActionPerformed(evt);
            }
        });

        BT_salir.setText("Salir");
        BT_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_logo)
                    .addComponent(BT_jugar_pc)
                    .addComponent(BT_torneo)
                    .addComponent(BT_historial)
                    .addComponent(BT_logros)
                    .addComponent(BT_salir))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BT_jugar_pc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_torneo)
                .addGap(18, 18, 18)
                .addComponent(BT_historial)
                .addGap(18, 18, 18)
                .addComponent(BT_logros)
                .addGap(18, 18, 18)
                .addComponent(BT_salir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_jugar_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_jugar_pcActionPerformed
        Juego_PC newframe=new Juego_PC();
        newframe.setUsuario(usuario);
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.setNum_partida(newframe.obtener_num_partida(direc_historial));
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_jugar_pcActionPerformed

    private void BT_torneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_torneoActionPerformed
        Iniciar_Sesion newframe=new Iniciar_Sesion();
        newframe.setUsuario1(usuario);
        newframe.setModo("Torneo");
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_torneoActionPerformed

    private void BT_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BT_salirActionPerformed

    private void BT_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_historialActionPerformed
        Historial newframe = new Historial();
        newframe.setDireccion(direc_historial);
        newframe.setUsuario(usuario);
        newframe.cargar_historial();
        newframe.transparencia_BT_salir();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_historialActionPerformed

    private void BT_logrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_logrosActionPerformed
        Logro aux=new Logro();
        Logros newframe=new Logros();
        newframe.setDireccion(direc_logros);
        newframe.mostrar_logros(aux.cargar_Logros(direc_logros));
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_logrosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_historial;
    private javax.swing.JButton BT_jugar_pc;
    private javax.swing.JButton BT_logros;
    private javax.swing.JButton BT_salir;
    private javax.swing.JButton BT_torneo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables
}
