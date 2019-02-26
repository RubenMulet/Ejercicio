//<==============================MAIN===============================>
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
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

//<====================================Controller===============================>
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {


    @FXML
    void searchTitle(ActionEvent event) throws IOException {
        System.out.println("Funciona correctamente");
        Document doc= Jsoup.connect("https://www.wowchakra.com/").get();
        String title=doc.title();
        System.out.println(title);

        Elements headLines=doc.select("h1.catItemTitle");
        for (Element headLine: headLines){
            System.out.println(headLine.text());
        }
    }
}
//<=======================================Sample===================================>
<?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.Pane?>

<BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/2.2" fx:controller="sample.Controller">
  <center>
    <Pane prefHeight="200.0" prefWidth="200.0" BorderPane.alignment="CENTER">
      <children>
        <Button layoutX="274.0" layoutY="311.0" mnemonicParsing="false" onAction="#searchTitle" text="Button" />
        <TextArea fx:id="miTextArea" layoutX="122.0" layoutY="62.0" prefHeight="200.0" prefWidth="362.0" />
      </children>
    </Pane>
  </center>
</BorderPane>
