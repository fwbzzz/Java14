package oj;

/**
 * @program: bintree
 * @description: 判断有没有相同子树，数本身也可以当做子树(实际就是查找二叉树中指定值的节点，找到后判断两颗二叉树是否完全相同)
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
 * @author: fwb
 * @create: 2019-06-09 20:17
 **/
public class Ex4 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean flag = false;
        if (s != null) {
            //找到s中值与对应t根节点相同的子节点
            if (s.val == t.val) {
                flag = isSametree(s, t);
            }
            //此时s还未遍历完，仍未找到s中值也为t的节点
            //需要递归的从s的子树中继续寻找
            if (!flag) {
                flag = isSubtree(s.left, t) || isSubtree(s.right, t);
            }
        }
        return flag;
    }

    public boolean isSametree(TreeNode p, TreeNode q) {
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
        return isSametree(q.left,p.left) && isSametree(q.right,p.right);
    }
}
