package layouts.teil1;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(24));

        HBox hBoxTop = new HBox(10);
        Text textTitle = new Text("Teams Chat");
        HBox.setMargin(textTitle, new Insets(0, 0, 20, 0));
        textTitle.setFont(Font.font("Helvetica", FontPosture.REGULAR, 40));
        hBoxTop.getChildren().add(textTitle);
        borderPane.setTop(hBoxTop);

        Button buttonSend = new Button("Send");
        TextArea textArea = new TextArea();
        VBox vBoxBottom = new VBox(20);
        HBox hBoxTextArea = new HBox();
        hBoxTextArea.getChildren().add(textArea);
        vBoxBottom.getChildren().add(hBoxTextArea);
        textArea.setMaxWidth(Double.MAX_VALUE);
        HBox hBoxSendButton = new HBox();
        hBoxSendButton.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxSendButton.getChildren().add(buttonSend);
        vBoxBottom.getChildren().add(hBoxSendButton);
        borderPane.setBottom(vBoxBottom);







        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
