package fwb.shuChuLiu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @program: Io
 * @description: 输入到文件中
 * @author: fwb
 * @create: 2019-08-02 14:28
 **/
public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(File.separator + "F" + File.separator + "Users" +
                File.separator + "冯炜博" + File.separator + "Desktop" + File.separator + "ScannerTest.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));
        printStream.println("姓名：ZZZ");
        printStream.println(20);
        printStream.close();
    }
}
