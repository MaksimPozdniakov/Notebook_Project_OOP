package com.project.notebook.view;


import com.project.notebook.presenter.Presenter;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class Controller{

    Presenter presenter = new Presenter();

    @FXML
    private TextArea result;

    public void openNet() throws FileNotFoundException {
        result.setText("Блокнот открыт!");
        presenter.readBook();
    }

    public void showNot(){
        result.setText(presenter.print());
    }

    @FXML
    private MenuItem buttonClose;
    @FXML
    private void handelButtonClose(){
        Stage stage = (Stage) buttonClose.getParentPopup().getOwnerWindow();
        stage.close();

    }


}