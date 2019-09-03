package oj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

//根据指定的根节点root，返回其前序遍历的结果
public class Ex1{
    List<Integer> list = new ArrayList<>();
    //不能写在方法中的原因是，递归会一次又一次的调用这个方法，也就会不断产生新的ArraList<>()
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return Collections.emptyList();//防止出现空指针异常
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
