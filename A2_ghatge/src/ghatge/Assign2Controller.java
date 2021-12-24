package ghatge;

import java.awt.Label;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

public class Assign2Controller {//class starting

	@FXML private Button btnAdd;
	@FXML private Button btnSave;
	@FXML private Button btnOrder;
	@FXML private Button btnExit;

	@FXML private TextField txt;
	@FXML private TextField txt1;
	@FXML private TextField txt2;
	@FXML private TextField txt3;
	@FXML private TextField txt4;
	@FXML private TextArea txt5;

	@FXML private Label label;

	InventoryList inv =new InventoryList();
	Inventory inventory = new Inventory();
	private Node yourWindow;
	private Window window;

	@FXML private void initialize() {
		btnAdd.setOnAction(e -> AddInventory());
		btnSave.setOnAction(e -> SaveInventory());
		btnOrder.setOnAction(e -> OrderInventory());
		btnExit.setOnAction(e -> ExitInventory());

	}

	private void AddInventory(){
		label.setText("");
	}

	private void SaveInventory(){


		inventory.setId(txt.getText());
		inventory.setName(txt1.getText());
		inventory.setQoh(Integer.parseInt(txt2.getText()));
		inventory.setRop(Integer.parseInt(txt3.getText()));
		inventory.setSellPrice(Double.parseDouble(txt4.getText()));
		txt5.setText(inventory.toString());

	}

	private void OrderInventory(){
	}

	private void ExitInventory(){
		yourWindow.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
	}
}