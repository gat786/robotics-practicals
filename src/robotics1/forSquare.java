/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;
import ch.aplu.robotsim.*;

public class forSquare {
forSquare(){
    LegoRobot robot=new LegoRobot();
    Gear gear=new Gear();
    robot.addPart(gear);
    for(int i=0; i<4; i++)
    {
        gear.forward();
        Tools.delay(2000);
        gear.left(570);

    }

}public static void main(String[] args) {
        new forSquare();

        }

}
