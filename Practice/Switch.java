package Practice;
class Switch {
    public static void main(String[] args) {
//        int x = 2;
//        switch (x) {
//             case 1:
//                 System.out.println(" x is 1");
//                 break;
//             case 2:
//                 System.out.println(" x is 2");
//                 break;
//               case 3:
//                     System.out.println(" x is 3");
//                     break;
//                     default:
//                         System.out.println(" x is non other than 1, 2, 3");
//        }

//        char x = 'B';
//        switch (x) {
//            case 'a':
//            case 'A':
//                System.out.println(" x is a");
//                break;
//            case 'b':
//            case 'B':
//                System.out.println(" x is b");
//                break;
//            case 'c':
//            case 'C':
//                System.out.println(" x is c");
//                break;
//            default:
//                System.out.println(" x is non other than a, b, c");
//        }


//        String x = "B";
//        switch (x.toLowerCase()) { // ttoLowerCase key word helps to convert from caps to lower case and execute the programm
//            case "a":
//                            System.out.println(" x is a");
//                break;
//            case "b":
//                          System.out.println(" x is b");
//                break;
//            case "c":
//                           System.out.println(" x is c");
//                break;
//            default:
//                System.out.println(" x is non other than a, b, c");
//        }
//    }
//}


//The switch-case statement in Java is a control structure that allows you to execute one block of code among many alternatives based on the value of an expression. It serves as a cleaner and more readable alternative to multiple if-else statements when dealing with numerous conditions.
//Syntax
//The basic syntax of a switch-case statement is as follows:
//java
//switch (expression) {
//        case value1:
//        // code block for value1
//        break;
//        case value2:
//        // code block for value2
//        break;
//// more cases...
//default:
//        // code block if no cases match
//        }

// Example

        int n = 2;
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
        }
    }
}