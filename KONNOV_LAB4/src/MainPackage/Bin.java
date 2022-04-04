package MainPackage;

import java.util.Arrays;

/**
 *
 * @author Odhinn3
 */
public class Bin implements Method {
    private int ind;
    private int size = 1024;//размер коллекции
    private boolean boolArr[] = new boolean[size];//нициализация массива коллекции булевских значений

    //конструкторы
    public Bin() {}

    public Bin(int ind) {
        setInd(ind);
    }

    //геттер и сеттер индекса для реализации его проверки
    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        if (ind < 0){
            throw new IllegalArgumentException("Индекс меньше нуля");
            }
        this.ind = ind;
    }
  
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
