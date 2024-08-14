package Practice;

public class BinaryTree {
  int max_sum=Integer.MIN_VALUE;
	static Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) { 
			this.data = data;
			left = right = null;
 
		}
	}

	void PrintLevelOrder() { 
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++) {
			printCurrentLevel(root, i);
		}
	}

	 void printCurrentLevel(Node root, int level) {
		if(root==null)return;
		if(level==1) {
			System.out.print(root.data+" ");
		}
		else if(level>1) {
			printCurrentLevel(root.left,level-1);
			printCurrentLevel(root.right,level-1);
		}
		
	}

	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int lh = height(root.left);
			int rh = height(root.right);

			if (lh > rh)
				return lh + 1;

			else
				return rh + 1;

		}
	}
	
	

	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println(tree.MaxPathSum(root));
        tree.PrintLevelOrder();
        
	}

	private int MaxPathSum(Node root2) {
	dfs(root);
	return  max_sum;
	}

	private int dfs(Node root) {
		if(root==null)return 0;
		int l=Integer.max(dfs(root.left),0);
		int r=Integer.max(dfs(root.right),0);
		int new_price=root.data+l+r;
		max_sum=Integer.max(max_sum, new_price);
		return root.data+Integer.max(l, r);
		
	}

}
