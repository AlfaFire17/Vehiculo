
package vehiculo;

/**
 *
 * @author Pablo Soriano Jimenez
 */
public class Main {
    /**
     * main principal del codigo, el cual llama a la funcion
     * operativaVehiculo para cumplir su funcion
     * @param args 
     */
      public static void main(String[] args) {
        VehiculoPSJ2223 miVehiculoPSJ2223;
        int stockActual;
        
        miVehiculoPSJ2223 = operativaVehiculosPSJ2223(50);
        stockActual = miVehiculoPSJ2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
      /**
       * Funcion alternativa la cual guarda la variabke cantidad
       * y engloba las sentencias de la clase main que operan con el 
       * objeto miVehiculo
       * @param cantidad
       * @return 
       */
    private static VehiculoPSJ2223 operativaVehiculosPSJ2223(Object cantidad) {
        
        VehiculoPSJ2223 miVehiculoPSJ2223;
        miVehiculoPSJ2223 = new VehiculoPSJ2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPSJ2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPSJ2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        return miVehiculoPSJ2223;
    }

}
    
