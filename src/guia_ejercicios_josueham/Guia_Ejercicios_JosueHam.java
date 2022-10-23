package guia_ejercicios_josueham;

import java.util.Scanner;

public class Guia_Ejercicios_JosueHam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int opcion;
        do{
            System.out.println(" ");
            System.out.println("----- Bienvenido al Menu del programa -----");
            System.out.println("1 -> Simulacion division numeros enteros");
            System.out.println("2 -> Enteros multiplos");
            System.out.println("3 -> Tabla 0 y 1");
            System.out.println("4 -> Sumatoria");
            System.out.println("5 -> Suma de digitos");
            System.out.println("6 -> Salir del programa");
            System.out.print("Ingrese a que opcion desea entrar: ");
            opcion = leer.nextInt();
            
            if (opcion == 1){
                 
                int c = 0;
                
                System.out.println("Ingrese el valor de a: ");
                    int a = leer.nextInt();
                System.out.println("Ingrese el valor de b: ");
                    int b = leer.nextInt();
               
                while (a >= b){
                    a = a - b;
                    c++;
                }//Fin while opcion 1
                System.out.println("El resultado del cociente es de: "+ c);
                System.out.println("El resultado del residuo es de: "+ a);       
                       
                   
                
                }//Fin opcion 1
            
            else if (opcion == 2){
                int acum = 0;
                
                System.out.print("Ingrese el numero que desea saber los multiplos: ");
                    int numero = leer.nextInt();
                    int c = 0;
                    int terminos = 9;
                    System.out.println("Primeros 10 multiplos: ");
                    
                    while (c <= terminos){
                           System.out.print( " " + acum);
                           acum += numero;
                           c++;
                           System.out.print(",");
                    }//Fin while opcion 2
            }//Fin opcion 2
            
            
            else if (opcion == 3){
                int And = 0, Or = 0, Nand = 0, Nor = 0;
                
                System.out.println("Ingrese el valor de A: ");
                    int A = leer.nextInt();
                System.out.println("Ingrese el valor de B: ");
                    int B = leer.nextInt();
                    
                    if (A!=1 || A!= 0 && B!= 1 || B!=0){
                        System.out.println("Solamente se aceptan como entrada 1 y 0");
                            System.out.println("Ingrese el valor de A: ");
                                A = leer.nextInt();
                        System.out.println("Ingrese el valor de B: ");
                                B = leer.nextInt();
                                     
                            
                      if (A == 0 && B== 0){
                            And = 0; Or = 0;
                            Nand = 1;Nor = 1;

                        }//Fin if No. 1

                        else if (A == 0 && B == 1){
                                And = 0;Nor = 0;
                                Nand = 1;Or = 1;

                            }//Fin if No. 2

                        else  if ( A == 1 && B == 0){
                                And = 0;Nor = 0;
                                Nand = 1;Or = 1;
                                  }//Fin if No.3

                        else if (A== 1 && B == 1){
                                And = 1; Or = 1;
                                Nand = 0;Nor = 0;
                        }//Fin if No.4
                            System.out.println("La secuencia seria: " + And + Nand + Or + Nor);
                                    
                            
                    }//Fin if validacion opcion No.3 
                    
                    
                    
                        

                        
                }//Fin opcion 3
            else if (opcion == 4){
                
                System.out.print("Ingrese el valor de X en la sumatoria: ");
                    double x = leer.nextDouble();
                System.out.print("Ingrese el valor de M (limite)en la sumatoria: ");
                    double  m = leer.nextDouble();
                    
                    double n = 0.00;
                    double calculo_1 = 0.0; double calculo_2 = 0.0; double potencia = 0;
                    double acum_1 = 0.0;
                    double multiplicacion;
                    
                    while (n <= m) {
                        calculo_1 += 1/(2*n+1);
                        potencia = 2*n +1;
                        calculo_2 = ((x-1)/(x+1))*potencia;
                        multiplicacion = calculo_1*calculo_2;
                        acum_1+= multiplicacion;
                        System.out.println(" "+ calculo_2);
                        n++;
                    }
                    
                   /* while (n <= m){
                        calculo_1+= 1/2*n+1;
                        potencia+= 2*n + 1;
                        calculo_2 = (x-1/x+1)*potencia;n++;
                        while (i <= m){
                            multiplicacion = calculo_1*calculo_2;
                            acum_1+= multiplicacion;  
                            i++;
                        }
                        n++;                   
                       
                        
                    }//fin while 1
                    System.out.println("El resultado de la funcion ln es de: "+ acum_1);
                    System.out.println(+calculo_1+ " " + potencia + " " + calculo_2); */
            }
        } while (opcion!=6);
                
        
    }//fin del main 
    
}//Fin de la clase
