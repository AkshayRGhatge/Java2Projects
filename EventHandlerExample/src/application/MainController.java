package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    // GUI controls
    @FXML private Button btnOk;
    @FXML private Button btnCancel;
    @FXML private TextArea txtArea;

    // This method is automatically called when the window opens, after the FXML file has been loaded.
    // You can put startup and initialization code here.
    @FXML private void initialize() {

        // Attach event handler(s)
        btnOk.setOnAction(new OkHandler());
        btnCancel.setOnAction(new cancelHandler());
    }

    private void onOkClicked() {
        System.out.println("OK button was clicked");
        txtArea.setText("Hi buddy");
    }



    private void onCancelClicked(){
    	System.out.println("bye buddy");
    	txtArea.setText("");


    }
    // Inner class

    private class OkHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            onOkClicked();   // Call a method in the outer class
        }

    }
    private class cancelHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            onCancelClicked();   // Call a method in the outer class
        }

    }

}
