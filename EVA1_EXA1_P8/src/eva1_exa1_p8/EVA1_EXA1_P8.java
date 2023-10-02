/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_exa1_p8;

import java.util.Scanner;



/**
 *
 * @author frias
 */
public class EVA1_EXA1_P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double centerx;
       double centery;
       double a;
       double b;
       double c;
       double vert1x;
       double vert1y;
       double vert2x;
       double vert2y; 
       double foc1x;
       double foc1y;
       double foc2x;
       double foc2y;
       
       Scanner captu = new Scanner(System.in);
        
        System.out.println("ingrese los datos de la hipérbola");
        System.out.println("cordenada (x) del centro:");
        centerx =  captu.nextDouble();
        
        System.out.println("cordenada (y) del centro:");
        centery = captu.nextDouble();
        
        System.out.println("divisor a");
        a = captu.nextDouble();
        
        System.out.println("divisor b");
        b = captu.nextDouble();
        //calcular la distancia del centro al foco
          
        //formula a *a + b*b
       c = Math.sqrt(a*a + b*b);
      
     //calcular las cordenadas de los vertices
     // formula h + a  y h - a 
     
        
        vert1x = centerx + a ;
        vert1y = centery;
        vert2x = centerx - a;
        vert2y = centery; 
        
        //calcula las coordenadas de los focos 
        //formula h + c y h - c
        foc1x = centerx +  c;
        foc1y =  centery;
        foc2x = centerx - c;
        foc2y = centery;
        
        //mostrar resultados 
        
        System.out.println("distancia del centro al foco es : "+ c);
        
        System.out.println("coordenadas del vertice en el eje x");
        System.out.println("vertice 1: ("+ vert1x + "," + centery + ")");
        System.out.println("vertice 2: ("+ vert2x + "," + centery + ")");
        
        System.out.println(" cordenadas de los focos en el eje x");
        System.out.println("foco 1:(" + foc1x + "," + centery +")");
        System.out.println("foco 2:(" + foc2x + "," + centery +")");
        
        
        
        
       
        
        
      
       
        
        
       
        
        
        
        
        
      
        
        
                
        
       
        
       
        
        
       
        
        
        
        
        
        
        
        
        
        
        
    } 
}

  
    



    
    

