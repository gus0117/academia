
package aplicacion.modelo.dominio;

public class Alumno {

    /**
     * Nombre del alumno
     */
    private String nombre;
    /**
     * Apellido del alumno
     */
    private String apellido;
    /**
     * Libreta Universitaria del alumno
     */
    private int lu;
    /**
     * Constructor que solo asigna los valores a los atributos
     * @param nombre Nombre del alumno
     * @param apellido Apellido del alumno
     * @param lu Libreta universitaria del alumno
     */
    public Alumno(String nombre, String apellido, int lu){
        this.nombre = nombre;
        this.apellido = apellido;
        this.lu = lu;
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
     * @return the lu
     */
    public int getLu() {
        return lu;
    }

    /**
     * @param lu the lu to set
     */
    public void setLu(int lu) {
        this.lu = lu;
    }
    
    
    public void aprender(){
        
    }
    public void practicar(){
        
    }
    public void mostrarAlumno(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("LU: " + this.lu);
    }
}
