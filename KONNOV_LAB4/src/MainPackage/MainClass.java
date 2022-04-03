package MainPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class MainClass {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bin bin = new Bin();
        bin.setTrue(6);

        System.out.println("GetByInd = " + bin.getByInd(6));
        
    }
    
}
