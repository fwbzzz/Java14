package fwb.shuChuLiu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @program: Io
 * @description:从文件中读取
 * @author: fwb
 * @create: 2019-08-02 14:42
 **/
public class Ex4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(File.separator + "F" + File.separator + "Users" +
                File.separator + "冯炜博" + File.separator + "Desktop" + File.separator + "ScannerTest.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        while (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(str);
        }
    }
}
