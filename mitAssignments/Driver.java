package mitAssignments;
import java.util.*;

public class Driver {
	public static int getHeight(Node root){
	      //Write your code here
	      if ( root == null)
	          return 0;
	      else {
	          int leftHeight = getHeight( root.left);
	          int rightHeight = getHeight( root.right);
	          System.out.println(leftHeight);
	          System.out.println(rightHeight);
	          
	          if(leftHeight > rightHeight)
	              return (leftHeight  );
	            
	            else
	            return (rightHeight );
	      }
	    }

		public static Node insert(Node root,int data){
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
	    public static void main(String args[]){
	            Scanner sc=new Scanner(System.in);
	            int T=sc.nextInt();
	            Node root=null;
	            while(T-->0){
	                int data=sc.nextInt();
	                root=insert(root,data);
	            }
	            int height=getHeight(root);
	            System.out.println(height);
	        }	

}
