package CopyFileExample;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WfPrintW {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("F:\\a.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("Xin chào !");
        printWriter.print("Tôi tên là Lê Văn Thịnh.");
        printWriter.print("Đây là chương trình thử nghiệm chức năng ghi dữ liệu vào file");
        printWriter.close();
        System.out.println("Write data to file successful!");
    }
}
