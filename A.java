public class A{
public static void Main() {
        int c1, c2, c3, c4, c5;
        c1=3;
        c2=4;
        c3=5;
        c4=A.adder(c1, c2);
        c5=A.adder(c2, c3);
    }
    public static int adder(int a,int y){
        return y+a;
    }
}