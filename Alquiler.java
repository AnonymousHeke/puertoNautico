public class Alquiler
{
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
   
    public Alquiler(int diasOcupacion, int posicionAmarre, Barco barco)
    {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String toString()
    {
        String cadenaADevolver = barco.toString() + "Ha alquilado durante " + diasOcupacion + " días el amarre " + posicionAmarre + ".\n";  
        return cadenaADevolver;
    }
    
    public float getPrecioAlquiler()
    {
        float alquiler = (diasOcupacion*((float)barco.getEslora()*VALOR_MULTIPLICADOR_ESLORA)+((float)barco.getCoeficienteBernua()*VALOR_MULTIPLICADOR_BERNUA));
        return alquiler;
    }
    
    public int getNumeroAmarre()
    {
        return posicionAmarre;
    }
    
}