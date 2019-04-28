/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.testPlanilla;

/**
 *
 * @author Rocio
 */
public class testPlanilla {
    public static void main(String[] args) {
         // Definicion de planilla con datos de alumnos
        String[][] planilla = {
            {"LU", "Apellido", "Nombre", "1-abr", "3-abr", "8-abr", "10-abr", "15-abr", "17-abr", "22-abr", "25-abr", "28-abr", "Cant.Ausentes", "Estado"},
            {"1111", "PPPPP", "HHHHH", "A", "P", "P", "A", "P","A","P","P","P"," "," "},
            {"2222", "JJJJJ", "FFFFF", "P", "P", "P", "A", "P","P","P","P","P"," "," "},
            {"3333", "AAAAA", "EEEEE", "A", "P", "A", "P", "P","A","P","P","A"," "," "}
        };
        //Recorrido y conteo de ausentes
        for(int fil = 1; fil < planilla.length; fil++){
            int cantAusentes = 0;
            for(int col = 3; col < planilla[0].length - 2; col++){
                if(planilla[fil][col].toUpperCase() == "A"){
                    cantAusentes++;
                }
            }
            planilla[fil][12] = String.valueOf(cantAusentes);
            if(cantAusentes >= 4){
                planilla[fil][13] = "Libre";
            }
            else
            {
                planilla[fil][13] = "Activo";
            }
        }
        //Mostrar Planilla
        System.out.println("Mataria: Programacion Estructurada");
        System.out.println("Profesor: Vega, Ariel\n");
        for(int fil = 0; fil < planilla.length; fil++){
            
            for(int col = 0; col < planilla[0].length; col++){
                System.out.print(planilla[fil][col] + "\t");
                if(col == 1 && fil != 0 || col == 11 && fil != 0){
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}
