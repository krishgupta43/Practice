package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RightViewTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int d) {
			this.val = d;
			this.left = this.right = null;
		}

	} 

	public static void LevelOrderTraverse(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.print(temp.val + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
        root.left.left.left=new TreeNode(8);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.print("Level Order Travesal\n");
		LevelOrderTraverse(root);
		
		System.out.println("\nReversal Level view of Tree\n");
		ReverseLevelOrderTraverse(root);
		
		System.out.println("\nRight view of Tree\n");
		RightOrderTraverse(root);

		System.out.println("\nLeft view of Tree");
		LeftOrderTraverse(root);

	}

	public static void ReverseLevelOrderTraverse(TreeNode root) {
	    if(root==null)return;
	    Queue<TreeNode>q=new LinkedList<>();
	    Stack<TreeNode>s=new Stack<>();
	    q.add(root);
	    while(!q.isEmpty()) {
	    	TreeNode temp=q.poll();
	    	if(temp.right!=null)
	    		q.add(temp.right);
	    	if(temp.left!=null)
	    		q.add(temp.left);
	    	s.add(temp);
	    }
	    while(!s.isEmpty()) {
	    	System.out.print(s.peek().val+" ");
	    	s.pop();
	    }
		
	}

	public static void LeftOrderTraverse(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = q.poll();
				if (i == 1)
					System.out.print(temp.val + " ");
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}

		}
	}

	public static void RightOrderTraverse(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = q.poll();
				if (i == n)
					System.out.print(temp.val + " ");
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);

			}
		}

	}

}
