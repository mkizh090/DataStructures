package TreeFromBottom;



//Full Binary Tree- Every node has two children except leaves
//Completer Binary Tree- A binary tree which is completely filled with a possible exception at the bottom level
//Perfect Binary Tree --> No leaves- Max number of nodes
public class TreeNode {
    int data;
    public TreeNode parent;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode (int d){
       this.data = d;
        this.parent = null;
        this.leftChild= null;
        this.rightChild= null;

    }


    public static void main(String args[]){


    }

}

class Tree{
    public TreeNode root;
    public Tree(TreeNode n){
        this.root = n;
        }

        public static void main(String [] args){

        }
        }
