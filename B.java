import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner scnr=new Scanner(System.in);
        ArrayList<String>lista=new ArrayList<>()
        while(true){
            String c=scnr.next();
            lista.add(c);
            if (c.equals("")) {
                break;
            }
        }
        for(String ele: lista){
            System.out.println(ele);
        }
    }
}
