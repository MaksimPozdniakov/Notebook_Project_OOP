package com.project.notebook.model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Notebook implements Service {

    protected ArrayList<String> modelArrayList = new ArrayList<>();

    public ArrayList<String> read() throws FileNotFoundException {
        ReadFile ourDb = new ReadFile("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Final_Project_JavaOOP\\Notebook\\src\\main\\java\\com\\project\\notebook\\db\\file.txt");
        ourDb.read(modelArrayList);
        return modelArrayList;
    }

    public void showAll(){
        int num = 1;
        for (String el: modelArrayList) {
            System.out.printf("\t%d) %s\n",num,el);
            num++;
        }
    }

    public String showAll2(){
        StringBuilder str = new StringBuilder();
        for (String el: modelArrayList) {
            str.append(el).append("\n");

        }
        return str.toString();
    }

}
