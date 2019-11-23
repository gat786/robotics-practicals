/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;

class MoveWithoutGear
{
    MoveWithoutGear()
    {

        TurtleRobot robot= new TurtleRobot();
        robot.forward(50);
        robot.left(30);
        robot.forward(50);
        robot.right(60);
        robot.backward(50);
        robot.exit();

    }

    public static void main(String args[])
    {
        MoveWithoutGear m = new MoveWithoutGear();
    }
}
