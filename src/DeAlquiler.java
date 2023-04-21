public class DeAlquiler {
    String nombre;
    int CIF;
    String domFiscal;
    int precio;
    int barcos;
    int maxTripulacion;
    int codBarco;
    String nombreBarco;

    DeAlquiler (String nombre, int CIF, String domFiscal, int precio,
                int barcos, int maxTripulacion, int codBarco, String nombreBarco){
        this.nombre=nombre;
        this.CIF=CIF;
        this.domFiscal=domFiscal;
        this.precio=precio;
        this.barcos=barcos;
        this.maxTripulacion=maxTripulacion;
        this.codBarco=codBarco;
        this.nombreBarco=nombreBarco;
    }
}
