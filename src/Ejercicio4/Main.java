package Ejercicio4;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidata> lista = new ArrayList<>();

        int op = 0;

        do {
            System.out.println("ELECCION DE LA REINA DE QUITO");
            System.out.println("1. REGISTRAR CANDIDATA");
            System.out.println("2. ELIMINAR CANDIDATA");
            System.out.println("3. EDITAR CANDIDATA");
            System.out.println("4. LISTAR CANDIDATA");
            System.out.println("5. BUSCAR CANDIDATA");
            System.out.println("6. BUSCAR CATEGORIA");
            System.out.println("7. SALIR");
            System.out.printf("SELECCIONE UNA OPCION: ");
            try {
                op= sc.nextInt();
            }catch (Exception e){
                System.out.println("Error:  el numero no puede ser negativo (1-7)");
            }

            switch (op){
                case 1:
                    try {
                        System.out.println("Registro de Candidata");
                        System.out.println("Ingrese el ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese la Edad: ");
                        int edad= sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el Distrito: ");
                        String distrito = sc.nextLine();
                        System.out.println("Ingrese el Puntaje del Jurado: ");
                        double PuntajeJurado = sc.nextDouble();
                        sc.nextLine();
//                        do {
//                            if (PuntajeJurado>= 0 && PuntajeJurado<= 100 ){
//                                System.out.println("Puntaje registrado");
//                                true;
//                            }else {
//                                System.out.println("El puntaje debe estar en el rango de 0-100");
//                            }
//                        }while (true);

                        lista.add(id,nombre,edad,distrito,PuntajeJurado);
                        System.out.println("Candidata Registrada Correctamente");
                    }catch (DatoInvalidoException e){
                        System.out.println("Error: "+ e.getMessage);
                    }
                    break;

                case 2:
                    System.out.println("ELIMINAR CANDIDATA");
                    for (Candidata p : lista) {
                        System.out.println("Ingresar id de candidata a Eliminar: ");
                        int id = sc.nextInt();
                        lista.remove(id);
                    }
                    break;
                case 3:
                    System.out.println("EDITAR CANDIDATA");
                    for (Candidata p : lista) {
                        System.out.println("Ingresar id de candidata a Eliminar: ");
                        int id = sc.nextInt();
                        lista.remove(id);
                    }
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:
            }


        }while (op != 7);

    }
}
