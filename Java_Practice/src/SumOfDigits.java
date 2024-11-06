class SumOfDigits {
    public static void main(String[] args) {
int x = 1234; // 1+2+3+4 = ?
 while(true){
     System.out.println(x%10);
     x /= 10; // x = x/10
if(x<1){
    break;
}
 }
 }
}