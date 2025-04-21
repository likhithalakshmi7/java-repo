package Module1;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 12;
        int test1 = 13;
        int test2= 14;
        int test3 = +test1;
        int test4 = -test2;
        float y = 12.2f;
        char den = 'A';
        String  z= "Harsh";
        boolean a = true;
//        System.out.println(x+ " " + y+ " "+ z+ " "+ a+ " ");
        int [] arr = {};
        int age =25;
        System.out.println(age);
        int nextYearAge = age+1;
        boolean isAdult = age>=18;
        boolean eligible = isAdult && true;
        age+=5;
        int bitResult = age& 0x0F;
        int count = -age;
        String result = (age>=18)?"Adult":"Minor";

//        System.out.println(age+ " "+ nextYearAge+" "+ isAdult + " "+ eligible + " "+bitResult+ " "+count+ " "+result);

        // Arithmetic
        System.out.println(test1 + test2);
        System.out.println(test1 - test2);
        System.out.println(test1 * test2);
        System.out.println(test1 / test2);
        System.out.println(test1 % test2);

        // Relataional
        System.out.println(test1 == test2);
        System.out.println(test1 != test2);
        System.out.println(test1 > test2);
        System.out.println(test1 < test2);
        System.out.println(test1 >= test2);
        System.out.println(test1 <= test2);

        //Logical
        System.out.println(test1 > 0 && test2 > 0);
        System.out.println(test1 > 0 || test2 > 0);
        System.out.println(!eligible);

        //Assignment
        System.out.println(test1 += 1);
        System.out.println(test1 -= 1);
        System.out.println(test1 /= 1);
        System.out.println(test1 *= 1);
        System.out.println(test1 %= 1);
        System.out.println(test2 = 16);

        // bitwise
        System.out.println(test1 & test2);
        System.out.println(test1 | test2);
        System.out.println(test1 ^ test2);
        System.out.println(test1 << 1);
        System.out.println(test2 >> 1);
        System.out.println(~test1);

        // Unary
        System.out.println(test1++);
        System.out.println(test1--);
        System.out.println(test3);
        System.out.println(test4);

        // Ternary
        System.out.println((test3>12?"Greater than 12":"Less than 12"));


    }

}