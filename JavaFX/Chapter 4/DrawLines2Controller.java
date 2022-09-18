// Fig. 4.26: DrawLines2Controller.java 
// Using strokeLine to decorate the canvas. 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.scene.canvas.Canvas;  
import javafx.scene.canvas.GraphicsContext;

public class DrawLines2Controller
{ 

	@FXML
	private Canvas canvas; // used to get the GraphicsContext
	// when user presses Draw Lines button, draw two Lines in the Canvas 

	@FXML
	void drawLinesButtonPressed(ActionEvent event)
	{
		// get the GraphicsContext, which is used to draw on the Canvas 
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// draw line from upper-left to lower-left corner 
		gc.strokeLine(0, 0, 0, canvas.getHeight());

		for (int i = 10; i < canvas.getHeight(); i += 10)
		{
			gc.strokeLine(0, 0, i, (canvas.getHeight()-i));
		}
		
		// draw line from upper-right to lower-left corner 
		//gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
	} 

}