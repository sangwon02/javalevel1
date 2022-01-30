import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {
    public static void main(String[] args) {
        
        String id = "JAVA APT 507";
        //엘리베이터 부름
        Elevator myElva = new Elevator(id);    
        myElva.callForUp(1);
        //보안 끔
        Security myse = new Security(id);
        myse.off();
        //불 킴
        Lighting hall = new Lighting(id+"Hall");
        hall.on();
    }
}
