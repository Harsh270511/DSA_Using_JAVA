//Search a BST
package ApnaCollege.L29BST1;

public class notes3 {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data= data;
      this.left = null;
      this.right= null;
    }
  }
  public static boolean searchBst(Node root, int key){
    //base case
    if(root==null){
      return false;
    }
    if(root.data == key){
      return true;
    }
    if(root.data < key){
      return searchBst(root.right, key);
    }else{
      return searchBst(root.left, key);
    }
  }
  public static Node insert(Node root, int val){
    if(root==null){
      root = new Node(val);
      return root;
    }
    if(root.data < val){
      root.right = insert(root.right, val);
    }else{
      root.left= insert(root.left, val);
    }
    return root;
  }
  public static void inOrder(Node root){
    if(root==null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  public static void main(String[] args) {
    int[] values = {8,5,3,6,1,4,10,11,14};
    Node root= null;

    for(int i=0; i< values.length;i++){
      root=insert(root, values[i]);
      
    }
    inOrder(root);
    System.out.println();
    
    if(searchBst(root, 81)){
      System.out.println("Found");
    }else{
      System.out.println("Not found");
    }
  }
}
