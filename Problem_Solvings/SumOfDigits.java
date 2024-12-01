package Practice;
class SumOfDigits {
    public static void main(String[] args) {
int x = 123456; // 1+2+3+4 = 21
 int SumOfDigits  = 0;
 while(true){
     SumOfDigits = SumOfDigits + (x%10);
     x /= 10; // x = x/10
if(x<1){
    break;
}
 }
        System.out.println(" Sum of digits is " + SumOfDigits);
 }
}