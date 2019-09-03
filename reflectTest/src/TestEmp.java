/*
如果将这样的数据放到一个文件中去

 */
/*
1.
public String[] split(String regex, int limit)
根据匹配给定的正则表达式来拆分字符串。
regex -- 正则表达式分隔符。
limit -- 分割的份数。
2.
public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)
方法返回字符串的子字符串。
beginIndex -- 起始索引（包括）, 索引从 0 开始。
3.
char toUpperCase(char ch)方法用于将小写字符转换为大写。
ch -- 要转换的字符。
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestEmp {
    public static void main(String[] args) {
        String line = "ename:Jack|job:SoftDev|skill:Java";
        Emp emp = new Emp();
        String[] attributes = line.split("\\|");
        for (String attribute : attributes
             ) {
            setXxx(emp,attribute);
        }
        System.out.println(emp);
    }

    //Setter赋值
    public  static void setXxx(Emp emp,String kv){
        Class classz = emp.getClass();
        //Setter方法特点： set + 属性名的首字母大写
        String[] segments = kv.split(":");
        //属性，分完之后第零格就是
        String attribute = segments[0];
        //set方法名，取首字母（0-1)转为大写，然后判断长度如果大于一再从一开始截取
        String attributeMethodName = "set" + attribute.substring(0,1).toUpperCase() +
                ((attribute.length()>1) ? attribute.substring(1) : "");
        try {
            Method method =  classz.getDeclaredMethod(attributeMethodName,String.class);
            method.invoke(emp,segments[1]);//放法调用
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Method method = classz.getMethod(attributeMethodName,String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}


class Emp{

    private String ename;
    private String job;
    private String skill;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}

