/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.examenfinal.pkg202103095;
import java.util.Scanner;
import java.util.Random;
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
        Random random = new Random();
        do{
            System.out.println("***********************************");
            System.out.println("* 1. Problema1                    *");
            System.out.println("* 2. Problema2                    *");
            System.out.println("* 3. Problema3                    *");
            System.out.println("* 4. Salir                        *");
            System.out.println("***********************************");
            System.out.println("ELIJA UNA OPCIÓN");
            opcion = sn.nextInt();
            switch (opcion){
                case 1: 
                    System.out.println("PROBLEMA1");
                    System.out.println("INGRESE VALOR DE NUMERO1: ");
                    int num1 = sn.nextInt();
                    System.out.println("INGRESE VALOR DE NUMERO2: ");
                    int num2 = sn.nextInt();
                    if(num1>num2){
                        System.out.println("EL NUMERO MAYOR ES: " + num1);
                    }else{
                        System.out.println("EL NUMERO MAYOR ES: " + num2);
                    }
                    break;
                case 2: 
                    System.out.println("PROBLEMA2");
                    System.out.println("NUMERO INGRESADO: ");
                    int num = sn.nextInt();
                    if(num%2==0){
                        System.out.println("LA PIRAMIDE NECESITA UN NUMERO IMPAR");
                        System.out.println("VUELVA A INGRESAR OTRO NUMERO");
                    }else{
                        int j=0;
                        System.out.println("numero impar");
                        for(int i=1; i<=num; i++){
                            //System.out.println("for");
                            //System.out.println(i);
                            j=i;
                            if(i%2==0){
                                continue;
                            }else{
                                
                                for(int espacios=1; espacios<num-i; espacios++){
                                    
                                //System.out.println("espacios" + espacios);
                                System.out.print(" ");
                            }
                            
                            for(int asteriscos = 1; asteriscos<=i; asteriscos++){
                                System.out.print("*");
                                //System.out.println(asteriscos + "asteriscos");
                            }
                            System.out.println();
                            }
                            
                        }
                        
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("PROBLEMA3");
                    
                    
                    System.out.println("NUMERO DE VACAS: ");
                    int cantidad =sn.nextInt();
                    System.out.println("PESO LIMITE: ");
                    int limitepeso=sn.nextInt();
                    int peso =0;
                    int leche = 0;
                    System.out.println("VACA || PESO EN KILOGRAMOS || PRODUCCION ");
                    int[][] vacas = new int [cantidad][3];
                    for (int i=0; i<cantidad; i++){
                        System.out.println("# vaca: " + i+1);
                        for(int j =0; j<cantidad; j++){
                            switch(j){
                                case 0:
                                    vacas[i][j] = i+1;
                                    break;
                                case 1:
                                    
                                    System.out.println("Peso de la vaca:" );
                                    //peso = sn.nextInt();
                                    vacas[i][j] = random.nextInt(100);
                                    break;
                                case 2:
                                    System.out.println("# vaca: " + i+1);
                                    System.out.println("Peso de la vaca: " );
                                    //leche = sn.nextInt();
                                    vacas[i][j] = random.nextInt(100);
                                    break;
                            }
                        }
                    }
                    
                    for (int i=0; i<cantidad;i++){
                        for(int j=0; j<cantidad;j++){
                            System.out.print(vacas[i][j] + " || ");
                        }
                        System.out.println("");
                    }
                    
                    //char [][] tablero = new char [filas][columnas];
                    
                    break;
                    
            }
            
        
        }while(!(opcion==4));
        System.out.println("SALIDA");
    }
    
}
