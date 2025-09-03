
public class Task4 {
    public static Integer rangeSum(BSTNode root,Integer low,Integer high){

        if (root ==null)return 0;

        if (root.elem<low)
            return rangeSum(root.right, low,high);


        else if (root.elem>high)

            return rangeSum(root.left, low, high);
        else
            return root.elem + rangeSum(root.left,low,high)+rangeSum(root.right,low,high);
    }
}