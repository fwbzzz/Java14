import java.util.Properties;

/**
 * @program: mapTest
 * @description: 属性文件操作
 * @author: fwb
 * @create: 2019-07-25 16:22
 **/
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("xa","西安");
        properties.setProperty("sh","上海");
        properties.setProperty("bj","北京");
        properties.setProperty("hz","杭州");
        System.out.println(properties.getProperty("xa"));
        System.out.println(properties.getProperty("gz.","广州"));

    }
}
