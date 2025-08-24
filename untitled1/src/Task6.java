public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        if (root==null)return true;
        if(((root.left!=null)&&(root.left.elem>root.elem))||(root.right!=null)&&(root.right.elem<root.elem))return false;
        //TO DO
        return isBST(root.left)&&isBST(root.right); // remove this line
    }
    //===============================================================
}
