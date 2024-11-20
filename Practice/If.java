package Practice;
class If{
    public static void main(String[] args){
        int a = 15;
        int b = 15;

//       Simple If statement
//        if(a > b);{
//            System.out.println("Statement is true");
//        }

//        Example of If Else Statement
//        if(a != b){
//            System.out.println("Statement is true");
//        }else {
//            System.out.println("Statement is false");
//        }

//        Example of if else if statement
//        if(a != b){
//            System.out.println("Statement is false");
//        }else if(a < b) {
//            System.out.println("Statement is true");
//        }else {
//            System.out.println("Null");
//        }

//        int x = 5;
//        int y = 10;
//        if((x < y) && (x >= y)){
//            System.out.println("Condition is true");
//        }else {
//             System.out.println("Condition is false");
//        }

        int getDl = 19;
        int getMarried = 26;

        if((getDl >= 18) && (getMarried >= 21)){
            System.out.println("Eligible for DL");
        }else {
            System.out.println("Eligible for Married");
        }
    }
}