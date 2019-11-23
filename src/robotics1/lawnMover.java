/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;
import ch.aplu.robotsim.*;

public class lawnMover {
  lawnMover()
{
    TurtleRobot robot=new TurtleRobot();
    TouchSensor ts=new TouchSensor(SensorPort.S3);
    robot.addPart(ts);
    robot.setTurtleSpeed(80);
    robot.forward();
    int i=1;
    while(true)
    {
        if(ts.isPressed())
        {
            robot.backward(20);
            if(i%2 == 1)
            {
                robot.left(90);
                robot.forward(25);
                robot.left(90);
            }
            else
            {
                robot.right(90);
                robot.forward(25);
                robot.right(90);
            }
            robot.forward();
                    i++;
        }
    }
}
public static void main(String[] args) {
      new lawnMover();
    }
  static
  {
      RobotContext.useObstacle("sprites/box.gif",250,250);
      RobotContext.setStartPosition(475, 475);
      RobotContext.setStartDirection(-90);
  }
}


