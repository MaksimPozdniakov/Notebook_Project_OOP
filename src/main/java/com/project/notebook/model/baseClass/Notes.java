package com.project.notebook.model.baseClass;

public class Notes {

    protected String date;
    protected String nameThing;
    protected String text;

    public Notes(String date, String nameThing, String text) {
        this.date = date;
        this.nameThing = nameThing;
        this.text = text;
    }

    public String toString(){
        return date + nameThing + text;
    }

}
