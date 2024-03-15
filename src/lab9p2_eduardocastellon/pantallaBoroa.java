package lab9p2_eduardocastellon;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pantallaBoroa extends javax.swing.JFrame {

    public pantallaBoroa() {
        initComponents();
        this.setLocationRelativeTo(null);
        setimageLabel(LB_cloudBackGround, "src/imagenes/cloud.png");
        HiloHoraFecha horaFecha = new HiloHoraFecha(LB_hora, LB_fecha);
        Thread proc = new Thread(horaFecha);
        proc.start();
        adminBarra = new barra(PB_barra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LB_hora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LB_fecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PN_subirArchivo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PN_guardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PB_barra = new javax.swing.JProgressBar();
        LB_valiBarra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_areaText = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        LB_cloudBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Bienvenido");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 66));

        LB_hora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LB_hora.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(LB_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Hora Actual:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha de Hoy:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        LB_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LB_fecha.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(LB_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 600));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Boroa Cloud");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 32, -1, -1));

        PN_subirArchivo.setForeground(new java.awt.Color(204, 204, 204));
        PN_subirArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_subirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_subirArchivoMouseClicked(evt);
            }
        });
        PN_subirArchivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Subir archivo");
        PN_subirArchivo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        jPanel3.add(PN_subirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, 40));

        PN_guardar.setForeground(new java.awt.Color(204, 204, 204));
        PN_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PN_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PN_guardarMouseClicked(evt);
            }
        });
        PN_guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Guardar");
        PN_guardar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 42));

        jPanel3.add(PN_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 100, 40));

        PB_barra.setMaximum(10000000);
        jPanel3.add(PB_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 340, 30));
        jPanel3.add(LB_valiBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, -1));

        TA_areaText.setColumns(20);
        TA_areaText.setRows(5);
        jScrollPane1.setViewportView(TA_areaText);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 520, 290));

        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Subir archivo");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 42));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, 40));
        jPanel3.add(LB_cloudBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 314, 760, 286));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 740, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PN_subirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_subirArchivoMouseClicked
        subirArchivo();
    }//GEN-LAST:event_PN_subirArchivoMouseClicked

    private void PN_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PN_guardarMouseClicked
        guardarArchivo();
    }//GEN-LAST:event_PN_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(pantallaBoroa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaBoroa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaBoroa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaBoroa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaBoroa().setVisible(true);
            }
        });
    }

    public void subirArchivo() {
        JFileChooser jfchooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Archivos de Texto", "txt");
        jfchooser.addChoosableFileFilter(filtro);
        int seleccion = jfchooser.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            LB_valiBarra.setText("Abriendo Archivo");
            adminBarra.start();
            
            if (PB_barra.getValue() == PB_barra.getMaximum()) {
                LB_valiBarra.setText("Archivo Abierto");
                try {

                    File file = null;
                    if (jfchooser.getFileFilter().getDescription().equals(
                            "Archivos de Texto")) {
                    file = new File(jfchooser.getSelectedFile().getPath() + ".txt");
                    } else {
                        file = jfchooser.getSelectedFile();
                    }
                    fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                    bw.write(TA_areaText.getText());
                    TA_areaText.setText("");
                    bw.flush();
                    JOptionPane.showMessageDialog(this,
                            "Archivo guardado");

                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    public void guardarArchivo() {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        TA_areaText.setText("");
        try {
            JFileChooser jfchooser = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                    "Archivos de Texto", "txt");
            jfchooser.setFileFilter(filtro);
            int seleccion = jfchooser.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {

                file = jfchooser.getSelectedFile();
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                TA_areaText.setText("");

                while ((linea = br.readLine()) != null) {
                    TA_areaText.append(linea);
                    TA_areaText.append("\n");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }

    public void setimageLabel(JLabel nomLabel, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nomLabel.getWidth(), nomLabel.getHeight(), Image.SCALE_DEFAULT));
        nomLabel.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_cloudBackGround;
    private javax.swing.JLabel LB_fecha;
    private javax.swing.JLabel LB_hora;
    private javax.swing.JLabel LB_valiBarra;
    private javax.swing.JProgressBar PB_barra;
    private javax.swing.JPanel PN_guardar;
    private javax.swing.JPanel PN_subirArchivo;
    private javax.swing.JTextArea TA_areaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
barra adminBarra;
}
