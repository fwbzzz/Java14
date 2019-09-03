package oj;

/**
 * @program: bintree
 * @description: https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * 输出二叉树的结构
 * @author: fwb
 * @create: 2019-06-06 21:45
 **/
public class Ex2 {
    public String tree2str(TreeNode t){
        StringBuilder res = new StringBuilder();
        tree2str(t,res);
        return res.toString();
    }
    private void tree2str(TreeNode node,StringBuilder res){
        if (node == null){
            return;
        }
        res.append(node.val);
        if (node.left != null){
            res.append("(");
            tree2str(node.left,res);
            res.append(")");
        }else {
            //左子树为空，同时右子树不为空
            if (node.right != null){
                res.append("()");
            }
        }
        if (node.right != null){
            res.append("(");
            tree2str(node.right,res);
            res.append(")");
        }
    }
}
