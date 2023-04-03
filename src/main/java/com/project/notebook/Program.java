package com.project.notebook;

import com.project.notebook.model.Notebook;
import com.project.notebook.model.Service;
import com.project.notebook.presenter.Presenter;
import com.project.notebook.view.Controller;
import com.project.notebook.view.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Program extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("notebook-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 710);
        stage.setTitle("Notebook");
        stage.setScene(scene);
        stage.show();

        View view = new Controller();
        Service service = new Notebook();
        new Presenter(view,service);

    }

    public static void main(String[] args) {
        launch();
    }
}
