package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application 
{
	@Override
	public void start(Stage stage) 
	{
	  try 
	  {
		  Parent root = FXMLLoader.load(getClass().getResource("/Main1.fxml"));
		  Scene scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css.."));
		  String css = this.getClass().getResource("application.css").toExternalForm();
		  scene.getStylesheets().add(css);
		  
		  Image icon = new Image("calculator.png");
		  stage.getIcons().add(icon);
		  
		  
		  
		  stage.setScene(scene);
		  stage.show();
	   }
		
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}
	public static void main(String args[]){
		 launch(args);
	}
}
