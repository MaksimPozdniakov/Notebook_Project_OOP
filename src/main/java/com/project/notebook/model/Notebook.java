package com.project.notebook.model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Notebook{

    protected ArrayList<String> modelArrayList = new ArrayList<>();

    public ArrayList<String> read() throws FileNotFoundException {
        ReadFile ourDb = new ReadFile("C:\\Users\\PMPav\\Desktop\\Second block of study\\Seminars\\" +
                "Final_Project_JavaOOP\\Notebook\\src\\main\\java\\com\\project\\notebook\\db\\file.txt");
        ourDb.read(modelArrayList);
        return modelArrayList;
    }

    public void write(){
        WriteFile ourDb = new WriteFile("C:\\Users\\PMPav\\Desktop\\Projects\\Final_Project_JavaOOP\\Notebook\\" +
                "src\\main\\java\\com\\project\\notebook\\db\\file.txt");
        ourDb.write(modelArrayList);
    }

    public void getNote(ArrayList<String> ourTask) {
        modelArrayList.addAll(ourTask);
    }

    public ArrayList<String> removeNote(int index){
        modelArrayList.remove(index-1);
        return modelArrayList;
    }

    public String search(String searchString){
        StringBuilder str = new StringBuilder();
        boolean isFound = false;
        for (int i = 0; i < modelArrayList.size(); i++) {
            if (modelArrayList.get(i).contains(searchString)){
                str.append(modelArrayList.get(i));
                isFound = true;
            }
        }
        if (!isFound) {
            str.append("Такой записи нет!");
        }
        return str.toString();
    }


    public String showAll(){
        StringBuilder str = new StringBuilder();
        for (String el: modelArrayList) {
            str.append(el).append("\n");

        }
        return str.toString();
    }

}
