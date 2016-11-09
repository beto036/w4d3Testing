package com.example.admin.w4d3testing;

/**
 * Created by admin on 11/9/2016.
 */
public class CalculatorHelper {
    public int sumItems(int i, int i1) {
        return i+i1;
    }

    public int multiplyItems(int i, int i1) {
        int result = 0;
        if(i > 0){
            for (int a = 0 ; a < i ; a++){
                result = sumItems(result,i1);
            }
            return result;
        }
        else {
            for (int a = 0; a > i; a--) {
                result = sumItems(result, i1);
            }
            return -result;
        }
    }

    public int powerItems(int i, int i1) {
        int result = i;
        if(i1 > 0) {
            for (int j = 1; j < i1; j++) {
                result = multiplyItems(result, i);
            }
            return result;
        }
        else{
            for (int j = -1; j > i1; j--) {
                result = multiplyItems(result,i);
            }
            return -result;
        }
    }
}
