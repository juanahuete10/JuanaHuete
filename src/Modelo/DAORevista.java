
package Modelo ;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author UNAN-Chontales
 */
public class DAORevista {
    public Revista Insertar (String titulo, int ayo, String issn, float precio,java.sql.Time Horaventa){
    String transaccion = "INSERT INTO Revista VALUES ( '"
            + titulo + "', '"
            + ayo + "','"
            + issn + "','"
            + precio + "','"
            + Horaventa + "')";
    
    if (new DataBase().Actualizar(transaccion)> 0){
        return new Revista(titulo, ayo, issn, precio, Horaventa);
    }
    return null;
    }
      public int Actualizar(int numero,String titulo,int ayo,
       String issn,float precio,java.sql.Time Horaventa){
    
    String transaccion = "UPDATE Revista SET titulo='"
        + titulo + "', ayo='"
        + ayo    + "', issn='"
        + issn   + "', precio='"
        + precio + "', Horaventa='"
        + Horaventa + "' WHERE numero="
        + numero;
    
    return new DataBase().Actualizar(transaccion);
}   
     public List obtenerDatos(){
    String transaccion = "SELECT * FROM Revista";
    //Llama a metodos listar de DateBase.java
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Revista> revistas = new ArrayList(); 
    
    for(Map registro : registros) {
        Revista re = new Revista 
         ((Integer.parseInt( registro.get("numero").toString())),
          (String) registro.get("titulo"),
          (Integer.parseInt( registro.get("ayo").toString())),
          (String) registro.get("issn"),
          (Float.parseFloat( registro.get("precio").toString())),
         (java.sql.Time.valueOf( registro.get("Horaventa").toString()))); 
        revistas.add( re);
    }
    return revistas;

     }
     
     public int Eliminar(int numero){
    String transaccion = "DELETE FROM Revista WHERE numero='"+numero +"'";
    
    return new DataBase().Actualizar(transaccion);
}
}
