package CopyFileExample;

import java.io.File;
import java.io.IOException;

public class TreeFolder {
    public static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 5, files[i]);

        }
    }

    public static void main(String[] args) throws IOException {
        showDir(1,new File("F:\\Picture"));
        System.out.println("Reding folder complete.");
    }
}
