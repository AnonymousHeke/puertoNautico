
public abstract class Barco
{

    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += propietario;
        cadenaADevolver += "Matrícula: " + matricula + "\nEslora: " + eslora + "\nAño fabricacion: " + anoFabricacion + "\n";
        return cadenaADevolver;
    }
    
    public double getEslora()
    {
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();
                
}
