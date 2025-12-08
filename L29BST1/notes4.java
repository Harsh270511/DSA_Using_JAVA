//delete a node
package L29BST1;

public class notes4 {
  static class Node{
    int data;
    Node left, right;
    Node(int data){
      this.data= data;

    }
  }
  //Function to Insert the value in form of BST
  public static Node insert(Node root, int val){
    if(root== null){
      root= new Node(val);
      return root;
    }
    if(root.data < val){
      root.right= insert(root.right, val);

    }else if(root.data > val){
      root.left= insert(root.left, val);
    }
    return root;
  }
  //Function for the Inorder traversal
  public static void InOrder(Node root){
    if(root==null){
      return;
    }
    InOrder(root.left);
    System.out.print(root.data+" ");
    InOrder(root.right);
  }
  //function to delete the Node
  public static Node delete(Node root, int val){
    if(root.data > val){
      root.left = delete(root.left, val);
    }else if(root.data < val){
      root.right = delete(root.right, val);
    }else{//voila 
      //case 1--> No child(leaf Node)
      if(root.left==null && root.right==null){
        return null;
      }

      //case 2--> Single child
      if(root.left==null){
        return root.right;
      }else if(root.right==null){
        return root.left;
      }

      //case 3--> Two childern
      Node IS= FindInorderSuccessor(root.right);
      root.data = IS.data;
      root.right =delete(root.right,IS.data );
    }
    return root;
  }
  //Function to find the Inorder Successor
  public static Node FindInorderSuccessor(Node root){
    while(root.left != null){//root will never be null as we already check root = null condition upr hei
      root= root.left;
    }
    return root;
  }
  public static void main(String[] args) {
    int[] values={8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i=0; i< values.length; i++){
      root = insert(root, values[i]);
    }
    InOrder(root);
    System.out.println();

    root = delete(root,5);
    System.out.println();

    InOrder(root);
  }
}
