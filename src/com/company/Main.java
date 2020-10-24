package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Problem1
        List<Integer> note = new ArrayList<>(Arrays.asList(32, 56, 45, 88, 25, 61, 67, 49));
        System.out.println(Problem1.Ex1(note).toString());
        System.out.println(Problem1.Ex2(note));
        System.out.println(Problem1.Ex3(note).toString());
        System.out.println(Problem1.Ex4(note));

        //Problem2
        List<Integer> sir = new ArrayList<>(Arrays.asList(4, 8, 3, 10, 17));
        System.out.println(Problem2.maxim(sir));
        System.out.println(Problem2.minim(sir));
        System.out.println(Problem2.Suma_Max(sir));
        System.out.println(Problem2.Suma_Min(sir));

        //Problem3
        int [] arr1 = new int[]{8,7,0,0,0,0,0,0,0};
        int [] arr2 =  new int[]{1,3,0,0,0,0,0,0,0};
        int [] arr3 =  new int[]{8,3,0,0,0,0,0,0,0};
        int [] arr4 =  new int[]{5,4,0,0,0,0,0,0,0};
        int [] arr5 =  new int[]{2,3,6,0,0,0,0,0,0};
        int [] arr6 =  new int[]{2,3,6,0,0,0,0,0,0};
        System.out.println(Arrays.toString(Problem3.sum_array(arr1, arr2)));
        System.out.println(Arrays.toString(Problem3.diff_array(arr3, arr4)));
        System.out.println(Arrays.toString(Problem3.multiply_array(arr5, 2)));
        System.out.println(Arrays.toString(Problem3.division_array(arr6, 2)));



        //Problem4
        List<Integer> Pret_Tastatura = new ArrayList<>(Arrays.asList(15, 45, 20));
        List<Integer> Pret_Usb = new ArrayList<>(Arrays.asList(8, 12, 20, 15));
        System.out.println(Problem4.Cheapest_Obj(Pret_Tastatura));
        System.out.println(Problem4.Expensive_Object(Pret_Tastatura,Pret_Usb));
        System.out.println(Problem4.Posibility_after_Budget(Pret_Usb,18));
        System.out.println(Problem4.Buy_Items(Pret_Tastatura,Pret_Usb,10));





    }
}
