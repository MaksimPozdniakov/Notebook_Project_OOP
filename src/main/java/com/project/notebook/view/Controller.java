package com.project.notebook.view;

import com.project.notebook.model.Notebook;
import com.project.notebook.presenter.Presenter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class Controller implements View {

    Notebook n = new Notebook();
    private Presenter presenter;
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @FXML
    private Button buttonClose;
    @FXML
    private void handelButtonClose(){
        Stage s = (Stage) buttonClose.getScene().getWindow();
        s.close();
    }

    @FXML
    private TextArea result;

    @FXML
    private void openNet() throws FileNotFoundException {
        result.setText("Блокнот открыт!");
        n.read();
    }



    @FXML
    private void showNot(){
        n.showAll();
        result.setText(n.showAll2());
    }

}