
package lab9p2_eduardocastellon;

import java.awt.TextArea;
import javax.swing.JProgressBar;


public class barra extends Thread{
   private JProgressBar barra;
   private TextArea area;
   private boolean on;
   
   public barra(JProgressBar barra, TextArea area){
       this.barra=barra;
       this.area=area;
       this.on =true;
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
   
   @Override
    public void run(){
        while(on){
            barra.setValue(barra.getValue()+1);
            if (barra.getValue() == 10000000) {
               on = false; 
            }
            try{
                Thread.sleep(0);
            }catch(InterruptedException e){
                
            }
        }
    }
    
    public void leerArchivo(){
        
    }
}
