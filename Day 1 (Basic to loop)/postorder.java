public class postorder {
    public static void postorder(node root){
        if(root==null){
            return root;
        }
        postorder(root.left);
        postorder(root.right);
           System.out.println(root.data +" ");

    } 
    public static void main(String[]args){
    int node[]={1,2,3,4,5,6,7,8,9};
    BinaryTree tree=new BinaryTree();
    node root=tree.buildTree(node);
    tree.postorder(root);  
}

}              
          
                                              