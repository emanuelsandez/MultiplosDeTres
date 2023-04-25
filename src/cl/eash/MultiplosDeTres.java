/*
 * Programa que permite realizar la suma y posterior promedio de los valores ingresados por consola que son multiplos de 3
 */

package cl.eash;
public class MultiplosDeTres {

	public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        //Declaracion de vector que permite guardar los valores ingresados por consola
        
        
        
        int sumaMultiplosTres = suma(numeros);
        System.out.println(sumaMultiplosTres);
        
        int promedio = promedio(numeros);
        System.out.println(promedio);
    }
    
    public static int suma(int[] numeros) {
    	//Metodo que permite la suma de los numeros con multiplos de 3
        int sumaMultiplosTres = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                sumaMultiplosTres += numeros[i];
         //Ciclo que permite acumularlos valores que son multiplos de 3
            }
        }
        return sumaMultiplosTres;
    }
    
    public static int promedio(int[] valores) {
    	//Metodo que permite obtener el promedio de los valores que son multiplo de 3
        int total = 0;
        int contador = 0;
        //Definicion de variables, tanto acumulador como contador
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 3 == 0) {
                total += valores[i];
                contador++;
            }
        }
        return total / contador;

}
}
