/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
class MoveWithGear
{
  MoveWithGear()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);

    gear.forward(1000);
    gear.setSpeed(30);
    gear.left(900);
    gear.forward(1000);
    gear.right(2000);
    gear.forward(1000);
    robot.exit();
  }
  public static void main(String args[])
  {
    MoveWithGear  m=new MoveWithGear();
  }
}

