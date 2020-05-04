package lab1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        
        try {
           
        System.out.println("MCD");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        String num1 = sc.nextLine();
        System.out.println("Ingrese segundo numero:");
        String num2 = sc.nextLine();
        
        int num1_a = Integer.valueOf( num1);
        int num2_b = Integer.valueOf( num2);
        
        
        
         while(num1_a != num2_b)
            if(num1_a > num2_b)
                num1_a = num1_a - num2_b;
            else
                num2_b = num2_b - num1_a;
        
         
         
         String num1_a_f = String.valueOf(num1_a);
         System.out.println("MCD es :" +num1_a_f );
     
        }
        catch( NumberFormatException e){
            System.out.println("Esta ingresando letras");
        
        }
         
        
        //--------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
         
    }
        
        
        
    }

