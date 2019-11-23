/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
public class whileSquare {
whileSquare(){
        LegoRobot robot=new LegoRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        int i=0;
        while(i<4)
        {
            gear.forward();
            Tools.delay(2000);
            gear.left(560);
            i++;
        }
}
public static void main(String[] args) {
        new whileSquare();

        }
}


