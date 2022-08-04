import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задание №1");

        int [] arrInt = new int [4];
        arrInt[0] = 6;
        arrInt[1] = 6;
        arrInt[2] = 6;
        arrInt[3] = 6;
        float [] arrFloat = {1.57f, 7.654f, 9.986f};
        int [] arrArbitrary = {3, 5, 5, 5};



        System.out.println("Задание №2");

        for(int i = 0; i < arrInt.length; i++) {

            System.out.println(arrInt[i] + ",");
        }


        for(int i = 0; i < arrFloat.length; i++) {

            System.out.println(arrFloat[i] + ",");
        }

        for(int i = 0; i < arrArbitrary.length; i++) {

            System.out.println(arrArbitrary[i] + ",");
        }


        System.out.println("Задание №3");



        for(int i = arrFloat.length - 1; i >= 0; i--) {

            System.out.println(arrFloat[i] + ",");
        }


        for(int i = arrInt.length - 1; i >= 0; i--) {

            System.out.println(arrInt[i] + ",");
        }

        for(int i = arrArbitrary.length - 1; i >= 0; i--) {

            System.out.println(arrArbitrary[i] + ",");
        }



        System.out.println("Задание №4");

        int even = 0;
        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] % 2 == 0) {
              even =  arrInt[i] + 1;
            }
            System.out.println(even);

        }


    }
}