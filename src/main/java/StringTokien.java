import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ievgenia on 18.11.2017.
 */
public class StringTokien {
    static void  stringTokien(String s) {

        String[] ss = s.split("[ !,?._'@]+");
        int size = ss.length;
        System.out.println(size);
        for (String sss : ss) {
            System.out.println(sss);

        }
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

           stringTokien("He is a very very good boy, isn't he?");

            scan.close();
        }

}
