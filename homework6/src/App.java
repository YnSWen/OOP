import java.util.HashSet;

import NotebookLib.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        Notebook notebook1 = new Notebook("Black", "Windows", "Asus", 1);
        Notebook notebook2 = new Notebook("White", "Windows", "Lenovo", 2);
        Notebook notebook3 = new Notebook("Black", "MacOS", "Apple", 3);

        HashSet<Notebook> notebookSet = new HashSet<Notebook>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);

        System.out.println(notebook1);
        System.out.println(notebook2);
        System.out.println(notebook3);

        System.out.println(notebook1.equals(notebook3));
        System.out.println(notebookSet.contains(notebook3));

    }
}
