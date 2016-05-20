//Contenedor
package Decorador;

//Implementacion de metodos genericos de interfaz Bebida
public class Bebida_Especial implements Bebida{

    private String nombre_bebida;
    
    public Bebida_Especial(String nombre){
        this.nombre_bebida=nombre;
    }
    
    @Override
    public void enfriar() {
        System.out.println("Enfriando bebida");
    }

    @Override
    public void calentar() {
       System.out.println("Calentando bebida");
    }

    @Override
    public void agitar() {
       System.out.println("Agitando bebida");
    }

    @Override
    public void revolver() {
        System.out.println("Revolviendo bebida");
    }
     
}
