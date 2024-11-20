package Practice;
public class StringExam {
    public static void main(String[] args) {

        String R1 = "Ravi";
        String R2 = "Kiran";
        System.out.println(R1 + R2);
        String var1 = "Ravi \u00f1";
        //        char value = '\uf929';
//      In java, you can add the unicode from the unicode website table and it will display the symbol
        String var2 = "100";
        int var3 = 10;
        System.out.println(var1 + var2 + var3);
        System.out.println(Integer.parseInt(var2) + 10);
        System.out.println(var1);

        int a = 32;
        int b = 48;
        System.out.println(a - b);


    }
}
// https://studyeasy.org/course-articles/s01l11-string-basics/