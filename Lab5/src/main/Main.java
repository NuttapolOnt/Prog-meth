package main;

import gui.ControlPane;
import gui.*;
import gui.FieldPane;
import gui.SimulationManager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		// TODO
		HBox root = new HBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.setPrefHeight(400);
		ControlPane control = new ControlPane();
		FieldPane field = new FieldPane();
		SimulationManager.setControlPane(control);
		SimulationManager.setFieldPane(field);
		root.getChildren().add(control);
		root.getChildren().add(field);
		Scene scene = new  Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Harvest Simulator");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
