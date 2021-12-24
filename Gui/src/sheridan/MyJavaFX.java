package sheridan;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class MyJavaFX extends Application
{
	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage)
	{
		// Create a scene and place a button in the scene

		//Button btOK = new Button("OK");Scene scene = new Scene(btOK, 230, 250);


		FlowPane pane = new FlowPane();
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
        TextField txt =new TextField("Akshay");


        txt.setText("Ghatge");
        pane.getChildren().add(txt);
        pane.getChildren().add(btOK);
		pane.getChildren().add(btCancel);


		pane.setVgap(5);
		pane.setHgap(15);

		FlowPane.setMargin(txt, new Insets (10,10,10,10));
		FlowPane.setMargin(btOK, new Insets(10,10,10,10));
		FlowPane.setMargin(btCancel, new Insets(10,10,10,10));

		Scene scene = new Scene(pane, 230, 50);

		primaryStage.setTitle("MyJavaFX");// Set the window title
		primaryStage.setScene(scene);		// Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
	public static void main(String[] args)
	{
		Application.launch(args);

	}
}
