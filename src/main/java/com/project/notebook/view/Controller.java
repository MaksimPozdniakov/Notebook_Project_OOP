package com.project.notebook.view;

import com.project.notebook.model.categories.ImportantThings;
import com.project.notebook.model.categories.ProductList;
import com.project.notebook.model.categories.UnimportantThings;
import com.project.notebook.presenter.Presenter;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.util.Optional;


public class Controller{

    Presenter presenter = new Presenter();

    @FXML
    private TextArea result;

    public void openNet() throws FileNotFoundException {
        result.setText("Блокнот открыт!");
        presenter.readBook();
    }

    public void showNet(){
        result.setText(presenter.print());
    }


    public void addImportantThings(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Dialog");

        dialog.setHeaderText("Укажите дату добавления:");
        Optional<String> result1 = dialog.showAndWait();
        String date = result1.orElse("");

        dialog.setHeaderText("Укажите дедлайн:");
        Optional<String> result2 = dialog.showAndWait();
        String deadline = result2.orElse("");

        dialog.setHeaderText("Укажите название задачи:");
        Optional<String> result3 = dialog.showAndWait();
        String nameThing = result3.orElse("");

        dialog.setHeaderText("Напишите описание задачи:");
        Optional<String> result4 = dialog.showAndWait();
        String text = result4.orElse("");
        presenter.addNote(new ImportantThings(date, deadline, nameThing, text));
    }

    public void addUnimportantThings(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Dialog");

        dialog.setHeaderText("Укажите дату добавления:");
        Optional<String> result1 = dialog.showAndWait();
        String date = result1.orElse("");

        dialog.setHeaderText("Укажите название задачи:");
        Optional<String> result3 = dialog.showAndWait();
        String nameThing = result3.orElse("");

        dialog.setHeaderText("Напишите описание задачи:");
        Optional<String> result4 = dialog.showAndWait();
        String text = result4.orElse("");
        presenter.addNote(new UnimportantThings(date,nameThing,text));
    }

    public void addProductList(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Dialog");

        dialog.setHeaderText("Укажите дату добавления:");
        Optional<String> result1 = dialog.showAndWait();
        String date = result1.orElse("");

        dialog.setHeaderText("Укажите название задачи:");
        Optional<String> result3 = dialog.showAndWait();
        String nameThing = result3.orElse("");

        dialog.setHeaderText("Напишите описание задачи:");
        Optional<String> result4 = dialog.showAndWait();
        String text = result4.orElse("");

        presenter.addNote(new ProductList(date,nameThing,text));
    }


    @FXML
    private MenuItem buttonClose;
    @FXML
    private void handelButtonClose(){
        Stage stage = (Stage) buttonClose.getParentPopup().getOwnerWindow();
        stage.close();

    }


}
