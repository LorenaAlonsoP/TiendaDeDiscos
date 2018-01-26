import java.util.ArrayList;
import java.util.Iterator;
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
     * Listar canciones de mayor a menor numero de canciones y eliminar la que mayor num
     * de canciones
     */
    public ArrayList<Disco> localizaMayorLoImprimeYLoBorra(ArrayList<Disco> coleccion)
    {
        ArrayList<Disco> discoMayorNumCanciones = new ArrayList<Disco>();
        double numCancionesMax = 0;
        int contador = 0;
        if(coleccion.size() > 0) {
            for(Disco nuevoDisco : coleccion) {
                if(nuevoDisco.getNumDisco() > numCancionesMax) {
                    numCancionesMax = nuevoDisco.getNumDisco();
                }
            }
            
            while(contador < coleccion.size()) {
                if(coleccion.get(contador).getNumDisco() == numCancionesMax) {
                    discoMayorNumCanciones.add(coleccion.get(contador));
                    coleccion.remove(coleccion.get(contador));
                    contador -= 1;
                }
                contador += 1;
            }
        }
        return discoMayorNumCanciones;
    }
    
    /**
     * Ordena por mayor num de canciones de la tienda
     */
    public void mostrarListaNumCancionesMax()
    {
        ArrayList<Disco> listaNumCancionesMax = new ArrayList<Disco>();
        ArrayList<Disco> copiaListaNumCanciones = new ArrayList<Disco>();
        if(discosDeMusica.size() > 0) {
            copiaListaNumCanciones.addAll(discosDeMusica);
            while(copiaListaNumCanciones.size() != 0) {
                listaNumCancionesMax.addAll(localizaMayorLoImprimeYLoBorra(copiaListaNumCanciones));
            }
            for(Disco nuevoDisco : listaNumCancionesMax) {
                System.out.println(nuevoDisco.getDatosDisco());
            }
        }
    }
    
    /**
     * Modificar al menos una de las caracterisiticas del objeto con el numero identificativo
     * indicado por el usuario.
     */
    public void cambiarNombreDisco(int codigoDisco, String nuevoNombreDisco) 
    {
        if(codigoDisco >= 0 && discosDeMusica.size() >= codigoDisco) {
            Disco nuevoDisco = discosDeMusica.get(codigoDisco - 1);
            nuevoDisco.setNombreDisco(nuevoNombreDisco);
        }
    }

    /**
     * Eliminar Disco 
     */
    public void eliminarDiscoPorNumCanciones(int numCanciones)
    {
        Iterator<Disco> iteration = discosDeMusica.iterator();
        while(iteration.hasNext()) {
            Disco it = iteration.next();
            int numeroCanciones = it.getNumDisco();
            if(numeroCanciones == numCanciones) {
                iteration.remove();
            }
        }
    }
    
    
    
    
    
    
    
}
