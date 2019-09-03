
public interface ISequence {
    //在pso位置插入val
    boolean add(int pos, Object data);

    //查找关键字key，找到返回key的下标，没有返回-1
    int search(Object key);

    //查找关键字key是否在这个顺序表中（这个和search有点重复）
    boolean contains(Object key);

    //得到pos位置的值
    Object getPos(int pos);

    //删除第一次出现的关键字key
    Object delete(Object key);

    //得到顺序表的长度
    int size();

    //打印顺序表
    void display();

    //清空数据表以防内存泄漏
    void clear();
}

public class SequenceImpl implements ISequence {
    private Object elemenData;
    public int  usedSize;
    public static final int DEFAULT_CAPACITY = 10;//数组初值设为10

    //构造方法
    public SequenceImpl() {
        this.elemData = new Object[DEFAULT_CAPACITY];
        this.usedSize = 0;
    }

    public boolean add(int pos, Object data){
        if()
    }

}
