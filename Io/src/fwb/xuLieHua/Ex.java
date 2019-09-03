package fwb.xuLieHua;

import java.io.*;

/**
 * @program: Io
 * @description: 序列化
 * @author: fwb
 * @create: 2019-08-02 14:55
 **/
//普通类不具备序列化的能力，JVM会默认这些类不需要输出到别的地方去，只需要保存到内存即可
//如果现在希望Peron类及其对象可以作为二进制流保存到文件中或者通过网络传输就需要实现Serializable

class Person implements Serializable{
    private transient Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Ex {
    public static void main(String[] args) throws IOException {
        //希望将此对象序列化保存到文件中
        Person per = new Person(20,"fwb");
        //取得要保存的文件对象
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "序列化测试.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(per);
        out.close();
    }
}
