/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MainPackage;

public interface Method {
    boolean getByInd(int ind);//проверка элемента с заданным индексом
    void setTrue (int ind);//установка в true элемента с заданным индексом
    void setByInd(int ind, boolean val);//установка в заданное значение элемента с заданным индексом
    void setFalse (int ind);//установка в false элемента с заданным индексом
    void invert (int ind);//инвертирование элемента с заданным индексом
    int trueCount();//количество элементов true
    String arrToString();//приведение массива к строке нулей и единиц

    
}
