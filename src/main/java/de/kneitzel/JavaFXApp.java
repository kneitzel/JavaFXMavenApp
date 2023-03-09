package de.kneitzel;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class JavaFXApp extends Application {
	static final Logger logger = LogManager.getLogger(JavaFXApp.class);

	@Override
	public void start(Stage primaryStage) throws IOException {

		primaryStage.setTitle("Hello World!");
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
		Parent root = fxmlLoader.load();
		primaryStage.setScene(new Scene(root));
        primaryStage.show();
		/*
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(e -> System.out.println("Hello World!"));

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		*/
	}

	public static void main(String[] args) {
		logger.warn("Starting ...");
		launch(args);
	}
}
