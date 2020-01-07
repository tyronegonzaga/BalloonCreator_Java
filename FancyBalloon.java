
/**
 * FancyBalloon 
 * Tyrone G
 */
import java.awt.Color;
import java.awt.Graphics;
public class FancyBalloon extends Balloon
{
  

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon()
  {
      super(); 
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
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
    return Math.max(Math.abs(dx)/.5, Math.abs(dy));
  }
  
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(getColor());
    if (makeItFilled)
      g.fillRect(getX() - getRadius()/2,
                 getY() - getRadius(), getRadius(), 2*getRadius());
    else
      g.drawRect(getX() - getRadius()/2,
                 getY() - getRadius(), getRadius(), 2*getRadius());
  }
}

