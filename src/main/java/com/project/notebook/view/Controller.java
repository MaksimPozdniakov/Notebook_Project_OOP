package com.project.notebook.view;


import com.project.notebook.presenter.Presenter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class Controller{

    Presenter presenter = new Presenter();

    @FXML
    private Button buttonClose;
    @FXML
    private void handelButtonClose(){
        Stage s = (Stage) buttonClose.getScene().getWindow();
        s.close();
    }
    @FXML
    private TextArea result;

    public void openNet() throws FileNotFoundException {
        result.setText("Блокнот открыт!");
        presenter.readBook();
    }

    public void showNot(){
        result.setText(presenter.print());
    }

}