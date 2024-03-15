package lab9p2_eduardocastellon;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class barra extends Thread {

    private JProgressBar barra;
    private JTextArea area;
    private boolean on;
    private File archivo = null;

    public barra(JProgressBar barra, JTextArea area) {
        this.barra = barra;
        this.area = area;
        this.on = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public void run() {
        while (on) {
            barra.setValue(barra.getValue() + 1);
            if (barra.getValue() == 10000000) {
                on = false;
                try {
                    FileReader fr = null;
                    BufferedReader br = null;
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    area.setText("");

                    while ((linea = br.readLine()) != null) {
                        area.append(linea);
                        area.append("\n");
                    }
                    br.close();
                    fr.close();
                } catch (IOException e) {

                }
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {

            }
        }
    }

}
