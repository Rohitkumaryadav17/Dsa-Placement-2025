public class binarytree {
     static class node{
        int data;
        node left;
        node right;

        node ( int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
     }
     static class Binarytree{
           static int index=-1;
          public static int buildTree(int node){
            index++;
            if(node[index]==-1){
                return null;


            }
            node newnode=new node(node[index]);
            new Node.left=buildTree(node);


          }

     }
   
    public static void main(String[] args) {
        
    }
    
}
