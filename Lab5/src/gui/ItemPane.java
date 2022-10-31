package gui;


import javax.swing.GroupLayout.Alignment;
import javafx.event.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

//You might need to do something to the following line
public class ItemPane extends GridPane {

	private ObservableList<ItemButton> itemButtonList = FXCollections.observableArrayList();
	
	public ItemPane () {
		// TODO implements the ItemPane's constructor
		this.setAlignment(Pos.CENTER);
		this.setVgap(10);
		this.setHgap(10);
		ItemButton cornBut = new ItemButton("Corn");
		ItemButton coffeeBut = new ItemButton("Coffee");
		ItemButton blueberryBut = new ItemButton("Blueberry");
		ItemButton strawberryBut = new ItemButton("Strawberry");
		ItemButton pineappleBut = new ItemButton("Pineapple");
		ItemButton destroytoolBut = new ItemButton("DestroyTool");
		itemButtonList.add(destroytoolBut);
		itemButtonList.add(pineappleBut);
		itemButtonList.add(strawberryBut);
		itemButtonList.add(blueberryBut);
		itemButtonList.add(coffeeBut);
		itemButtonList.add(cornBut);
		this.add(cornBut, 0, 0);
		this.add(coffeeBut, 1, 0);
		this.add(blueberryBut, 2, 0);
		this.add(strawberryBut, 0, 1);
		this.add(pineappleBut, 1, 1);
		this.add(destroytoolBut, 2, 1);
		for(ItemButton x : itemButtonList) {
			x.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					if(SimulationManager.getMoney() >= x.getItem().getPrice()) {
						setSelectedButton(x);
					}
				}
			});
		}
	} 

	public void setSelectedButton ( ItemButton selecteditemButton ) {
		// TODO set selectedItemButton of SimulationManager to given ItemButton
		// resetButtonsBackgroundColor and the highlight the selecteditemButton
		SimulationManager.setSelectedItemButton(selecteditemButton);
		resetButtonsBackGroundColor();
		selecteditemButton.highlight();
	}

	public void resetButtonsBackGroundColor() {
		// TODO unhighlight each button in itemButtonList
		for(ItemButton x : itemButtonList) {
			x.unhighlight();
		}
	}	
	
}
