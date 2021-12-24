package application;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {
    @FXML private TextField txtExpense;
    @FXML private Button btnCalc;
    @FXML private TextField lblAmount;



    @FXML private void initialize() {
        // Attach event handler(s)
        btnCalc.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                onbtnCalcClicked();
            }
        });
    }


    private void onbtnCalcClicked() {
try{
    	 int value;

    	 int greater;
    	 int claim;
    	 int claimValue=100;
    	 int firstClaim;
    	 int secondClaim;
    	 int sumExpense;
    	 value=Integer.parseInt(txtExpense.getText());

        if(value < 100)
        {

        	claim=((value*57)/100);
        	lblAmount.setText(Integer.toString(claim));

        }

        else if( value >= 100)
         {
        	 greater=value-claimValue;
        	 firstClaim=((value*57)/100);
        	 secondClaim=((greater*28)/100);
        	 sumExpense=firstClaim+secondClaim;
        	 lblAmount.setText(Integer.toString(sumExpense));
         }
}
        catch(Exception e){
        	Alert alert=new Alert(AlertType.ERROR, "Please enter a valid input.");
        	Optional<ButtonType> result = alert.showAndWait();
        	    if (result.isPresent() && result.get() == ButtonType.OK) {
        	    txtExpense.setText(null);
        	    }
        }
}


   }






