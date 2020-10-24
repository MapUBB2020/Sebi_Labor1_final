package com.company;

import java.util.List;

public class Problem2 {
    public static int maxim(List<Integer> sir){
        int max = sir.get(0);
        for(int i:sir){
            if(i > max)
                max = i;
        }
        return max;
    }
    public static int minim(List<Integer> sir){
        int min = sir.get(0);
        for(int i:sir)
            if(i < min)
                min = i;
        return min;
    }
    public static int Suma_Max(List<Integer> sir){
        int sumaMax = 0;
        int cel_mai_mic_nr = minim(sir);
        for(int i:sir){
            if(i != cel_mai_mic_nr)
                sumaMax+=i;
        }
        return sumaMax;
    }
    public static int Suma_Min(List<Integer> sir){
        int sumaMin = 0;
        int cel_mai_mare_nr = maxim(sir);
        for(int i:sir){
            if(i != cel_mai_mare_nr)
                sumaMin+=i;
        }
        return sumaMin;

    }
}
