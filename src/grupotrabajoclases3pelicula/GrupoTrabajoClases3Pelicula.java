package grupotrabajoclases3pelicula;

import com.db4o.*;
import java.util.Scanner;

public class GrupoTrabajoClases3Pelicula {

    public static void main(String[] args) {

        ObjectContainer base = Db4o.openFile("C:\\Users\\diego\\OneDrive\\Escritorio\\Instituto abril-agosto2024"
                + "\\Base de datos\\BaseGrupoPelicula\\PELICULA");

        Scanner palabra = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("*************************************");
            System.out.println("**          Area de Figuras        **");
            System.out.println("**                                 **");
            System.out.println("**        Menu Principal           **");
            System.out.println("**                                 **");
            System.out.println("**     1.Pelicula                  **");
            System.out.println("**     2.Tipo de pelicula          **");
            System.out.println("**     3.Cassette                  **");
            System.out.println("**     4.Actor                     **");
            System.out.println("**     5.Alquiler                  **");
            System.out.println("**     6.Cliente                   **");
            System.out.println("**                                 **");
            System.out.println("**           7.Salir               **");
            System.out.println("**                                 **");
            System.out.println("**Escoja una opcion                **");
            System.out.println("*************************************");

            opcion = numero.nextInt();

            switch (opcion) {

                case 1:

                    do {
                        System.out.println("*************************************");
                        System.out.println("**          Area de Figuras        **");
                        System.out.println("**                                 **");
                        System.out.println("**        Menu Principal           **");
                        System.out.println("**                                 **");
                        System.out.println("**     1.Registar                  **");
                        System.out.println("**     2.Consultar                 **");
                        System.out.println("**     3.Modificar                 **");
                        System.out.println("**     4.Eliminar                  **");
                        System.out.println("**                                 **");
                        System.out.println("**           4.Salir               **");
                        System.out.println("**                                 **");
                        System.out.println("**Escoja una opcion                **");
                        System.out.println("*************************************");
                        
                        opcion = numero.nextInt();
                        
                        switch(opcion){
                            
                            case 1:
                                
                               do{
                                   System.out.println("Nueva Pelicula");
                                   
                                   
                               }while(opcion == 1);
                            break;
                            
                            case 2:
                            break;
                            
                            case 3:
                            break;
                            
                            case 4:
                            break;
                            
                        }
                        
                    } while (opcion != 6);

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

            }

        } while (opcion != 7);

    }

    
    
    

    
}
