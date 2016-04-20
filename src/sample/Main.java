package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Форма вхоад");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15));

        Text sceneTitle = new Text("Привет");
        sceneTitle.setFont(new Font("Tahoma", 25));
        gridPane.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("Логин: ");
        TextField userNameField = new TextField();
        userName.setLabelFor(userNameField);
        gridPane.add(userName, 0, 1);
        gridPane.add(userNameField, 1, 1);

        Label password = new Label("Пароль: ");
        PasswordField passwordField = new PasswordField();
        password.setLabelFor(passwordField);
        gridPane.add(password, 0, 2);
        gridPane.add(passwordField, 1, 2);

        primaryStage.setScene(new Scene(gridPane, 300, 300));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class Counter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; ;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
