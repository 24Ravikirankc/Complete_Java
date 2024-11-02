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
//                 case 3:
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


        String x = "B";
        switch (x.toLowerCase()) {
            case "a":
                            System.out.println(" x is a");
                break;
            case "b":
                          System.out.println(" x is b");
                break;
            case "c":
                           System.out.println(" x is c");
                break;
            default:
                System.out.println(" x is non other than a, b, c");
        }
    }
}