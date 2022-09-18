// Fig. 4.26: DrawLines4Controller.java 
// Using strokeLine to decorate the canvas. 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.scene.canvas.Canvas;  
import javafx.scene.canvas.GraphicsContext;

public class DrawLines4Controller
{ 

	@FXML
	private Canvas canvas; // used to get the GraphicsContext
	// when user presses Draw Lines button, draw two Lines in the Canvas 

	@FXML
	void drawLinesButtonPressed(ActionEvent event)
	{
		// get the GraphicsContext, which is used to draw on the Canvas 
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// draw line from upper-left to lower-right corner 
		//gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

		// draw line from upper-right to lower-left corner
		//gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());

		double x1 = 0, y1 = 0, x2 = 0, y2 = canvas.getHeight();

		// BOTTOM LEFT CORNER
		for (int i = 0; i < canvas.getWidth(); i += 10)							// START FROM LEFT AND MOVE RIGHT
		{
			gc.strokeLine(x1, y1, x2, y2);										// DRAW STARTING FROM
			y1 += 10;															// TOP LEFT CORNER
			x2 += 10;
		}																		
		
		x1 = canvas.getWidth(); y1 = canvas.getHeight(); x2 = 0; y2 = canvas.getHeight();

		// BOTTOM RIGHT CORNER
		for (double i = canvas.getHeight(); i > 0 ; i -= 10)					// START FROM BOTTOM AND MOVE UP
		{
			gc.strokeLine(x1, y1, x2, y2);										// DRAW STARTING FROM
			y1 -= 10;															// BOTTOM RIGHT CORNER
			x2 += 10;															
		}
		
		x1 = canvas.getWidth(); y1 = 0; x2 = canvas.getWidth(); y2 = canvas.getHeight();

		// TOP RIGHT CORNER
		for (double i = canvas.getWidth(); i > 0; i -= 10)						// START FROM RIGHT AND MOVE LEFT
		{
			gc.strokeLine(x1, y1, x2, y2);										// DRAW STARTING FROM
			x1 -= 10;															// TOP RIGHT CORNER
			y2 -= 10;
		}

		x1 = 0; y1 = 0; x2 = canvas.getWidth(); y2 = 0;

		// TOP LEFT CORNER
		for (int i = 0; i < canvas.getHeight(); i += 10)						// START FROM TOP AND MOVE DOWN
		{
			gc.strokeLine(x1, y1, x2, y2);										// DRAW STARTING FROM
			y1 += 10;															// TOP LEFT CORNER
			x2 -= 10;
		}
		
	} 

}