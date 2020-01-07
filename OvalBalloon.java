
/**
 * OvalBalloon 
 * Tyrone G
 */
import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon extends Balloon
{
  

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public OvalBalloon()
  {
      super(); //this is optional: default
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public OvalBalloon(int x, int y, int r, Color c)
  {
      super(x, y, r, c);    
  }
  
  /**
   * Returns the distance from a given point to the
   * center of this balloon.
   * @param x, y coordinates of the point
   */
  public double distance(int x, int y)
  {
    double dx = x - getX();
    double dy = y - getY();
    return Math.sqrt(dx*dx*4 + dy*dy);
  }
  
  /**
   * Draws a solid oval if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(getColor());
    if (makeItFilled)
      g.fillOval(getX() - getRadius()/2,
                 getY() - getRadius(), getRadius(), 2*getRadius());
    else
      g.drawOval(getX() - getRadius()/2, 
                 getY() - getRadius(), getRadius(), 2*getRadius());
  }
}