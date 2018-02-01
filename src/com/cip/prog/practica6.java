//Chaxiraxi María Calcines Padilla - PRÁCTICA JAVA Nº 6

package com.cip.prog;
import java.util.Scanner;

public class practica6 {
	
	//Genera aleatorio entre 1 y 10
	public static int generaNumeroAleatorio(){
	       int num=(int)(Math.random()*10)+1;
	       return num;
	}
	
	//Calcula el mayor del array
	public static int calcularMayor(int[] numeros){
		int mayor=numeros[0];
		for(int i=1; i < numeros.length; i++){
			if(numeros[i]>mayor) {
				mayor=numeros[i];			
			}
		}
		return mayor;
	}	
	
	//Calcula el menor del array
	public static int calcularMenor(int[] numeros){
		int menor=numeros[0];
		for(int i=1; i < numeros.length; i++){
			if(numeros[i]<menor) {
				menor=numeros[i];			
			}
		}
		return menor;   
	}
	
	//Calcula la media del array
	public static int calcularLaMedia(int[] numeros){
		int total=0;
		for(int i=0; i < numeros.length; i++){
			total+=numeros[i];
		}
		int media=total/20;
		return media;
		
	}
	
	//Muestra todos los elementos del array
	public static void mostrar(int[] numeros){
        for(int i=0;i<numeros.length;i++) {
        	System.out.print(numeros[i]+" ");
        }    
	}
	
	//Muestra las veces que se repite un número
	public static void mostrarOcurrencias(int[] numeros, int numero){
		int contador=0;
        for(int i=0;i<numeros.length;i++) {
        	if(numeros[i]==numero) {
        		contador++;
        	}
        } 
        
        if(contador==0) {
        	System.out.println("No aparece ese número");
        }else {
        	System.out.println("El número "+numero+" aparece "+contador+" vez/veces");
        }
        
	}	
	//Método principal
	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);
		int opcion;
		int[] numeros= new int[20];
		
		//generar 20 numeros
		for(int i=0;i<20;i++) {
			numeros[i]=generaNumeroAleatorio();	
		}

		do{
			System.out.print("\n__Menú__\n1. Imprimir el mayor del array.\n2. Imprimir el menor del array.\n3. Calcular la media de todos los valores del array.\n4. Imprimir todos los valores del array.\n5. Mostrar el número de veces que se repite un número.\n0. Salir\nSu opción:");
			opcion = sc.nextInt();
			
			System.out.flush();
			switch(opcion) {
				case 1: 
					System.out.println("El mayor es el: "+calcularMayor(numeros));  
					break;
				case 2: 
					System.out.println("El menor es el: "+calcularMenor(numeros));
					break;		
				case 3: 
					System.out.println("La media es: "+calcularLaMedia(numeros));
					break;
				case 4: 
					mostrar(numeros);
					break;
				case 5:
					System.out.print("Introduzca un número: ");
					int numero = sc.nextInt();
					mostrarOcurrencias(numeros,numero); 
					break;
					
				case 0:
					System.out.println("¡Hasta Otra!");
					break;					
				default:
					System.out.println("¡Opcion incorrecta!");
					break;				
			}
				
		}while(opcion!=0);

	}

}
