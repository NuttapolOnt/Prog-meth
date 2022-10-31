package PopUp;

import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.image.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import Controller.Item;

public class ItemPane extends Pane{
	
	public ItemPane() {
		this.setPrefWidth(50);
		this.setPrefHeight(50);
		this.setMinHeight(50);
		this.setMinWidth(50);
		setEmpty();
	}
	
	
	public void setEmpty() {
		this.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void setItemOn(Item item) {
		BackgroundFill bgFill = new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY);
		BackgroundFill[] bgFillA = {bgFill};
		Image im = new Image(item.getImgURL());
		BackgroundSize bgSize = new BackgroundSize(50,50,false,false,false,false);
		BackgroundImage bgImg = new BackgroundImage(im, null, null, null, bgSize);
		BackgroundImage[] bgImgA = {bgImg};
		this.setBackground(new Background(bgFillA,bgImgA));
	}

}
