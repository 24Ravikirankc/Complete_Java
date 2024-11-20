class Triangle{
    public static void main(String[] args) {


//        // for (int i = 0; i < 10; i++) {
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//            //System.out.println("iteration of i :  and iteration of j: " +j);
//        }
//        //  System.out.println("*********");
//    }
//
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//        System.out.println("****");
//        for (int j = 11; j < 20; j++){
//            System.out.println(j);
//        }
//
//        int rows = 4; // Number of rows for the triangle
//
//        // Outer loop for each row
//        for (int i = 1; i <= rows; i++) {
//            // Inner loop to print asterisks
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"); // Print a single asterisk
//            }
//            System.out.println(); // Move to the next line after each row
//        }
        // *
        // **
        // ***
        // ****


        int rows = 4; // Number of rows for the triangle

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop to print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a single asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
}
}