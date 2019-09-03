package fwb.fIleEx;
import java.io.File;
import java.io.IOException;

/**
 * @program: Io
 * @description: File文件操作类
 * @author: fwb
 * @create: 2019-07-31 13:18
 **/

public class TestFile{
    public static void main(String[] args) throws IOException {
        // separator由不同操作系统下的JVM来决定到底是哪个杠
        File file = new File(File.separator + "A" + File.separator + "Users" +
                File.separator + "冯炜博" + File.separator + "Desktop");
//        //判断父目录是否存在
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();//有多少级父目录就创建多少级，不要一级一级创建
//        }
//        if (file.exists()) {// 文件存在，进行删除
//            System.out.println("删");
//            file.delete();
//        }else {//文件不存在，建立
//            System.out.println("建");
//            file.createNewFile();
//        }


//        //判断文件是否存在且不是目录
//        if (file.exists() &&  file.isFile()){
//            long length = file.length();
//            long data = file.lastModified();//从1970年1月一日到现在过了多少毫秒
//            Date data1 = new Date(data);
//            System.out.println("文件大小" + length);
//            System.out.println("最后修改日期为" + data);
//            System.out.println("最后修改日期为" + data1);
//
//        }

        if (file.exists() && file.isDirectory()) {// 列出目录中的全部内容（存在并且是目录）
            File[] result = file.listFiles() ;
            //此循环遇到文件夹即会停止，并不会走到文件夹内部
            for (File file2 : result) {
                System.out.println(file2);
            }
            System.out.println("-----------------");
            listAllFiles(file);
        }
    }
    private static void listAllFiles (File file){
        if (file != null){
            //如果当前文件对象为文件夹
            if (file.isDirectory()){
                //继续将当前文件夹传入，继续递归
                File[] files = file.listFiles();
                //遍历文件夹中所有文件
                for (File temp : files
                     ) {
                    listAllFiles(temp);
                }
            }else{
                //如果是文件，则输出即可
                System.out.println(file);
            }
        }
    }
}
