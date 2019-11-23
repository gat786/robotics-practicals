/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;
import ch.aplu.robotsim.*;

public class MoveWithMotor 
{
  public  MoveWithMotor()
  {
    NxtRobot robot=new  NxtRobot();
    Motor motA=new Motor(MotorPort.A);
    Motor motB=new Motor(MotorPort.B);
    robot.addPart(motA);
    robot.addPart(motB);
    motA.forward();
    motB.forward();
    Tools.delay(2000);
    motA.stop();

    Tools.delay(1050);
    motA.forward();
    Tools.delay(2000);

    motB.stop();
    Tools.delay(1050);
    motB.forward();
    Tools.delay(2000);
    motB.backward();
 Tools.delay(2000);
    robot.exit();
  }
  public static void main(String args[])
  {
    MoveWithMotor m = new MoveWithMotor();
  }

}
