package com.project.notebook.presenter;

import com.project.notebook.model.Notebook;
import java.io.FileNotFoundException;

public class Presenter{

    Notebook notebook = new Notebook();

    public void readBook() throws FileNotFoundException {
        notebook.read();
    }

    public String print(){
        return notebook.showAll2();
    }



}
