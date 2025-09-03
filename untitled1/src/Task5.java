//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {


    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if (root==null)return 0;
        //int sum=root.elem;
        //int s=+mir(root.left,root.right,sum);
        //sum+=s;
        //TO DO
        // remove this line
        //return sum;
        return mir(root.left,root.right);

    }
    public static Integer mir( BSTNode rootl, BSTNode rootr){
        //TO DO
        if (rootl==null||rootr==null)return 0;
        int sum=rootl.elem+rootr.elem;
        sum+=+mir(rootl.left,rootr.right);
        sum+=+mir(rootl.right,rootr.left);
        return sum;
    }
    //===============================================================


}