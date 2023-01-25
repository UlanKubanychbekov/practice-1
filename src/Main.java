import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        method(a);
//
//    }
//    public static void method(int a){
//        int one = a/10;
//        int two = a%10;
//        int sum = one+10*two+8;
//        System.out.println(two+""+one);
//        System.out.println(sum);
//    }
//
//        Scanner scanner = new Scanner(System.in);
////        int s = scanner.nextInt();
//        int [] s = {2,4,6,7};
//        method(s);
//
//    }
//    static void method( int ... kep){
//        int a = 0;
//        for (int i = 0; i < kep.length; i++) {
//            a+=kep[i];
//        }
//    }
//}

        varargsMethod(1, 2, 3, 4, 5);
    }

    static void varargsMethod(int... varargs) {
        int counter = 0;
        for (int i = 0; i < varargs.length; i++) {
            counter += varargs[i];
        }
        System.out.println("Summa:" + counter);
    }
}