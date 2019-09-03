package bin_search_tree;

import bin_tree.BInTree;

import java.util.ArrayList;
import java.util.List;


/**
 * @program: bintree
 * @description:
 * @author: fwb
 * @create: 2019-06-05 20:21
 **/
public class Test {
    public static void main(String[] args) {
        BInTree<Integer> binTree = new BinSearchTree<>();
        int[] num = new int[]{28,16,13,22,30,29,42};
        for (int i = 0; i < num.length; i++) {
            binTree.add(num[i]);
        }
        binTree.preOrder();
        System.out.println("-------------------");
        binTree.inOrder();
        System.out.println("-------------------");
        binTree.postOrder();
        System.out.println("-------------------");
        System.out.println(binTree);
        System.out.println("-------------------");
        System.out.println(binTree.getMin());
        List<Integer> list = new ArrayList<>();
        while (binTree.size() != 0){
            list.add(binTree.removeMin());
        }
        System.out.println(list);
        System.out.println(binTree.size());
    }

}
