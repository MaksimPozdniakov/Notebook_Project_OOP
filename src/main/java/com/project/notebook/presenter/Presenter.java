package com.project.notebook.presenter;

import com.project.notebook.model.Notebook;
import com.project.notebook.model.baseClass.Notes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Presenter{

    Notebook notebook = new Notebook();

    public void readBook() throws FileNotFoundException {
        notebook.read();
    }

    public String print(){
        return notebook.showAll();
    }

    public void addNote(Notes newEl){
        ArrayList<String> ourTasks = new ArrayList<>();
        ourTasks.add(newEl.toString());
        notebook.getNote(ourTasks);
    }

}
