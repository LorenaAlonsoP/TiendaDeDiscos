

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TiendaDeDiscosTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TiendaDeDiscosTest
{
    /**
     * Default constructor for test class TiendaDeDiscosTest
     */
    public TiendaDeDiscosTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test()
    {
        TiendaDeDiscos tiendaDe1 = new TiendaDeDiscos();
        tiendaDe1.addDisco("Love", "Pepe", 20);
        tiendaDe1.addDisco("Hola", "Lidia", 10);
        tiendaDe1.addDisco("Adios", "Manuel", 30);
        tiendaDe1.mostrarDiscosNumerador();
        tiendaDe1.mostrarListaNumCancionesMax();
        tiendaDe1.cambiarNombreDisco(2, "Que tal");
        tiendaDe1.cambiarNombreDisco(1, "Movil");
        tiendaDe1.eliminarDiscoPorNumCanciones(20);
        tiendaDe1.eliminarDiscoPorNumCanciones(10);
        tiendaDe1.mostrarDiscosNumerador();
    }
}

