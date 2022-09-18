// Fig. 4.26: DrawLines3Controller.java 
// Using strokeLine to decorate the canvas. 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.scene.canvas.Canvas;  
import javafx.scene.canvas.GraphicsContext;

public class DrawLines3Controller
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
		gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());

		// draw line from upper-right to lower-left corner
		gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());

		// TOP LEFT HALF
		for (int i = 10; i < canvas.getHeight(); i += 10)						// START FROM LEFT AND MOVE RIGHT
		{
			gc.strokeLine(0, 0, i, (canvas.getHeight()-i));						// DRAW STARTING FROM
		}																		// TOP LEFT CORNER
		
		// TOP RIGHT HALF
		int j = 10;
		for (double i = (canvas.getHeight()-10); i > 0 ; i -= 10)				// START FROM RIGHT AND MOVE LEFT
		{
			gc.strokeLine(canvas.getWidth(), 0, (canvas.getWidth()-j), i);		// DRAW STARTING FROM
			j += 10;															// TOP RIGHT CORNER
		}

		// BOTTOM RIGHT HALF
		int k = 0;
		for (double i = canvas.getWidth(); i > 0; i -= 10)						// START FROM RIGHT AND MOVE LEFT
		{
			gc.strokeLine(canvas.getWidth(), canvas.getHeight(), i, k);			// DRAW STARTING FROM
																				// BOTTOM RIGHT CORNER
			k += 10;
		}

		// BOTTOM LEFT HALF
		int l = 0;
		for (int i = 0; i < canvas.getWidth(); i += 10)							// START FROM LEFT AND MOVE RIGHT
		{
			gc.strokeLine(0, canvas.getHeight(), i, l);							// DRAW STARTING FROM
			l += 10;															// BOTTOM LEFT CORNER
		}
	} 

}