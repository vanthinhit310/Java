package CopyFileExample;

import java.io.File;

public class MoveFile {
    public static void main(String[] args) {
        try{

            File afile =new File("F:\\ads2.docx");

            if(afile.renameTo(new File("F:\\tbd\\" + afile.getName()))){
                System.out.println("File is moved successful!");
            }else{
                System.out.println("File is failed to move!");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
