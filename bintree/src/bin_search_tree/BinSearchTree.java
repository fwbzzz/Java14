/*
二分搜索树
 */
package bin_search_tree;

import bin_tree.BInTree;

/**
 * @program: bintree
 * @description:
 * @author: fwb
 * @create: 2019-06-05 19:51
 **/
public class BinSearchTree<E extends Comparable<E>> implements BInTree<E> {

    private class Node{
        E data;
        Node left;
        Node right;

        public Node(E e) {
            data = e;
        }
    }
    private Node root;
    private int size;

//    public void add(E e) {
//        if (root == null){
//            Node node = new Node(e);
//            root = node;
//            size++;
//        }
//        //递归寻找插入位置
//        add(root,e);
//    }
//    /**
////    * @Description:  以指定节点node为根节点，插入指定元素e
////    * @Param: [node, e]
////    * @return: void
////    */
////    private void add(Node node,E e){
////        //插入的值刚好是当前树根节点的值
////        if (node.data.compareTo(e) == 0){
////            return;
////        }
////        //找到插入位置，在左子树做插入（小的放左边）
////        else if(e.compareTo(node.data) < 0 && node.left == null){
////            Node newNode = new Node(e);
////            node.left = newNode;
////            size++;
////        }
////        //找到插入位置，在左子树做插入（大的放右边）
////        else if (e.compareTo(node.data) > 0 && node.right == null){
////            Node newNode = new Node(e);
////            node.right = newNode;
////            size++;
////        }
////        else if (e.compareTo(node.data) < 0){
////            //递归寻找左树位置
////            add(node.left,e);
////        }else{
////            // 递归寻找右树位置
////            add(node.right,e);
////        }
////    }

    //优化后的add方法
    public void add(E e) {
        root = add(root,e);
    }
    /**
    * @Description: 以当前node作为根节点，插入元素为e的节点，返回插入后的树的根节点。
    * 根据传入的根节点的数，找到他的插入位置，返回调整后的新的树的根节点
    * @Param: [node, e]
    * @return: void
    */
    private Node add(Node node,E e){
        //如果为空
        if (node == null){
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        //如果不为空，判断此时e到底是在左树还是在右树插入
        if (e.compareTo(node.data) < 0){
            node.left = add(node.left,e);
        }
        if (e.compareTo(node.data) > 0){
            node.right = add(node.right,e);
        }
        return node;
    }

    @Override
    public boolean contains(E e) {
        if (root == null){
            return false;
        }
        return contains(root,e);
    }

    //递归
    private boolean contains(Node node,E e){
        if (node == null){
            return false;
        }
        if (node.data.compareTo(e) == 0){
            return true;
        }
        else if (e.compareTo(node.data) < 0){
            return contains(node.left,e);
        }else {
            return contains(node.right,e);
        }
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }
    /***
    * @Description: 以当前节点作为根节点进行前序遍历
    * @Param: [node]
    * @return: void
    */
    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    /***
    * @Description: 以node为根节点进行中序遍历
    * @Param: [node]
    * @return: void
    */
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }


    @Override
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    //不一定是做左子树的叶子节点，应该一直递归向左走直到走不动为止，此时节点即为所求。
    @Override
    public E getMin() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty!");
        Node node  = getMinNode(root);
        return node.data;
    }
    /**
    * @Description: 查找以node为根节点的二分搜索树的最小值节点。
    * @Param: [node]
    * @return: bin_search_tree.BinSearchTree<E>.Node
    */
    private Node getMinNode(Node node){
       if (node.left == null){
           return node;
       }
       return getMinNode(node.left);
    }
    //应该一直递归向右走直到走不动为止，此时节点即为所求。
    @Override
    public E getMax() {
        if (root == null)
            throw new IllegalArgumentException("BST is empty!");
        Node node = getMaxNode(root);
        return node.data;
    }

    private Node getMaxNode(Node node){
        if (node.right == null){
            return node;
        }
        return getMaxNode(node.right);
    }

    @Override
    public E removeMin() {
        E result = getMin();
        root = removeMInNode(root);
        return result;
    }

    /**
    * @Description: 删除传入二叉树的最小值节点，返回删除后二叉树的根节点。
    * @Param: [node]
    * @return: bin_search_tree.BinSearchTree<E>.Node
    */
    private Node removeMInNode(Node node){
        //找到需要删除的节点
        if (node.left == null){
            Node rigthNode = node.right;
            node.right = null;
            size--;
            return rigthNode;
        }
        //向左一直走直到找到最小值节点
        node.left = removeMInNode(node.left);
        return node;
    }

    @Override
    public E removeMax() {
        E result = getMax();
        root = removeMaxNode(root);
        return result;
    }

    private Node removeMaxNode(Node node){
        if (node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMInNode(node.right);
        return node;
    }

    /*
    HIbbard Deletion
    找到该节点的前驱或者后继节点，替换（找左子树的右节点，找右子树的左节点）
     */
    public void remove(E e) {
        root = remove(root,e);
    }
    /**
    * @Description:删除以node为根节点且值为e的节点，返回删除后的二叉树根节点
    * @Param:
    * @return:
    */
    private Node remove(Node node,E e){
        if (node == null){
            return null;
        }
        //如果节点.data < e,则在节点的左子树中寻找
        if (e.compareTo(node.data) < 0){
            node.left = remove(node.left,e);
        }
        //如果节点.data > e,则在节点的右子树中寻找
        if (e.compareTo(node.data) > 0){
            node.right = remove(node.right,e);
        }
        //此时node就为要删除的节点（此时node.data == e）
        else{
            //若此时节点只有一边孩子
            if (node.left != null && node.right == null){
                Node leftNode = node.left;
                size--;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null){
                Node rightNode = node.right;
                size--;
                node.right = null;
                return rightNode;
            }
            if (node.right != null && node.right != null){
                //首先找到前驱或者后继节点（左树最大，右树最小）
                Node successor = getMinNode(node.right);
                //将原节点的左子树链在后继节点上（右子树中最小的）
                successor.left = node.left;
                //将原节点的删除了后继节点的右子树链接在后继节点上
                successor.right = removeMInNode(node.right);
                //删除node
                node.left = node.right = null;
                return successor;
            }
        }
        return node;
    }

    public int size() {
        return size;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        genrateTreeStruct(root,0,res);
        return res.toString();
    }
    //输出当前树的结构（根据前序遍历）
    private void genrateTreeStruct(Node node,int depth,StringBuilder res){
        if (node == null){
            res.append("null" + "\n");
            return;
        }
        res.append(generateGang(depth) + node.data + "\n");
        genrateTreeStruct(node.left,depth + 1,res);
        genrateTreeStruct(node.right,depth + 1,res);
    }
    private String generateGang(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < depth;i++){
            sb.append("--");
        }
        return sb.toString();
    }
}
