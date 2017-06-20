

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageQuestion extends Question {
	Image im;
	QuestionPanel questionPanel;
    
    /*
     * Constructor takes the arguments Question, Answer and the QuestionPanel object
     */

	ImageQuestion(String question, String answer, QuestionPanel qp) {
		super(question, answer);
		im = (Image) Toolkit.getDefaultToolkit().getImage(question);
		questionPanel = qp;
	}
    
	/*
	 * draw(Graphics g, Dimension d) method draws the image question in the center panel.
	 */
	public void draw(Graphics g, Dimension d) {
		int x = (d.width) / 4;
		int y = (d.height) / 4;
		g.drawImage(im, x, y, questionPanel);

	}
}