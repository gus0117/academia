
package aplicacion.modelo.dominio;

public class Aula {
    private int numero;
    private int capacidad;
    
    public void mostrarAula(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Capacidad: " + this.capacidad);
    }
    public Aula(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;
    }
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
