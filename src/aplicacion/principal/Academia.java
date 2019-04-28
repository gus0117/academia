
package aplicacion.principal;
import aplicacion.modelo.dominio.Alumno;
import aplicacion.modelo.dominio.Aula;
import aplicacion.modelo.dominio.Profesor;
import java.util.Scanner;

public class Academia {

    public static void main(String[] args) {
       
        Alumno alumno1 = new Alumno("Alberto", "Gutierrez", 111);
        Alumno alumno2 = new Alumno("Gabriela", "Gomez", 222);
        Alumno alumno3 = new Alumno("Carla", "Martinez", 333);
        
        System.out.println("Alumno 1");
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Apellido: " + alumno1.getApellido());
        System.out.println("LU: " + alumno1.getLu());
        
        System.out.println("Alumno 2");
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());
        System.out.println("LU: " + alumno2.getLu());
        
        System.out.println("Alumno 3");
        System.out.println("Nombre: " + alumno3.getNombre());
        System.out.println("Apellido: " + alumno3.getApellido());
        System.out.println("LU: " + alumno3.getLu());
        
        Aula aula1 = new Aula(12,40);
        Aula aula2 = new Aula(11,50);
        Aula aula3 = new Aula(10,40);
        
        System.out.println("Aula 1");
        System.out.println("Numero: "+aula1.getCapacidad());
        System.out.println("Capacidad: "+aula1.getCapacidad());
        
        System.out.println("Aula 2");
        System.out.println("Numero: "+aula2.getCapacidad());
        System.out.println("Capacidad: "+aula2.getCapacidad());
        
        System.out.println("Aula 3");
        System.out.println("Numero: "+aula3.getCapacidad());
        System.out.println("Capacidad: "+aula3.getCapacidad());
        
        Profesor profe1 = new Profesor("Agustin", "Machado", 111, 20000);
        Profesor profe2 = new Profesor("Belen", "Acosta", 222, 24012);
        Profesor profe3 = new Profesor("Cintia", "Chavez", 333, 15233);
      
        System.out.println("Profesor 1");
        System.out.println("Nombre: " + profe1.getNombre());
        System.out.println("Apellido: " + profe1.getApellido());
        System.out.println("Legajo: " + profe1.getLegajo());
        System.out.println("Sueldo: " + profe1.getSueldo());
        
        System.out.println("Profesor 2");
        System.out.println("Nombre: " + profe2.getNombre());
        System.out.println("Apellido: " + profe2.getApellido());
        System.out.println("Legajo: " + profe2.getLegajo());
        System.out.println("Sueldo: " + profe2.getSueldo());
        
        System.out.println("Profesor 3");
        System.out.println("Nombre: " + profe3.getNombre());
        System.out.println("Apellido: " + profe3.getApellido());
        System.out.println("Legajo: " + profe3.getLegajo());
        System.out.println("Sueldo: " + profe3.getSueldo());
    }
    
}
