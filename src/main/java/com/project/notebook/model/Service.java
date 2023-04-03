package com.project.notebook.model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Service {

    ArrayList<String> read() throws FileNotFoundException;


    void showAll();

}
