//Contenedor
package Decorador;

/**
 * UNIVERSIDAD MARIANO GALVEZ
 * Catedrático: César Hernández
 * Curso:       Diseño de Sistemas
 * Tema:        Patrón de estructura (Decorator)
 * Descripción: El patrón de estructura Decorator permite 
 *              añadir responsabilidades a un objeto dinámicamente.
 *              Los decoradores proporcionan una alternativa flexible
 *              a la herencia para extender la funcionalidad.
 * Alumno:      Marvin Alexander Grijalva Pérez
 * Carné:       0907 12 2589
 */
public class Main {
    
    //Metodo main
    public static void main(String[] args){
      
      //Creacion de bebida, la cual obtiene primero complementos y los agrega a la clase de bebida especial
      Bebida drink1 = new Complementos_bebida(new Bebida_Especial("Cafe con leche"));
      
      //Al mostrar la bebida, esta se comporta como una bebida especial que ademas trae sus agregados como leche y canela
      drink1.calentar();
      drink1.revolver();

   }
}  
