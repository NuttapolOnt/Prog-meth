package gui;

import javafx.scene.control.Tooltip;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

//You might need to do something to the following line
public class FieldCell extends Pane{
	
	private Item crop;
	private Tooltip tooltip;

	public FieldCell() {
		// TODO	Complete the FieldCell's constructor
		this.setPrefWidth(48);
		this.setMinWidth(48);
		this.setMinHeight(48);
		this.setPadding(new Insets(8));
		this.addEventHandler(MouseEvent.MOUSE_CLICKED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent  e) {
						// TODO fill in this method
						onClickHandler();
						}
			});
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.setBackgroundSoilColor();
		this.setUpTooltip();
	}
	
	private void onClickHandler() {
		if(SimulationManager.getSelectedItemButton() != null) {
			Item selectedItem = SimulationManager.getSelectedItemButton().getItem();
			// TODO Complete what have to be done if this cell is clicked 
			//		when a button in ControlPane is selected.
			if(selectedItem.isDestroyTool()) {
				crop = null;
				this.setBackgroundSoilColor();
			}
			else if(this.crop == null){
				crop = selectedItem;
				Image im = new Image(crop.getUrl());
				setBackgroundSoilColor(im);
				tooltip.setText(crop.getItemName()+crop.getIncomeText());
				SimulationManager.reduceMoneyBuySeed();
			}
		}
	}

	private void setBackgroundSoilColor() {
		this.setBackground(new Background(new BackgroundFill(Color.MOCCASIN, CornerRadii.EMPTY, Insets.EMPTY)));		
	}

	private void setBackgroundSoilColor(Image image) {
		BackgroundFill bgFill = new BackgroundFill(Color.MOCCASIN, CornerRadii.EMPTY, Insets.EMPTY);
		BackgroundFill[] bgFillA = {bgFill};
		BackgroundSize bgSize = new BackgroundSize(48,48,false,false,false,false);
		BackgroundImage bgImg = new BackgroundImage(image, null, null, null, bgSize);
		BackgroundImage[] bgImgA = {bgImg};
		this.setBackground(new Background(bgFillA,bgImgA));
	}
	
	private void setUpTooltip() {
		tooltip = new Tooltip();
		tooltip.setFont(new Font(12));
		this.setOnMouseMoved((MouseEvent e) -> {
			if (crop != null)
			tooltip.show(this, e.getScreenX(), e.getScreenY()+10);
		});
		this.setOnMouseExited((MouseEvent e) -> {
			tooltip.hide();
		});
		
	}
	public Item getCrop() {
		return crop;
	}
	
	
}
