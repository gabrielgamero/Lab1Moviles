package lab1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Integer> main(String[] args) {


        List <Integer> FuncionFibonacci(int num1)
        {

            try{
            List <Integer> fibo = new ArrayList<Integer>();

            int n1=0;
            int n2=1;
            int suma=1;


            for (int i=1; i <= num1; i++) {
                // muestro la suma
                fibo.add(suma);

                //primero sumamos
                suma = n1 + n2;
                //Despues, cambiamos la segunda variable por la primera
                n1 = n2;
                //Por ultimo, cambiamos la suma por la segunda variable
                n2 = suma;


            }

            return fibo;} catch (NumberFormatException e){System.out.println("El número ingresado no es correcto");}

        }

        int factoriaL(int num1){

            try{
            int factorial=1;
            while ( num1!=0) {
                factorial=factorial*num1;
                num1--;
            }} catch (NumberFormatException e){System.out.println("Ingrese un número correcto");}
        }

    }
}
