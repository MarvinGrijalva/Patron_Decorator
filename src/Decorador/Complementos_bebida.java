//Contenedor
package Decorador;
//Complementos de bebida, agrega elementos adicionales a metodo de bebida
public class Complementos_bebida  extends BebidaDecorador{

    public Complementos_bebida(Bebida drink) {
        super(drink);
    }

    @Override
    public void enfriar() {
        getBebida().enfriar();
        System.out.println("Agregando azucar");
    }

    @Override
    public void calentar() {
        getBebida().calentar();
        System.out.println("Agregando leche");
    }

    @Override
    public void agitar() {
        getBebida().agitar();
        System.out.println("Agregando limon");
    }

    @Override
    public void revolver() {
        getBebida().revolver();
        System.out.println("Agregando canela");
    }
    
}
