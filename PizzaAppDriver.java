import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class PizzaAppDriver extends Application {

	 public void start(Stage primaryStage)
	    {
	        PizzaApp pane = new PizzaApp();
	        pane.setAlignment(Pos.TOP_CENTER);
	        pane.setStyle("-fx-background-color: bisque");
	        
             
	            
	        Scene scene = new Scene(pane, 360, 500);
	        primaryStage.setTitle("Pizza Menu");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	    
	    public static void main(String[] args)
	    {
	        launch(args);
	    }

}
