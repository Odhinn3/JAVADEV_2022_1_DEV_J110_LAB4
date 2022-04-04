package MainPackage;

import java.util.Arrays;

/**
 *
 * @author Odhinn3
 */
public class Dec implements Method {
    private int size = 1024;//размер коллекции
    private int intArr[] = new int[size/32];//размер массива целочисленных значений

    //конструктор по умолчанию
    public Dec() {}
    
    //реализация интерфейса Method в целочисленном массиве
    @Override//проверка элемента с заданным индексом
    public boolean getByInd(int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        return (elem & mask) == mask;
    }
    
    @Override//установка в true элемента с заданным индексом
    public void setTrue (int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        intArr[elemInd] = elem | mask;
    }
    
    @Override//установка в заданное значение элемента с заданным индексом
    public void setByInd(int ind, boolean val){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        if (val){
            int mask = 1 << bitInd;
            intArr[elemInd] = elem | mask;
            }
        else {
            int mask = ~(1 << bitInd);//инвертируем маску для работы оператора and
            intArr[elemInd] = elem & mask;
        }
    }
    
    @Override//установка в false элемента с заданным индексом
    public void setFalse(int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = ~(1 << bitInd);//инвертируем маску для работы оператора and
        intArr[elemInd] = elem & mask;
    }
    
    @Override//инвертирование элемента с заданным индексом    
    public void invert (int ind){
        int elemInd = ind/32;
        int bitInd = ind%32;
        int elem = intArr[elemInd];
        int mask = 1 << bitInd;
        intArr[elemInd] = elem ^ mask;
    }
    
    @Override//количество элементов true
    public int trueCount(){
        int count = 0;
        for (int i = 0; i<intArr.length; i++)
            if (getByInd(i))
                ++count;
        return count;    
    }
    
    @Override//приведение массива к строке нулей и единиц
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
