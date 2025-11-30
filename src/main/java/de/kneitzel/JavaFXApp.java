package de.kneitzel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main application class for a JavaFX-based desktop application.
 * This class extends {@link Application} and overrides the {@code start} method to set up and display the main window.
 */
public class JavaFXApp extends Application {

	/**
     * Starts the JavaFX application by setting up and displaying the main window.
     *
     * @param primaryStage The primary stage for this application, onto which the scene can be set.
     */
    @Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Hello World!");
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Parent root = fxmlLoader.load();
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
     * The main method that launches the JavaFX application. This is a wrapper to ensure compatibility with JavaFX's class loading requirements, particularly useful when starting from
     *  within NetBeans.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
			launch(args);
	}
}
