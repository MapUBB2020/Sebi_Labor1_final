package com.company;

import java.util.List;

public class Problem4 {
    public static  int Cheapest_Obj(List<Integer> Pret_Tastatura){
        int min = Pret_Tastatura.get(0);
        for(int i:Pret_Tastatura)
            if(i < min)
                min = i;
        return min;
    }
    public static int Expensive_Object(List<Integer> Pret_Tastatura , List<Integer> Pret_Usb){
        int max1 = Pret_Tastatura.get(0);
        int max2 = Pret_Usb.get(0);
        for(int i:Pret_Tastatura)
            if(i > max1)
                max1 = i;
        for(int j:Pret_Usb)
            if(j > max2)
                max2 = j;

            if(max1 > max2)
                return max1;
            else
                return max2;
    }
    public static int Posibility_after_Budget(List<Integer> Pret_Usb, int budget){
        int sold_obj = 0;
        for(int i:Pret_Usb){
            if(i < budget)
                sold_obj = i;

        }
        return sold_obj;
    }
    public static int Buy_Items(List<Integer> Pret_Tastatura , List<Integer> Pret_Usb,int budget){
        int obj1 = Cheapest_Obj(Pret_Tastatura);
        int obj2 = Cheapest_Obj(Pret_Usb);
        if( obj1 + obj2 > budget)
            return -1;
        else
            return obj1 + obj2;
    }
}
