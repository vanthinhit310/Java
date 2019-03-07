package CopyFileExample;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class MoveDirectory {
    public static void main(String[] args) {
        String source = "F://tbd";
        File srcDir = new File(source);

        String destination = "F://tmp";
        File destDir = new File(destination);

        try {
            FileUtils.moveDirectory(srcDir, destDir);
            System.out.println("Copied directory successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
