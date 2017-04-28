public class Velero extends Barco
{

    private int numMastiles;

    public Velero(String matricula, double eslora, int ano, Persona propietario, int numMastiles)
    {
        super(matricula, eslora, ano, propietario);
        this.numMastiles = numMastiles;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();
        cadenaADevolver += "Número de mástiles: " + numMastiles + "\n";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
}
