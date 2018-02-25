/**
 *
 * @author (Carlos Alvarez)
 * @version (23/02/2018)
 */
public class Comida
{
    // Nombre de comida
    private String nombreComida;
    // Calorias asociadas a la comida
    int calorias;
   /**
     * Constructor for objects of class comida
     * @param nombre El nombre de la comida.
     * @param calorias La cantidad de calorias que tiene la comida.
     */
    public Comida(String nombreComida, int calorias)
    {
        this.nombreComida = nombreComida;
        this.calorias = calorias;
    }
       
   /**
     *
     * @Return nombreComida
     *
     **/
    public String getNombre() {
        return nombreComida;
    }
    
   /**
     *
     * @return cantidad de calorias de la comida.
     */
    public int getCalorias() {
        return calorias;
    }
   
   /**
     * 
     * @param nombre El nuevo nombre de la comida.
     */
    public void setNombre(String nombreComida) {
        this.nombreComida = nombreComida;
    }
    
    /**
     * Devuelve una cadena con toda la informacion de la comida.
     * @return Devuelve una cadena con toda la informacion de la comida.
     */
    public String toString() {
        return "Nombre: " + nombreComida + "Calorias: " + calorias;
   }
   
   /**
     * Informacion de la comida.
     */
    public void show() {
        System.out.println(this);
    }
}