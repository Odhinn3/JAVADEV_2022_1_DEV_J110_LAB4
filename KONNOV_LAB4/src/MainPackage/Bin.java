
package MainPackage;

import java.util.Arrays;

public class Bin implements Method {
    int size = 1024;//размер коллекции
    boolean boolArr[] = new boolean[size];//нициализация массива коллекции булевских значений

    //конструктор по умолчанию
    public Bin() {}
    
    //реализация интерфейса Method в массиве логических значений
    @Override//проверка элемента с заданным индексом
    public boolean getByInd(int ind){
        return boolArr[ind];
    }
    
    @Override//установка в true элемента с заданным индексом
    public void setTrue (int ind){
        boolArr[ind] = true;
    }
    
    @Override//установка в заданное значение элемента с заданным индексом
    public void setByInd(int ind, boolean val){
        boolArr[ind] = val;
    }
    
    @Override//установка в false элемента с заданным индексом
    public void setFalse(int ind){
        boolArr[ind] = false;
    }
    
    @Override//инвертирование элемента с заданным индексом
    public void invert (int ind){
        boolArr[ind] =! boolArr[ind];
    }    
    
    @Override//количество элементов true
    public int trueCount(){
        int count = 0;
        for (int i = 0; i<boolArr.length; i++)
            if (getByInd(i))
                ++count;
        return count;
    }
    
    @Override//приведение массива к строке нулей и единиц
    public String arrToString(){
        String strArr[] = new String[boolArr.length];
        for (int i = 0; i<boolArr.length; i++)
            if (getByInd(i))
                strArr[i] = "1";
            else
                strArr[i] = "0";
        return Arrays.toString(strArr);
    }    
}
