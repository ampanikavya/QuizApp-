
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class TextQuestion extends Question 
{
    
	/*
     * Constructor takes the arguments Question, Answer 
     */
    TextQuestion(String question, String answer) 
    {
		super(question, answer);
	}
    
    /*
	 * draw(Graphics g, Dimension d)  method draws the text question in the center panel.
     */
    public void draw(Graphics g, Dimension d) 
    {
		FontMetrics fm = g.getFontMetrics();
		int x = (d.width - fm.stringWidth(inquestion)) / 2;
		int y = (d.height - fm.getHeight()) / 2;
		g.drawString(inquestion, x, y);

	}
}