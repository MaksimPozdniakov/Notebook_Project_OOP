package com.project.notebook.model.categories;


import com.project.notebook.model.baseClass.Notes;

public class ProductList extends Notes {
    public ProductList(String date, String nameThing, String text) {
        super(date, nameThing, text);
    }

    public String toString(){
        return "Нужно купить - " + "Задача поставлена: " + date + ", Название задачи: " + nameThing +
                ", Содержание: " + text;
    }
}
