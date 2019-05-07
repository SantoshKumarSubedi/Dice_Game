/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.game;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Hauday
 */
public class BackgroundPanel extends JPanel
{
  Image image;
  public BackgroundPanel()
  {
    try
    {
      image = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("board.png"), "board.pjg"));
    }
    catch (Exception e) { /*handled in paintComponent()*/ }
  }
 
  @Override
  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g); 
    if (image != null)
      g.drawImage(image, 0,0,this.getWidth(),this.getHeight(),this);
  }
}
