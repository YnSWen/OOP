package NotebookLib;

import java.util.Objects;

public class Notebook {
    public String color;
    public String os;
    public String brand;
    public int id;


    public Notebook (String color, String os, String brand, int id){
        this.color = color;
        this.os = os;
        this.brand = brand;
        this.id = id;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Бренд: " + brand + " Цвет: " + color + " ОС: " + os + " ID: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return color == notebook.color && os == notebook.os && brand == notebook.brand ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, os, brand, id);
    }


    



}
