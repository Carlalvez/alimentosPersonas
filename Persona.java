
/**
 * Write a description of class personas here.
 *
 * @author (Carlos Alvarez)
 * @version (23/02/2018)
 */
public class Persona
{
    // Nombre persona
    private String nombre;
    // Sexo persona [true] para mujer, [false] para hombre.
    private boolean sexo; 
    // KG persona
    private int peso;
    // Altura persona
    private int altura;
    // Edad persona
    private int edad;
    // Calorias Ingeridas
    private int caloriasIngeridas;
    // Calorias maximas.
    private int maxCalorias;
    // Comida con mayor cantidad calorica ingerida.
    private int ComidaCaloriaMayorIngerida;
    // Comida mas calórica.
    private Comida comidaMasPesada;
    /**
     * El constructor de la clase Persona deberá tener en el mismo orden
     * @parametro Nombre = Nombre de la persona
     * @parametro genero = Sexo de la persona
     * @parametro peso = Peso de la persona
     * @parametro altura = Estatura de la persona
     * @parametro edad = Edad de la persona
     **/
    public Persona (String nombre, boolean genero, int peso, int altura, int edad)
    {
        this.nombre = nombre;
        this.sexo = genero;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        comidaMasPesada = null;
        caloriasIngeridas = 0;
        maxCalorias = (10 * peso) + (6 * altura) + (5 * edad);
        maxCalorias = (sexo)?maxCalorias + 5 : maxCalorias - 161; 
    }

    /**
     * 
     * @param CaloriasIngeridas suma las calorias que ha consumido una persona
     */
    public int caloriasIngeridas()
    {
        return caloriasIngeridas++;
    }

    /**
     * @return Devuelve el nombre de la persona.
     **/
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el genero biologico de la persona. [Verdadero] para mujer, [Falso] para hombre.
     * @return Devuelve el genero biologico de la persona. [Verdadero] para mujer, [Falso] para hombre.
     **/
    public boolean getSexo() {
        return sexo;
    }

    /**
     * Devuelve el peso en kg de la persona.
     * @return Devuelve el peso en kg de la persona.
     **/
    public int getPeso() {
        return peso;
    }

    /**
     * Devuelve la altura en cm de la persona.
     * @return Devuelve la altura en cm de la persona.
     **/
    public int getAltura() {
        return altura;
    }

    /**
     * 
     * @return edad en años de la persona.
     **/
    public int getEdad() {
        return edad;
    }
    
    /**
     * 
     * @returncalorias ingeridas hasta el momento.
     */
    public int getCaloriasIngeridas() {
        return caloriasIngeridas;
    }
    
    /**
     * 
     * @return comida más calorica consumida hasta el momento o si no come, no devuelve nada
     **/
    public String getAlimentoMasCaloricoConsumido(){
       if(comidaMasPesada != null) {
            System.out.println(comidaMasPesada.getNombre());
        }
        return (comidaMasPesada != null)? comidaMasPesada.getNombre() : null;
    }
    
    /**
     * Modifica el nombre de la persona.
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el genero biologico de la persona.
     * @param sexo [Verdadero] para una mujer, [Falso] para un hombre.
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * Modifica el peso de la persona.
     * @param peso El nuevo peso de la persona expresado en kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * 
     * @param altura persona expresada en cm.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * 
     * @param edad La nueva edad de la persona expresada en anos.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Devuelve una cadena con toda la informacion de la persona.
     */
    public String toString() {
        String sexo = (this.sexo)?"Mujer":"Hombre";
        return "Nombre: " + nombre + "Sexo: " + sexo + "Peso: " + peso + "Altura :" + altura + "Edad :" + edad;
    }

    /**
     * Sout la informacion de la persona.
     */
    public void mostrar() {
        System.out.println(this);
    }
    
     /**
     * 
     * @param comida, comida maxima de una persona.
     * @return Devuelve calorias consumidas en esa comida.
     */
    public int comer(Comida comida) {   
        int aDevolver;
        if(this.caloriasIngeridas > maxCalorias) {
            aDevolver = -1;
        }
        else {
            aDevolver = comida.getCalorias();
            caloriasIngeridas = caloriasIngeridas + comida.getCalorias();
        } 
        
        if(comidaMasPesada == null || comidaMasPesada.getCalorias() <= caloriasIngeridas) {
                comidaMasPesada = comida;
            }
        return aDevolver;
    }
    
    /**
     * 
     * @returnSi no ha sobrepasado su metabolismo basal, te contestará "SI" o "NO" (¡en mayúsculas!) dependiendo de si la pregunta tiene una longitud (es decir, el número de letras de la misma)
     * divisible por 3 o no, respectivamente.
     * En caso de que la persona ya haya sobrepasado el metabolismo basal o en el caso de que tu pregunta contenga el nombre de la persona, responderá con la misma pregunta que le has hecho pero 
     * gritando (es decir, el mismo texto de la pregunta pero en mayúsculas) indiferentemente de la longitud de a pregunta.
     **/
    public String contestar(String pregunta) {
        String respuesta = "";
        if(caloriasIngeridas > maxCalorias || pregunta.indexOf(nombre) != -1){
            respuesta = pregunta.toUpperCase();
        }
        else if(pregunta.length() % 3 == 0) {
            respuesta = "SI";
        }
        else {
           respuesta = "NO";
        }
       System.out.println(respuesta);
        return respuesta;
    }
}