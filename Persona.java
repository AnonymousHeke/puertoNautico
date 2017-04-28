
public class Persona
{
    
    private String nombre;
    private String dni;
    
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "Nombre: " + nombre + "\nDNI: " + dni + "\n";
        return cadenaADevolver;
    }

}
