//Contenedor
package Decorador;

//Permite crear objeto bebida para obtenerlo en complemento bebida, tomando un objeto bebida de la interfaz
public abstract class BebidaDecorador implements Bebida {
    
    private Bebida drink;
    
    public BebidaDecorador(Bebida drink){
        this.drink=drink;
    }
    
    protected Bebida getBebida(){
        return this.drink;
    }
    
}
