import java.io.*;
import java.util.Random;


public class Juego_PC extends javax.swing.JFrame {

    public int racha=0;
    public int num_partida=0;
    public String usuario="m";
    public String direc_historial="";
    public String direc_logros="";
    public Juego_PC() {
        initComponents();
    }

    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida+1;
    }
    
    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }

    public void setDirec_Logros(String direc_logros) {
        this.direc_logros = direc_logros;
    }
    public void setUsuario(String us){
        this.usuario=us;
        lbl_usuario.setText(us);
    }
    public void setRacha(int racha){
        this.racha=racha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_volver_al_menu = new javax.swing.JButton();
        BT_piedra = new javax.swing.JButton();
        BT_papel = new javax.swing.JButton();
        BT_tijeras = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT_volver_al_menu.setText("<");
        BT_volver_al_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_volver_al_menuActionPerformed(evt);
            }
        });

        BT_piedra.setText("piedra");
        BT_piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedraActionPerformed(evt);
            }
        });

        BT_papel.setText("papel");
        BT_papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papelActionPerformed(evt);
            }
        });

        BT_tijeras.setText("tijeras");
        BT_tijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijerasActionPerformed(evt);
            }
        });

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_mensaje.setText("Selecciona tu jugada");

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_usuario.setText("_________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BT_piedra)
                        .addGap(18, 18, 18)
                        .addComponent(BT_papel)
                        .addGap(18, 18, 18)
                        .addComponent(BT_tijeras))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BT_volver_al_menu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lbl_usuario)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_mensaje)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_volver_al_menu)
                .addGap(69, 69, 69)
                .addComponent(lbl_mensaje)
                .addGap(18, 18, 18)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_piedra)
                    .addComponent(BT_papel)
                    .addComponent(BT_tijeras))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_volver_al_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_volver_al_menuActionPerformed
        Menu newframe=new Menu();
        newframe.setUsuario(usuario);
        newframe.setDirec_Logros(direc_logros);
        newframe.setDirec_Historial(direc_historial);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_volver_al_menuActionPerformed

    private void BT_piedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedraActionPerformed
        juego_PC(1);
    }//GEN-LAST:event_BT_piedraActionPerformed

    private void BT_papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papelActionPerformed
        juego_PC(2);
    }//GEN-LAST:event_BT_papelActionPerformed

    private void BT_tijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijerasActionPerformed
        juego_PC(3);
    }//GEN-LAST:event_BT_tijerasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego_PC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_papel;
    private javax.swing.JButton BT_piedra;
    private javax.swing.JButton BT_tijeras;
    private javax.swing.JButton BT_volver_al_menu;
    private static javax.swing.JLabel lbl_mensaje;
    private static javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

    private int num_random() {
        Random rnd = new Random();
         return rnd.nextInt(3) + 1;
    }

    private String ganador(int usuario2, int usuario1) {
        if (usuario1==usuario2)
            return "Empate";
        if ((usuario1 == 1 &&  usuario2== 3)||(usuario1 == 2 && usuario2 == 1)||(usuario1 == 3 && usuario2 == 2))
            return "Ganaste";
        return "Perdiste";
    }

    private void juego_PC(int jugada) {
        int pc=num_random();
        String ganador=ganador(pc,jugada);
        if(ganador.equals("Ganador")){
            racha++;
        }else{
            racha=0;
        }
        Partida act=new Partida(num_partida,ganador);
        act.guardarHistorial(act, direc_historial);
        Logro aux=new Logro();
        
        Resultado_PC newframe=new Resultado_PC();
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.obtener_logro(aux.cargar_Logros(direc_logros), racha, num_partida);
        newframe.setUsuario(usuario);
        newframe.setJugada_PC(pc);
        newframe.setJugada_Usuario(jugada);
        newframe.setNum_partida(num_partida);
        newframe.setRacha(racha);
        newframe.setFinal_Partida(ganador);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }
    public int obtener_num_partida(String direc_historial) {
        File archivo=new File (direc_historial);
        String contenido="";
        int aux=-1;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
            contenido = lectura.readLine();
            aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return aux;
    }
}
