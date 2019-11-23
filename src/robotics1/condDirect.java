/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
public class condDirect {
condDirect(){
   LegoRobot robot = new LegoRobot();
    Gear gear = new Gear();
    robot.addPart(gear);
         for (int i = 0; i < 7; i++)
    {
      double a = Math.random();
      if (a < 0.5)
      {
        gear.right(200);
      gear.forward();
      Tools.delay(1000);
      }
      else
      {
        gear.left(200);
        gear.forward();
      Tools.delay(1000);
      }
      gear.forward();
    }
    robot.exit();


   }
public static void main(String[] args) {
        new condDirect();

        }

}
