/**
 * Write a description of class Discos here.
 *
 * @author (Lorena Alonso Pedreira)
 */
public class Disco
{
    private String nombreDisco;
    private String interprete;
    private int numCanciones;
    private int codigoProducto;
    /**
     * Constructor for objects of class Discos
     */
    public Disco(String nombreDisco, String interprete, int numCanciones, int codigoProducto)
    {
        this.nombreDisco = nombreDisco;
        this.interprete = interprete;
        this.numCanciones = numCanciones;
        this.codigoProducto = codigoProducto;
    }

    /**
     * Devuelve el nombre del disco 
     */
    public String getNombreDisco()
    {
        return nombreDisco;
    }
    
    /**
     * Devuelve el interprete 
     */
    public String getInterprete()
    {
        return interprete;
    }
    
    /**
     * Devuelve el numero de canciones que contiene el disco 
     */
    public int getNumDisco()
    {
        return numCanciones;
    }
    
    /**
     * Devuelve toda la información almacenada de disco en formato String.
     */
    public String getDatosDisco() 
    {
        String aDevolver = nombreDisco + " - " + interprete + " - " + "Este disco contiene este número de canciones: " + numCanciones + " - " + "Codigo del disco: " + codigoProducto;
        return aDevolver;
    }
    
    /**
     * Devuelve el numero de canciones que contiene el disco 
     */
    public int getcodProducto()
    {
        return codigoProducto;
    }
    
    /**
     * Cambiar el nombre del disco
     */
    public void setNombreDisco(String nombreDisco)
    {
        this.nombreDisco = nombreDisco;
    }
    
    /**
     * Cambiar el nombre del interprete
     */
    public void setInterprete(String interprete) 
    {
        this.interprete = interprete;
    }
    
    /**
     * Cambiar el numero de canciones del album
     */
    public void setNumCanciones(int numCanciones) 
    {
        this.numCanciones = numCanciones;
    }
}
