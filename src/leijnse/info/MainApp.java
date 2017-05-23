package leijnse.info;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
        // https://www.safaribooksonline.com/library/view/learn-javafx-8/9781484211427/9781484211434_Ch01.xhtml

        Text msg = new Text("Hello JavaFX");
        VBox root2 = new VBox();
        root2.getChildren().add(msg);

        Scene scene2 = new Scene(root2, 300, 50);
        primaryStage.setScene(scene2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
