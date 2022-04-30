/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.examenfinal.pkg202103095;
import java.util.Scanner;
/**
 *
 * @author naomi
 */
public class IPC1ExamenFinal202103095 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        int opcion =0;
        Scanner sn = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("* 1. Problema1                    *");
        System.out.println("* 2. Problema2                    *");
        System.out.println("* 3. Problema3                    *");
        System.out.println("* 4. Salir                        *");
        System.out.println("***********************************");
        System.out.println("ELIJA UNA OPCIÓN");
        opcion = sn.nextInt();
        do{
            switch (opcion){
                case 1: 
                    System.out.println("PROBLEMA1");
                    break;
                case 2: 
                    System.out.println("PROBLEMA2");
                    break;
                    
                case 3:
                    System.out.println("PROBLEMA3");
                    break;
            }
            System.out.println("***********************************");
            System.out.println("* 1. Problema1                    *");
            System.out.println("* 2. Problema2                    *");
            System.out.println("* 3. Problema3                    *");
            System.out.println("* 4. Salir                        *");
            System.out.println("***********************************");
            System.out.println("ELIJA UNA OPCIÓN");
            opcion = sn.nextInt();
        
        }while(!(opcion==4));
        System.out.println("SALIDA");
    }
    
}
