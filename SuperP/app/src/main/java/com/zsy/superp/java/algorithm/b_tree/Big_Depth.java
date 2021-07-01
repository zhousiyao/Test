package com.zsy.superp.java.algorithm.b_tree;

import org.junit.Test;

public class Big_Depth {

    @Test
    public void startMain(){

    }

    public int countDepth(TreeNode n) {
        if(n == null) return 0;

        return Math.max(countDepth(n.leftNode),countDepth(n.rightNode))+1;
    }

}
