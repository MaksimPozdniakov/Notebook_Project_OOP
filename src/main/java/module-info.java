module com.project.notebook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.notebook to javafx.fxml;
    exports com.project.notebook;

    opens com.project.notebook.model to javafx.fxml;
    exports com.project.notebook.model;

    opens com.project.notebook.view to javafx.fxml;
    exports com.project.notebook.view;

    opens com.project.notebook.presenter to javafx.fxml;
    exports com.project.notebook.presenter;

}