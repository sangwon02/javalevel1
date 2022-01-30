import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class rgs {
    public static void main(String[] args) {
        
        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a ID");
        Elevator myElva = new Elevator(id);    
        myElva.callForUp(1);
        //보안 끔
        Security myse = new Security(id);
        myse.off();
        //불 킴
        Lighting hall = new Lighting(id+"Hall");
        hall.on();
        
        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}
