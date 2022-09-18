import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawRandomLines
{
	// Fig. 4.28: DrawLines.java
	// Main application class that loads and displays the DrawLines GUI.

	@Override
	public void start(Stage stage) throws Exception
	{
		// loads DrawLines.fxml and configures the DrawLinesController
		Parent root = FXMLLoader.load(getClass().getResource("DrawRandomLines.fxml"));

		Scene scene = new Scene(root); // attach scene graph to scene
		stage.setTitle("Draw Random Lines"); // displayed in window's title bar
		stage.setScene(scene); // attach scene to stage
		stage.show(); // display the stage
	}

	// application execution starts here
	public static void main(String[] args)
	{
		launch(args); // create a DrawLines object and call its start method
	}
}