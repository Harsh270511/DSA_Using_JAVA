//Validate BST
package ApnaCollege.L29BST1;

public class notes7 {
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

  //Fxn to check for valid bst
  public static boolean isValidBST(Node root, Node min, Node max){
    if(root==null){
      return true;
    }
    if(min != null && root.data <= min.data){
      return false;
    }else if(max != null && root.data >= max.data){
      return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
  }
  public static void main(String[] args) {
    int[] values= {5, 3,1,4,6,7};
    Node root= null;
    for(int i =0; i< values.length;i++){
      root= insert(root, values[i]);
    }
    InOrder(root);
    System.out.println();
    if(isValidBST(root, null, null)){
      System.out.println("Valid");
    }else{
      System.out.println("Invalid");
    }
  }
}
