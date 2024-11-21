public class EnancedFor2 
{
    public static void main(String[] args)
    {
      
        int[][] twoDArray = { {1, 2, 3, 4}, {5, 6, 7, 8} };
 
       
        for (int[] oneDArray : twoDArray)
        {
            System.out.print("[");
 
           
            for (int i : oneDArray)
            {
                System.out.print(i+"\t");
            }
            System.out.println("]");
        }
    }
}
