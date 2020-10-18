package Project;

import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author bruno.schneider
 */

public class Logic {
    Random rad = new Random();
    
    public int returnPositonHorizontal(){
        int position = rad.nextInt(470);
        return position;
    }
    public int returnPositonVertical(){
        int position = rad.nextInt(450);
        return position;
    }
}