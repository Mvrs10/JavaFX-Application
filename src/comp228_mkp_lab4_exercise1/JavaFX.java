package comp228_mkp_lab4_exercise1;
/**
 * @author Minh Khoi Phan-301278135
 * @since 2024-11-4
 * @implNote Lab #4 Using JavaFX
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JavaFX extends Application{
	// Override the start method of the Application class
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("COMP-228 Lab4 JavaFX - Minh Khoi Phan");
		// Create the root container - Flow Pane
		BorderPane rootBP = createRootBorderPane();
		// Create the top container - HBox
		HBox topContainer = createHBox();
		GridPane leftContainer = createGridPane();
		VBox midContainer = createActivityVBox();
		FlowPane rightContainer = createProgramFlowPane();
		// Populate content
		rootBP.setTop(topContainer);
		rootBP.setLeft(leftContainer);
		rootBP.setCenter(midContainer);
		rootBP.setRight(rightContainer);
		BorderPane.setMargin(rightContainer, new Insets(0,100,0,0));
		// Create a scene
		Scene scene = new Scene(rootBP, 1000, 600);
		// Set scene
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args)
	{
		launch();
	}
	// Root Container function
	private BorderPane createRootBorderPane() {
		// Instantiate a flow pane
		BorderPane bp = new BorderPane();
		// Set properties
		
		
		return bp;
	}
	// Top Container function
	private HBox createHBox() {
		// Instantiate an HBox
		HBox hbox = new HBox();
		// Set properties
		hbox.setPadding(new Insets(20, 0, 20, 0));
		// Add contents
		Label header = new Label("Student Registration Form");
		header.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
		hbox.getChildren().add(header);	
		hbox.setAlignment(Pos.BASELINE_CENTER); // Center alignment
		return hbox;
	}
	// Left Container function
	private GridPane createGridPane() {
		// Instantiate a GridPane
		GridPane gpane = new GridPane();
		// Set properties
		gpane.setPadding(new Insets(5, 10, 5, 10));
		gpane.setVgap(8);
		gpane.setHgap(8);
		// Create labels
		Label lbName = new Label("Full name:");
		Label lbAddress = new Label("Address:");
		Label lbCity = new Label("City:");
		Label lbProvince = new Label("Province:");
		Label lbPostalCode = new Label("Postal Code:");
		Label lbPhoneNumber = new Label("Phone Number:");
		Label lbEmail = new Label("Email:");
		// Create TextFields
		TextField tfName = new TextField();
		tfName.setPrefWidth(250);
		TextField tfAddress = new TextField();
		TextField tfCity = new TextField();
		TextField tfProvince = new TextField();
		TextField tfPostalCode = new TextField();
		TextField tfPhoneNumber = new TextField();
		TextField tfEmail = new TextField();
		// Populate contents
		gpane.add(lbName, 0, 0);
		gpane.add(tfName, 1, 0);
		gpane.add(lbAddress, 0, 1);
		gpane.add(tfAddress, 1, 1);
		gpane.add(lbCity, 0, 2);
		gpane.add(tfCity, 1, 2);
		gpane.add(lbProvince, 0, 3);
		gpane.add(tfProvince, 1, 3);
		gpane.add(lbPostalCode, 0, 4);
		gpane.add(tfPostalCode, 1, 4);
		gpane.add(lbPhoneNumber, 0, 5);
		gpane.add(tfPhoneNumber, 1, 5);
		gpane.add(lbEmail, 0, 6);
		gpane.add(tfEmail, 1, 6);
		return gpane;
	}
	private VBox createActivityVBox() {
		//Instantiate a tilePane
		VBox vb = new VBox();
		//Set properties
		vb.setPadding(new Insets(5,10,5,10));
		vb.setSpacing(20);
		//Add title
		Label title = new Label("Choose your college activities:");
		title.setFont(Font.font(14));
		vb.getChildren().add(title);
		//Add check box
		String str[] = { "Student Council", "Sports Club", "Volunteer Work", "Library Service"};
		for (int i=0; i<str.length; i++) {
			CheckBox cb = new CheckBox(str[i]);
			vb.getChildren().add(cb);
			cb.setIndeterminate(false);
		}
		return vb;
	}
	private FlowPane createProgramFlowPane() {
		//Instantiate a FlowPane
		FlowPane fp = new FlowPane(Orientation.VERTICAL);
		//Set properties
		fp.setAlignment(Pos.BASELINE_LEFT);
		fp.setPadding(new Insets(5,10,5,10));
		fp.setVgap(5);
		//Add title
		Label title = new Label("Choose your program:");
		title.setFont(Font.font(14));
		//Add radio buttons
		HBox hp = new HBox();
		hp.setSpacing(30);
		ToggleGroup programGroup = new ToggleGroup();
		RadioButton program1 = new RadioButton("Computer Science");
		RadioButton program2 = new RadioButton("Business");
		program1.setToggleGroup(programGroup);
		program2.setToggleGroup(programGroup);
		hp.getChildren().addAll(program1,program2);
		//Add combo box
		String csCourses[]= { "Python" , "C#", "Java" };
		String businessCourses[]= { "Accounting", "Finance", "Risk Management" };
		ComboBox<String> cb = new ComboBox<String>(FXCollections.observableArrayList(csCourses));
		//Add list view
		ListView<String> listView = new ListView<String>();
		listView.setMaxHeight(150);
		listView.setMaxWidth(180);
		listView.getItems().add("Your selected course:");
		fp.getChildren().addAll(title,hp,cb,listView);
		return fp;
	}
}
