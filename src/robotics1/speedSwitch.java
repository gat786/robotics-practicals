/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
public class speedSwitch {
      speedSwitch()
    {
     LegoRobot robot = new LegoRobot();
    Gear gear = new Gear();
    robot.addPart(gear);
     for (int k = 1; k < 4; k++ )
    {
      int speed;
      switch(k)
      {
        case 1:
          speed = 10;
          break;
        case 2:
          speed = 50;
          break;
        case 3:
          speed = 100;
          break;
        case 4:
          speed = 150;
          break;
        default:
          speed = 60;
      }
      gear.setSpeed(speed);
      gear.forward();
      Tools.delay(2000);
      gear.left(570);
    }
    }

public static void main(String[] args) {
        new speedSwitch();

        }


}
