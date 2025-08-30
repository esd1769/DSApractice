// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum(BTNode root) {
        //TO DO
        //return null; //remove this line
        return levhelper(root, 0);
    }

    private static int levhelper(BTNode node, int level){
        if (node==null) return 0;

        int val = (Integer)node.elem;
        if (level % 2==1) {
            return val+ levhelper(node.left,level + 1)+ levhelper(node.right,level+ 1);
        } else {
            return -val+levhelper(node.left,level+1)+levhelper(node.right, level+1);
        }


        //============================================================================


    }
}