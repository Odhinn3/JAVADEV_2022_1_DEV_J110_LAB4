package MainPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Odhinn3
 */
public class MainClass {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dec dec = new Dec();//устанавливаем ссылку на объекты класса Dec
        Bin bin = new Bin();//устанавливаем ссылку на объекты класса Bin
        
        System.out.println("START APP\r\n=============");
        
        //проверяем реализацию в классе Bin
        System.out.println("Реализация интерфейса в массиве логических значений");
        bin.setTrue(4);
        System.out.println("bin.setTrue 4 = " + bin.getByInd(4));
        
        bin.setByInd(3, true);
        System.out.println("bin.setByInd 3 = " + bin.getByInd(3));
        
        bin.setByInd(3, false);
        System.out.println("bin.setByInd 3 = " + bin.getByInd(3));
        
        bin.invert(2); 
        System.out.println("bin.invert 2 = " + bin.getByInd(2));
        
        bin.setFalse(2);
        System.out.println("bin.setFalse 2 = " + bin.getByInd(2));
        System.out.println("bin.trueCount = " + bin.trueCount());
        System.out.println("decArr: " + bin.arrToString());
        
        System.out.println("=============");
        
        //проверяем реализацию в классе Dec
        System.out.println("Реализация интерфейса в массиве целочисленных значений");
        dec.setTrue(1);
        System.out.println("dec.setTrue 1 = " + dec.getByInd(1));
        
        dec.setByInd(4, true);
        System.out.println("dec.setByInd 4 true = " + dec.getByInd(4));
        
        dec.setByInd(4, false);
        System.out.println("dec.setByInd 4 false = " + dec.getByInd(4));
        
        dec.invert(2); 
        System.out.println("dec.invert 2 = " + dec.getByInd(2));
 
        dec.setFalse(2);
        System.out.println("dec.setFalse 2 = " + dec.getByInd(2));
        
        dec.setTrue(6);
        System.out.println("dec.setTrue 6 = " + dec.getByInd(6));  
        System.out.println("dec.trueCount = " + dec.trueCount());
        System.out.println("decArr: " + dec.arrToString());
        System.out.println("=============\r\nEND APP");
    }
    
}
