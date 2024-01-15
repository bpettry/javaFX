package application;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserInterfaceWithMenu extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//set title for the stage
		primaryStage.setTitle("Module 3");
		BorderPane layout = new BorderPane();
		layout.setBackground(Background.EMPTY);
		Scene scene = new Scene(layout, 500, 300);
		
		
		
		//Primary menu
		Menu primaryMenu = new Menu("Start");
		
		//Create menu items
		MenuItem menuItem1 = new MenuItem("Date/time");	
		MenuItem menuItem2 = new MenuItem("Write file");
		MenuItem menuItem3 = new MenuItem("Color changer");
		MenuItem menuItem4 = new MenuItem("Exit");
		
		//Add the menu items to the primaryMenu
		primaryMenu.getItems().add(menuItem1);
		primaryMenu.getItems().add(menuItem2);
		primaryMenu.getItems().add(menuItem3);
		primaryMenu.getItems().add(menuItem4);
		
		//Add primaryMenu to the top menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(primaryMenu);

	
		//Label and text field for output
		TextField outputField = new TextField();
		
		
		
		/*
		 * Events for menu clicks
		 */

		//Date/time
		menuItem1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Date nowDate = Calendar.getInstance().getTime();  
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss"); 
				String strDate = dateFormat.format(nowDate);
				
				layout.setLeft(outputField);
				outputField.setText(strDate);
				outputField.setPrefColumnCount(15);
				outputField.setEditable(false);
			}
		});

		
		

		//Write File
		//I am having the hardest time figuring this part out :(
		menuItem2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			}		
	});


		//Color Changer
		menuItem3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				scene.setFill(Color.rgb(75, 180, 123));
				
			}
		});



		
		//Exit
		menuItem4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});


		
		
		//Layout set-up and view scene
		layout.setTop(menuBar);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	/*
	 *Launch the applications
	 */
	public static void main(String[] args) {
		launch(args);

	}

}
