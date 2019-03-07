package CopyFileExample;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File afile = new File("F:\\ads.docx");
            File bfile = new File("F:\\ads2.docx");

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            System.out.println("File is write successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
