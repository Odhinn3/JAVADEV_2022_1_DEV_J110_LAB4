/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPackage;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Bin implements Method {
    int size = 1024;
    int intArr[] = new int[size/32];

    public Bin() {
        
    }
    @Override
    public boolean getByInd(int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        return (elem & mask) == mask;
    }
    
    @Override    
    public void invert (int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        intArr[elemInd] = elem ^ mask;
    }    
    
    @Override
    public void setTrue (int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        intArr[elemInd] = elem | mask;
    }
    
    @Override
    public void setFalse(int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        intArr[elemInd] = elem & mask;
    }
    
    @Override
    public String arrToString(){
        String strArr[] = new String[intArr.length];
        for (int i = 0; i<intArr.length; i++)
            if (getByInd(i))
                strArr[i] = "1";
            else
                strArr[i] = "0";
        return Arrays.toString(strArr);
        
    }
}
