package Aplicacion_Eclipse;

import java.util.*;

public class Aplicacion_Eclipse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        int distancia = 0;
        int vueltas = 0;
        int contadorVueltas = 0;
        int tiempo = 0;
        int carros = 0;
        
        while (!opcion.equals("4")) {
            System.out.println("Ingrese una opción:\n 0. Definir la distancia\n 1. Ingresar la cantidad de carros\n 2. Ingresar la cantidad de vueltas\n 3. Ingresar los tiempos\n 4. Salir");
            opcion = entrada.nextLine();
            
            switch (opcion) {
                case "0":
                    // Definimos una distancia
                    System.out.println("Ingrese una distancia:");
                    distancia = entrada.nextInt();
                    System.out.println("La distancia ingresada es: " + distancia);
                    entrada.nextLine();
                    break;
                    
                case "1":
                    // Definimos una cantidad de carros
                    System.out.println("Ingrese la cantidad de carros:");
                    carros = entrada.nextInt();
                    System.out.println("La cantidad de carros ingresada es: " + carros);
                    entrada.nextLine();
                    break;
                    
                case "2":
                    // Definimos una cantidad de vueltas para los carros
                    System.out.println("Ingrese la cantidad de vueltas:");
                    vueltas = entrada.nextInt();
                    System.out.println("Las vueltas son: " + vueltas);
                    entrada.nextLine();
                    break;
                    
                case "3":
                    // Ingresamos los tiempos y generamos las sumas y promedios
                    System.out.println("Ingrese los tiempos para cada vuelta:");
                    
                    // Iteramos por cada carro
                    for (int carro = 1; carro <= carros; carro++) {
                        int velocidades = 0;
                        System.out.println("Esta ingresando los tiempos del carro " + carro);
                        
                        contadorVueltas = 0;
                        while (contadorVueltas < vueltas) {
                            System.out.print("Ingrese un tiempo para la vuelta " + (contadorVueltas + 1) + ": ");
                            tiempo = entrada.nextInt();
                            if (tiempo != 0) {
                                velocidades += (distancia / tiempo);
                            }
                            contadorVueltas++;
                        }
                        
                        double velocidadPromedioVehiculo =  velocidades / vueltas;
                        System.out.println("La velocidad promedio para el vehículo " + carro + " es: " + velocidadPromedioVehiculo);
                    }
                    
                    entrada.nextLine();
                    break;
                    
                case "4":
                    System.out.println("Que tenga un lindo dia!");
                    break;
                    
                default:
                    System.out.println("Ingrese una opción correcta!");
                    break;
            }
        }
        
        entrada.close();
    }
}
