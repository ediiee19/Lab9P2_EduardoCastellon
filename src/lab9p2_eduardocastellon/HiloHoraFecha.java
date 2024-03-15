

package lab9p2_eduardocastellon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class HiloHoraFecha implements Runnable{
    private JLabel hora, fecha;
    public HiloHoraFecha(JLabel hora, JLabel fecha){
        this.hora = hora;
        this.fecha = fecha;
    }
    
    @Override
    public void run(){
        while(true){
            Date time = new Date();
            DateFormat t=new SimpleDateFormat("hh:mm:ss");
            hora.setText(t.format(time));
            DateFormat f= new SimpleDateFormat("dd/MM/YYYY");
            fecha.setText(f.format(time));
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                
            }
        }
    }
}
