public class DeAlquiler {
    String nombre;
    int CIF;
    String domFiscal;
    int precio;
    int barcos;
    int maxTripulacion;
    int codBarco;
    String nombreBarco;

    //Constructores
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
    DeAlquiler(){};

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCIF(int CIF) {
        this.CIF = CIF;
    }
    public void setDomFiscal(String domFiscal) {
        this.domFiscal = domFiscal;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setBarcos(int barcos) {
        this.barcos = barcos;
    }
    public void setMaxTripulacion(int maxTripulacion) {
        this.maxTripulacion = maxTripulacion;
    }
    public void setCodBarco(int codBarco) {
        this.codBarco = codBarco;
    }
    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getCIF() {
        return CIF;
    }
    public String getDomFiscal() {
        return domFiscal;
    }
    public int getPrecio() {
        return precio;
    }
    public int getBarcos() {
        return barcos;
    }
    public int getMaxTripulacion() {
        return maxTripulacion;
    }
    public int getCodBarco() {
        return codBarco;
    }
    public String getNombreBarco() {
        return nombreBarco;
    }

    //AñadirHorario
    public void añadirHorario(int hora, int minutos){
        Viaje v = new Viaje(hora, minutos);
    }
    public void añadirAsiento (int nAsiento){
        Viaje v = new Viaje(nAsiento);
    }
}
