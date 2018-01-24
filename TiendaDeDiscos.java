import java.util.ArrayList;
/**
 * Write a description of class Discos here.
 *
 * @author (Lorena Alonso Pedreira)
 */
public class TiendaDeDiscos
{
    private ArrayList<Disco> discosDeMusica;
    private int codigoDisco;
    /**
     * Constructor for objects of class TiendaDeDiscos
     */
    public TiendaDeDiscos()
    {
        discosDeMusica = new ArrayList<Disco>();
        codigoDisco = 01;
    }
    
    /**
     * Añadir un disco
     */
    public void addDisco(String nombreDisco, String interprete, int numCanciones)
    {
        Disco nuevoDisco = new Disco(nombreDisco, interprete, numCanciones, codigoDisco);
        discosDeMusica.add(nuevoDisco);
        codigoDisco++;
    }
    
    /**
     * Mostrar discos numerados
     */
    public void mostrarDiscosNumerador() 
    {
        int numeroDeDisco = 0;
        while(numeroDeDisco < discosDeMusica.size()) {
            System.out.println((numeroDeDisco + 1) + ". " + discosDeMusica.get(numeroDeDisco).getDatosDisco());
            numeroDeDisco++;
        }
    }
    
    /**
     * Mostrar discos por numero de canciones
     */
    public void mostrarDiscoPorNumCanciones() 
    {
        if(discosDeMusica.size() > 0) {
            Disco masNumCanciones = discosDeMusica.get(0);
            for(Disco nuevoDisco : discosDeMusica) {
                if(nuevoDisco.getNumDisco() >= masNumCanciones.getNumDisco()) {
                    masNumCanciones = nuevoDisco;
                }
            }
            System.out.println(masNumCanciones.getDatosDisco());
        }
    }
    
}
