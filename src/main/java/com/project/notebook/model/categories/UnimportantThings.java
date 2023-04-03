package com.project.notebook.model.categories;


import com.project.notebook.model.baseClass.Notes;

public class UnimportantThings extends Notes {
    public UnimportantThings(String date, String nameThing, String text) {
        super(date, nameThing, text);
    }

    public String toString(){
        return "Неважная - " + "Задача поставлена: " + date + ", Название задачи: " + nameThing +
                ", Содержание: " + text;
    }
}
