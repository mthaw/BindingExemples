
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ajouter extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		TextField txt1 = new TextField(); txt1.setLayoutX(30); txt1.setLayoutY(40);
		TextField txt2 = new TextField(); txt2.setLayoutX(30); txt1.setLayoutY(80);
		Label lbl = new Label(); lbl.setLayoutX(30); lbl.setLayoutY(120);
		
		//
		txt1.textProperty().addListener((observable, oldValue, newValue) -> {
			lbl.setText(txt1.getText()+" + "+txt2.getText()+" = "+(Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText())));
		});
		
		txt2.textProperty().addListener((observable, oldValue, newValue) -> {
			lbl.setText(txt1.getText()+" + "+txt2.getText()+" = "+(Integer.parseInt(txt1.getText())+Integer.parseInt(txt2.getText())));
		});
		
		//Empêcher l'utilisateur de taper des lettres dans txt1
		txt1.textProperty().addListener((observable, oldValue, newValue) -> {
			if (!newValue.matches("^[0-9](\\.[0-9]+)?$")) {// Si il y a un caractere qui n'est pas un chiffre
				txt1.setText(newValue.replaceAll("[^\\d*\\.]", ""));// Enlever tous les caracteres
																				// non-numeriques
			}
		});
		
		//Empêcher l'utilisateur de taper des lettres dans txt2
		txt2.textProperty().addListener((observable, oldValue, newValue) -> {
			if (!newValue.matches("^[0-9](\\.[0-9]+)?$")) {// Si il y a un caractere qui n'est pas un chiffre
				txt2.setText(newValue.replaceAll("[^\\d*\\.]", ""));// Enlever tous les caracteres
																				// non-numeriques
			}
		});

		
		//Ajouter tous les elements (les deux TextField et le Label) au groupe d'elements
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl);
		primaryStage.setScene(scene);//Definir le Scene pour le Stage
		primaryStage.show();//Montrer le Stage
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
