package oj;

/**
 * @program: bintree
 * @description: 判断以p和q为根节点的两颗二叉树是否完全相同
 * https://leetcode-cn.com/problems/same-tree/submissions/
 * @author: fwb
 * @create: 2019-06-09 20:04
 **/
public class Ex3 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return  true;
        }
        if (p == null || q == null){
            return  false;
        }
        if (q.val != p.val){
            return false;
        }
        //走到这一步时，两个数根节点不为空且不相等，此时去两个二叉树子树中比较，
        //以根节点的左右子节点作为新的根节点。
        return isSameTree(q.left,p.left) && isSameTree(q.right,p.right);
    }
}
