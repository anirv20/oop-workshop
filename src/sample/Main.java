package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        BuildingAdminSys admin = new BuildingAdminSys();
        admin.addBuilding(new Building());
        admin.addBuilding(new Building());
        admin.getBuildings().get(0).addActuator(new VentilatorActuator(0.9));
        admin.getBuildings().get(1).addSensor(new CarbondioxideSensor(1.5));
        System.out.println(admin.toString());
    }
}
