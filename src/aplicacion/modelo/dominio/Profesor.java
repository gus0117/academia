
package aplicacion.modelo.dominio;

public class Profesor {
    private String nombre;
    private String apellido;
    private int legajo;
    private double sueldo;
    
    public void mostrarProfesor(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Sueldo: " + this.sueldo);
    }
    public Profesor(String nombre, String apellido, int legajo, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }
    public void enseñar(){
        
    }
    public void corregir(){
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
