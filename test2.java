

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test2
{
    private Persona persona1;
    private Yate yate1;
    private Puerto puerto1;
    private Persona persona2;
    private Velero velero1;

    
    
    

    /**
     * Default constructor for test class test2
     */
    public test2()
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
        persona1 = new Persona("Maria", "71469372T");
        yate1 = new Yate("6969LE", 25.5, 1999, persona1, 50, 3);
        puerto1 = new Puerto();
        puerto1.alquilarAmarre(4, yate1);
        puerto1.verEstadoAmarres();
        puerto1.verEstadoAmarres();
        puerto1.verEstadoAmarres();
        puerto1.verEstadoAmarres();
        persona2 = new Persona("Ana", "09811348P");
        velero1 = new Velero("6969M", 14.5, 2000, persona2, 1);
        puerto1.alquilarAmarre(2, velero1);
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
}
