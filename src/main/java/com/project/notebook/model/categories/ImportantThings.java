package com.project.notebook.model.categories;


import com.project.notebook.model.baseClass.Notes;

public class ImportantThings extends Notes {
    protected String deadline;
    public ImportantThings(String date, String deadline, String nameThing, String text) {
        super(date, nameThing, text);
        this.deadline = deadline;
    }

    public String toString(){
        return "Важная - " + "Задача поставлена: " + date + ", Выполнить до: " + deadline + ", Название задачи: " +
                nameThing + ", Содержание: " + text;
    }
}
