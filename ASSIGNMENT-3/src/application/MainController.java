package application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController{
@FXML private Button clear;
@FXML private TextArea text;
@FXML private Button add;
@FXML private Button show;
@FXML private TextField fname;
@FXML private TextField lname;
@FXML private TextField phone;
@FXML private TextField email;

@FXML private void initialize() {
clear.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent e) {
onclrClicked();
}
});


add.setOnAction(new EventHandler<ActionEvent>(){
	public void handle(ActionEvent e) {
		onaddClicked();
	}
});

show.setOnAction(new EventHandler<ActionEvent>(){
	public void handle(ActionEvent e) {
		onshowClicked();
	}
});


}
private void onclrClicked() {
lname.setText("");
fname.setText("");
phone.setText("");
email.setText("");
}

private void onaddClicked()
{
	try{
		BufferedWriter out = new BufferedWriter( new FileWriter("C:/temp/person.txt",true));

		out.write(lname.getText()+","+fname.getText()+","+phone.getText()+","+email.getText());
		out.newLine();
		out.close();
	}catch(Exception e) {
		System.out.println(e.toString());
	}
	finally{
		System.out.println("Writing completed. Check the file!");
	}
}

private void onshowClicked()
{
	File f = new File("C:/temp/person.txt");
	try(BufferedReader br = new BufferedReader(new FileReader(f)) )
	{
		String s;

		while((s = br.readLine()) != null)
		{
			text.appendText(s);
			text.appendText("\n");
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}

}