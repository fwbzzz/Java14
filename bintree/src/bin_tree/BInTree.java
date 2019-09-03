package bin_tree;

/**
 * @program: bintree
 * @description: 二分搜索树通用接口
 * @author: fwb
 * @create: 2019-06-05 19:45
 **/
public interface BInTree<E> {
    void add(E e);
    boolean contains(E e);
    void preOrder();//前序遍历
    void inOrder();//中序遍历
    void postOrder();//后序遍历
    E getMin();//取得最小值
    E getMax();
    E removeMin();
    E removeMax();
    void remove(E e);//移除指定节点
    int size();//取得节点个数
//    void floor();//小于该值在二叉树中的最大节点
//    void ceil();//大于该值在二叉树中的最小节点
//    void rank();//给每个节点排序
//    void select();//给出顺序，求节点
}
