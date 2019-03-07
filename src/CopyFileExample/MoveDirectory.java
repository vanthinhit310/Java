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
            // Move the source directory to the destination directory.
            // The destination directory must not exists prior to the
            // move process.
            FileUtils.moveDirectory(srcDir, destDir);
            System.out.println("Copied directory successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
