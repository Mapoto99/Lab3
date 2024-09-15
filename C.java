import java.util.Random;

public class C {
    public static void main(String[] args){
        String c1="John";
        String c2="Omar";
        String c3="Ahmed";
        String c4="David";
        String[] variables = {c1, c2, c3, c4};

        Random random = new Random();

        System.out.println(variables[random.nextInt(variables.length)]);
    }
}
