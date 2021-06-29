package com.zsy.superp.java.algorithm.b_tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

public class BTreeTraversal {

    @Test
    public void mainStart() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        n1.leftNode = n2;
        n1.rightNode = n3;
        n2.leftNode = n4;
        n2.rightNode = n5;
        n3.leftNode = n6;
        n3.rightNode = n7;
        n5.leftNode = n8;
        n5.rightNode = n9;
        n9.leftNode = n10;
        n7.rightNode = n11;

//        preTraversal(n1);
//        System.out.print(maxDepth(n1));
        System.out.println();
        preTraversalWhile(n1);
        System.out.println();
        System.out.print("Recursion:");
        minTraversal(n1);
        System.out.println();
        System.out.print("while    :");
        minTraversalWhile(n1);
        System.out.println();
        System.out.print("while2   :");
        minTraversalWhile2(n1);
        System.out.println();
        System.out.print("while3   :");
        inorderTraversal(n1);
        System.out.println();
        lastTraversal(n1);
    }

    public static void preTraversal(TreeNode treeNode){

        if(null != treeNode){
            System.out.print(treeNode.data + ", ");
            preTraversal(treeNode.leftNode);
            preTraversal(treeNode.rightNode);
        }

    }
    public static void minTraversal(TreeNode treeNode){

        if(null != treeNode){
            minTraversal(treeNode.leftNode);
            System.out.print(treeNode.data + ", ");
            minTraversal(treeNode.rightNode);
        }

    }
    public static void lastTraversal(TreeNode treeNode){

        if(null != treeNode){
            lastTraversal(treeNode.leftNode);
            lastTraversal(treeNode.rightNode);
            System.out.print(treeNode.data + ", ");
        }

    }

    public static void preTraversalWhile(TreeNode treeNode){
        if(null == treeNode){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = treeNode;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                System.out.print(cur.data + ", ");
                stack.push(cur);
                cur = cur.leftNode;
            }
            cur = stack.pop().rightNode;

        }

    }

    public static void minTraversalWhile(TreeNode root){
        if(null == root){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curLeft = root.leftNode;
        while (null != curLeft || !stack.isEmpty()){
            while (null != curLeft){
                System.out.print(curLeft.data + ", ");
                stack.push(curLeft);
                curLeft = curLeft.leftNode;
            }
            curLeft = stack.pop().rightNode;
        }
        System.out.print(root.data + ", ");
        TreeNode curRight = root.rightNode;
        while (null != curRight || !stack.isEmpty()){
            while (null != curRight){
                System.out.print(curRight.data + ", ");
                stack.push(curRight);
                curRight = curRight.leftNode;
            }
            curRight = stack.pop().rightNode;
        }

    }

    public static void minTraversalWhile2(TreeNode root){
        if(null == root) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (null != cur || !stack.isEmpty()){
            while (null != cur){
                stack.push(cur);
                cur = cur.leftNode;
            }

            TreeNode t = stack.pop();
            System.out.print(t.data + ", ");
            cur = t.rightNode;
        }

    }

    public void inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        if(root == null){
            return;
        }
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.leftNode;
            }
            TreeNode pop = stack.pop();
            System.out.print(pop.data + ", ");//注意：深刻理解打印该节点的位置，下面会进行讲解
            cur = pop.rightNode;
        }
    }

    public static int maxDepth(TreeNode node){
        if(null == node){
            return 0;
        }

        return Math.max(maxDepth(node.leftNode),maxDepth(node.rightNode))+1;
    }

}
