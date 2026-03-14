package youtube.tree;
import java.util.*;

class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }

            if(reverse)
                Collections.reverse(level);

            ans.add(level);

            reverse = !reverse;
        }

        return ans;
    }
}
syso
