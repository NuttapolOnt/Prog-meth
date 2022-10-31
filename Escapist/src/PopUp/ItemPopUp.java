package PopUp;

import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import Controller.*;
import java.util.ArrayList;

public class ItemPopUp extends GridPane{
	
	public ItemPopUp() {
		this.setAlignment(Pos.CENTER);
		this.setPrefHeight(90);
		this.setPrefWidth(330);
		this.setVgap(10);
		this.setHgap(10);
		this.setPadding(new Insets(20));
		this.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY)));
		showItem();
	}
	
	public void showItem() {
		int n = Logic.getItemList().size();
		for(int i = 0; i < n; i++) {
			ItemPane it = new ItemPane();
			it.setItemOn(Logic.getItem(i));
			this.add(it, 0, i);
		}
		for(int i = n; i < 5; i++) {
			ItemPane it = new ItemPane();
		    this.add(it, 0, i);
		}
	}
	
	
	
}
