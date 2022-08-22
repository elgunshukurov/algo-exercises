package blindQuestions;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        String a = "a.";

        check(a);

    }

    public static void check(String a){
        if (!(a.endsWith("xls") || a.endsWith("xlsx"))){
            System.out.println("i am inside");
        }
    }

    
}
