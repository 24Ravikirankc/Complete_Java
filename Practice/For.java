package Practice;
class For{
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){  // For Loop: The loop iterates from 0 to 9.
            System.out.println(i); // Inside the loop, it prints the current value of i.
            {
                if(i == 5){
                    break;  // If i reaches 5, the loop terminates due to the break statement.
                }
            }

        }
    }
}