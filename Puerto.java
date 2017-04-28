
public class Puerto
{
    private Alquiler[] amarres;

    public Puerto()
    {
        amarres = new Alquiler[4];
    }

    public float alquilarAmarre(int numDias, Barco barco)
    {
        float alquiler = -1;
        
        if (hayAmarresLibres())
        {
            int amarreLibre = posicionPrimerAmarreLibre();
            Alquiler nuevoAlquiler = new Alquiler(numDias, amarreLibre, barco);
            amarres[amarreLibre] = nuevoAlquiler;
            alquiler = nuevoAlquiler.getPrecioAlquiler();
        }
        
        return alquiler;
    }
    
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float alquiler = -1;
        
        if (!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] != null)
        {
            alquiler = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
                
        return alquiler;
    }
    
    public void verEstadoAmarres()
    {
        for (int i = 0; i < amarres.length; i++)
        {
            if (amarres[i] == null)
            {
                System.out.println("El amarre " + i + " está libre.\n");
            }
            else
            {
                 System.out.println(amarres[i]);
                
            }
        }
    }
    
    private int posicionPrimerAmarreLibre()
    {
        int primerAmarreLibre = -1;
        boolean buscarAmarre = true;
        int posicionAmarre = 0;
        
        while (posicionAmarre < amarres.length && buscarAmarre)
        {
            if (amarres[posicionAmarre] == null)
            {
                primerAmarreLibre = posicionAmarre;
                buscarAmarre = false;
            }
            posicionAmarre ++;
        }
        
        return primerAmarreLibre;
    }
    
    private boolean hayAmarresLibres()
    {
        boolean amarresLibres = false;
        int posicionAmarre = 0;
        
        while(posicionAmarre < amarres.length  && !amarresLibres){
            if (amarres[posicionAmarre] == null) {
                amarresLibres = true;
            }
            posicionAmarre++;
        }
        return amarresLibres;
    }
}
