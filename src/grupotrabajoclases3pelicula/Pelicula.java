
package grupotrabajoclases3pelicula;

import com.db4o.*;


public class Pelicula {
    
    private String codigo_pelicula;
    private String nombre_Pelicula;
    private String codTipo_Pelicula;
    private String codActor_Pelicula;

    public Pelicula() {
    }

    public Pelicula(String codigo_pelicula, String nombre_Pelicula, String codTipo_Pelicula, String codActor_Pelicula) {
        this.codigo_pelicula = codigo_pelicula;
        this.nombre_Pelicula = nombre_Pelicula;
        this.codTipo_Pelicula = codTipo_Pelicula;
        this.codActor_Pelicula = codActor_Pelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo_pelicula=" + getCodigo_pelicula() + ", nombre_Pelicula=" + getNombre_Pelicula() + ", codTipo_Pelicula=" + getCodTipo_Pelicula() + ", codActor_Pelicula=" + getCodActor_Pelicula() + '}';
    }

    /**
     * @return the codigo_pelicula
     */
    public String getCodigo_pelicula() {
        return codigo_pelicula;
    }

    /**
     * @param codigo_pelicula the codigo_pelicula to set
     */
    public void setCodigo_pelicula(String codigo_pelicula) {
        this.codigo_pelicula = codigo_pelicula;
    }

    /**
     * @return the nombre_Pelicula
     */
    public String getNombre_Pelicula() {
        return nombre_Pelicula;
    }

    /**
     * @param nombre_Pelicula the nombre_Pelicula to set
     */
    public void setNombre_Pelicula(String nombre_Pelicula) {
        this.nombre_Pelicula = nombre_Pelicula;
    }

    /**
     * @return the codTipo_Pelicula
     */
    public String getCodTipo_Pelicula() {
        return codTipo_Pelicula;
    }

    /**
     * @param codTipo_Pelicula the codTipo_Pelicula to set
     */
    public void setCodTipo_Pelicula(String codTipo_Pelicula) {
        this.codTipo_Pelicula = codTipo_Pelicula;
    }

    /**
     * @return the codActor_Pelicula
     */
    public String getCodActor_Pelicula() {
        return codActor_Pelicula;
    }

    /**
     * @param codActor_Pelicula the codActor_Pelicula to set
     */
    public void setCodActor_Pelicula(String codActor_Pelicula) {
        this.codActor_Pelicula = codActor_Pelicula;
    }

//   public static void GuardarPelicula (ObjectContainer base, String codigo_pelicula, String nombre_Pelicula,
//           String codTipo_Pelicula, String codActor_Pelicula) {
//
//        Pelicula pelicula = new Pelicula(codigo_pelicula, nombre_Pelicula,
//                codTipo_Pelicula,  codActor_Pelicula);
//
//        if (VerificarCliente(base, codigo_pelicula) == 0) {
//
//            base.set(pelicula);
//            System.out.println("Pelicula Guardada");
//
//        } else {
//            System.out.println("Ya existe la pelicula en la base de datos");
//        }
//    }
   
   public static void BuscarPelicula(ObjectContainer base) {

        Pelicula CBuscar = new Pelicula();
        ObjectSet resultado = base.get(CBuscar);//objeto tipo registro
        System.out.println("numero de peliculas encontrados es: " + resultado.size());

        while (resultado.hasNext()) {
            System.out.println(resultado.next());
        }
    }
//   public Pelicula(String codigo_pelicula, String nombre_Pelicula, String codTipo_Pelicula, String codActor_Pelicula)
//   public static void ModificarPelicula(ObjectContainer base, String cod, String nom ) {
//
//        Pelicula PBuscar = new Pelicula(cod,null,null,null);
//        ObjectSet resultado = base.get(PBuscar);//objeto tipo registro

//        if (VerificarCliente(base, nom) != 0) {
//
//            Pelicula PModi = (Pelicula) resultado.next();
//            PModi.setNombre_Pelicula(nom);
//            
//            base.set(PModi);
//            System.out.println("Libro Modificado");
//
//        } else {
//            System.out.println("Libro no encontrado");
//        }
//
//    }
   
  
//   public static void EliminarPelicula(ObjectContainer base, String cod) {
//
//        Pelicula pBuscar = new Pelicula(cod,null,null,null);
//        ObjectSet resultado = base.get(pBuscar);//objeto tipo registro
//
//        if (VerificarClienteFactura(base, cod) != 0) {
//
//            if (VerificarCliente(base, cod) != 0) {
//
//                Pelicula CEliminar = (Pelicula) resultado.next();
//
//                base.delete(CEliminar);
//                System.out.println("Cliente Eliminado");
//            } else {
//                System.out.println("No hay como eliminar cliente");
//            }
//        } else {
//            System.out.println("Cedula no encontrada");
//        }
//
//    }
//
//    public static int VerificarPelicula(ObjectContainer base, String cod) {
//        
//        Pelicula PBuscar = new Pelicula(cod);
//        
//        ObjectSet resultado = base.get(PBuscar);//objeto tipo registro
//      
//        return resultado.size();
//    }
}