import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


public class PizzaApp extends VBox {

private Text title;
private Text totalAmount;
private CheckBox pepperoniCheckBox;
private CheckBox buffaloChickenCheckBox;
private CheckBox hamCheckBox;
private CheckBox sausageCheckBox;
private CheckBox baconCheckBox;
private CheckBox pineappleCheckBox;
private CheckBox baconRanchCheckBox;

private RadioButton smallButton, mediumButton, largeButton;

private static final int toppingPrice = 1;
private static final int smallPrice = 10;
private static final int mediumPrice = 14;
private static final int largePrice = 18;

public PizzaApp()
{
	title = new Text("Pizza Menu");
	title.setFont(new Font("Times New Roman", 50));
	title.setFill(Color.TOMATO); 
	
    totalAmount = new Text("Total Cost:");
    totalAmount.setFont(new Font("Comic-Sans", 40));
    totalAmount.setFill(Color.BLACK); 
    
   
	pepperoniCheckBox = new CheckBox("Pepperoni");
	pepperoniCheckBox.setOnAction(this::processAction);

    
	buffaloChickenCheckBox = new CheckBox("Buffalo Chicken");
	buffaloChickenCheckBox.setOnAction(this::processAction);

    
    hamCheckBox = new CheckBox("Ham");
    hamCheckBox.setOnAction(this::processAction);
    
    sausageCheckBox = new CheckBox("Sausage");
    sausageCheckBox.setOnAction(this::processAction);
    
    baconCheckBox = new CheckBox("Bacon");
    baconCheckBox.setOnAction(this::processAction);
    
    pineappleCheckBox = new CheckBox("Pineapple");
    pineappleCheckBox.setOnAction(this::processAction);
    
    baconRanchCheckBox = new CheckBox("Bacon Ranch");
    baconRanchCheckBox.setOnAction(this::processAction);
    
    
    
   

    ToggleGroup group = new ToggleGroup();
    
    smallButton = new RadioButton("Small");
    smallButton.setToggleGroup(group);
    smallButton.setOnAction(this::processAction); 
    
    mediumButton = new RadioButton("Medium");
    mediumButton.setToggleGroup(group);
    mediumButton.setOnAction(this::processAction);
    
    largeButton = new RadioButton("Large");
    largeButton.setToggleGroup(group);
    largeButton.setOnAction(this::processAction);
    
  
    VBox options = new VBox(smallButton, mediumButton,largeButton);
    options.setAlignment(Pos.CENTER_LEFT);
    options.setSpacing(40);
    
    
    VBox options1 = new VBox(pepperoniCheckBox, buffaloChickenCheckBox, hamCheckBox, sausageCheckBox, baconCheckBox, pineappleCheckBox, baconRanchCheckBox);
    options1.setAlignment(Pos.CENTER_LEFT); 
    options1.setSpacing(30);  // between the check boxes 
    
  
    HBox options3 = new HBox(options, options1);
    options3.setAlignment(Pos.CENTER_LEFT);
    
    
    setSpacing(60);  // between the text and the check boxes 
    getChildren().addAll(title, options3, totalAmount);
}

public void processAction(ActionEvent event)
{

	int sum = 0;
	
	
    if (pepperoniCheckBox.isSelected()) {
        sum += toppingPrice;
    }
    if (buffaloChickenCheckBox .isSelected()) {
    	sum += toppingPrice;
    }
    if (hamCheckBox .isSelected()) {
    	sum += toppingPrice;
    }  
    if (sausageCheckBox .isSelected()) {
    	sum += toppingPrice;
    }
    if (baconCheckBox .isSelected()) {
    	sum += toppingPrice; 
    }
    if (pineappleCheckBox.isSelected()) {
    	sum += toppingPrice;
    }	
    if (baconRanchCheckBox.isSelected()) {
    	sum += toppingPrice;
    }	
    if (smallButton.isSelected()) {
	   sum += smallPrice;
    } 
    if (mediumButton.isSelected()) {
    	  sum += mediumPrice;
    }
    if(largeButton.isSelected()) {
    	  sum += largePrice;
    }
     totalAmount.setText("Total Cost: $" + Integer.toString(sum));
    
    
 }
}

