/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics1;

import ch.aplu.robotsim.*;
class Circlem
{
     Circlem()
{
  NxtRobot r = new NxtRobot();
  Gear g = new Gear();
  r.addPart(g);
  g.setSpeed(100);
  g.leftArc(0.2,7000);
  g.rightArc(0.2);

  Tools.delay(2000);
    r.exit();
     }
  
  public static void main(String[] args)
  {
      new Circlem();
  }
}

      
