package com.project.notebook.presenter;

import com.project.notebook.model.Service;
import com.project.notebook.view.View;

import java.io.FileNotFoundException;

public class Presenter {

    private View view;
    private final Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void readBook() throws FileNotFoundException {
        service.read();
    }

    public void print(){
        service.showAll();
    }

}
