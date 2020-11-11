package dad.javafx.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	
	private CalculadoraFXMLController controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CalculadoraFXMLController();
		
		Scene scene = new Scene(controller.getRoot(), 350, 280);
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
