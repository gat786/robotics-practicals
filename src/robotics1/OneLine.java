/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
public class OneLine {
    OneLine()
    {
        LegoRobot robot=new LegoRobot();
        LightSensor ls=new LightSensor(SensorPort.S3);
        robot.addPart(ls);
        Gear gear=new Gear();
        robot.addPart(gear);
        while(true)
        {
            if(ls.getValue()< 500)
            gear.leftArc(0.1);
            else
                gear.rightArc(0.1);
        }
    }
    static{
        RobotContext.setStartDirection(-90);
        RobotContext.setStartPosition(250, 490);
        RobotContext.useBackground("sprites/black_white.gif");
    }
public static void main(String[] args) {
       new OneLine();
    }
}
