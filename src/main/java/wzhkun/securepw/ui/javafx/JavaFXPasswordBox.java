package wzhkun.securepw.ui.javafx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class JavaFXPasswordBox {
	private static Scene scene;
	
	public Scene getScene(){
		if (scene == null) {
			try {
				scene = new Scene((Parent) FXMLLoader.load(getClass().getResource("PasswordBox.fxml")));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return scene;
	}
	
	
	
	@FXML
	VBox box;
	
	@FXML
	public void add(){
		initBox();
	}
	
	@FXML
	public void setting(){
	}
	
	public void initBox(){
		addToBox(new JavaFXPasswordItem().getPane());
	}
	
	private void addToBox(Pane pane){
		pane.setPrefWidth(500);
		box.getChildren().add(pane);
	}
}
