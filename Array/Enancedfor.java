public class Enancedfor {  // for-each loop in java is the enhanced version of for loop. It is introduced from  JDK 5. It is used to iterate all elements of an array or Collection.
    public static void main(String[] args) 
    {
        
      // create an array
      int[] numbers = {3, 9, 5, -5};
      
      // for each loop or Enanced for loop
             for (int number: numbers) 
              {
                System.out.println(number);
            }
      int sum = 0;

            // iterating through each element of the array 
          for(int number: numbers)
             {
                sum += number;
            }
  
             System.out.println("Sum = " + sum);
    }
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    // iterating through an array using a for loop
    for (int v)
     {
      System.out.println(vowels[i]);

  }
}

