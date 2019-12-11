package cadastrodealuno;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class CadastroDeAluno extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
     AnchorPane root = FXMLLoader.load(this.getClass().getResource("FXMLFormulario.fxml"));
     Scene scene = new Scene(root); 
     primaryStage.setScene(scene);
     primaryStage.show();
    }   
   
    public static void main(String[] args) 
    { 
        launch(args);
    }
}
