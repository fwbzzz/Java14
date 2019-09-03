package oj;

/**
 * @program: bintree
 * @description: 求树的深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/
 * @author: fwb
 * @create: 2019-06-09 21:36
 **/
//返回以root作为根节点的二叉树最大深度
public class Ex5 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int maxDepth = Math.max(maxDepth(root.left),maxDepth(root.right));
        return maxDepth + 1;//加上根节点
    }
}
