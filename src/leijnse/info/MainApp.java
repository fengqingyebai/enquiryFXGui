package leijnse.info;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
         // https://www.safaribooksonline.com/library/view/learn-javafx-8/9781484211427/9781484211434_Ch01.xhtml
         // https://www.safaribooksonline.com/library/view/java-se-8/9780133430202/ch04.html

//        Text msg = new Text("Hello JavaFX");
//        VBox root2 = new VBox();
//        root2.getChildren().add(msg);
//
//        Scene scene2 = new Scene(root2, 300, 50);
//        primaryStage.setScene(scene2);
        primaryStage.show();
    }

//    @Override
//    public void start(Stage stage) {
//        Label nameLbl = new Label("Enter your name:");
//        TextField nameFld = new TextField();
//        Label msg = new Label();
//        msg.setStyle("-fx-text-fill: blue;");
//        // Create buttons
//        Button sayHelloBtn = new Button("Say Hello");
//        Button exitBtn = new Button("Exit");
//
//        // Add the event handler for the Say Hello button
//        sayHelloBtn.setOnAction(e -> {
//            String name = nameFld.getText();
//            if (name.trim().length() > 0) {
//                msg.setText("Hello " + name);
//            } else {
//                msg.setText("Hello there");
//            }
//        });
//
//        // Add the event handler for the Exit button
//        exitBtn.setOnAction(e -> Platform.exit());
//
//        // Create the root node
//        VBox root = new VBox();
//
//        // Set the vertical spacing between children to 5px
//        root.setSpacing(5);
//
//        // Add children to the root node
//        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);
//
//        Scene scene = new Scene(root, 350, 150);
//        stage.setScene(scene);
//        stage.setTitle("Improved Hello JavaFX Application");
//        stage.show();
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
