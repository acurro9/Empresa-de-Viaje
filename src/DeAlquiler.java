/*
 *@author AaronCurro
 */
public class DeAlquiler {
    //Atributos
    String nombre;
    int CIF;
    String domFiscal;
    double precio;
    int barcos;
    int maxTripulacion;
    int codBarco;
    String nombreBarco;

    //Constructores
    DeAlquiler (String nombre, int CIF, String domFiscal, double precio,
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
    /*
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * @param CIF
     */
    public void setCIF(int CIF) {
        this.CIF = CIF;
    }
    /*
     * @param domFiscal
     */
    public void setDomFiscal(String domFiscal) {
        this.domFiscal = domFiscal;
    }
    /*
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /*
     * @param Barcos
     */
    public void setBarcos(int barcos) {
        this.barcos = barcos;
    }
    /*
     * @param MaxTipulacion
     */
    public void setMaxTripulacion(int maxTripulacion) {
        this.maxTripulacion = maxTripulacion;
    }
    /*
     * @param codBarco
     */
    public void setCodBarco(int codBarco) {
        this.codBarco = codBarco;
    }
    /*
     * @param nombreBarco
     */
    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    //Getters
    /*
     * @param nombre
     * @return String con el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * @param CIF
     * @return int con el CIF
     */
    public int getCIF() {
        return CIF;
    }
    /*
     * @param domFiscal
     * @return String con el domicilio fiscal
     */
    public String getDomFiscal() {
        return domFiscal;
    }
    /*
     * @param precio
     * @return double con el precio
     */
    public double getPrecio() {
        return precio;
    }
    /*
     * @param barcos
     * @return int con el número de barcos que tiene la empresa ofreciendo viajes
     */
    public int getBarcos() {
        return barcos;
    }
    /*
     * @param maxTripulacion
     * @return int con el número máximo de personas que cogen en el barco
     */
    public int getMaxTripulacion() {
        return maxTripulacion;
    }
    /*
     * @param codBarco
     * @return int con el código del barco
     */
    public int getCodBarco() {
        return codBarco;
    }
    /*
     * @param nombreBarco
     * @return String con el nombre del barco
     */
    public String getNombreBarco() {
        return nombreBarco;
    }

    //AñadirHorario y AñadirAsiento
    /*
     * @param int hora
     * @param int minutos
     * Se crea un nuevo viaje con la hora y los minutos indicados para la salida del barco
     */
    public void añadirHorario(int hora, int minutos){
        Viaje v = new Viaje(hora, minutos);
    }
    /*
     * @param int nAsiento
     * Se guarda la selección de asiento para el viaje
     */
    public void añadirAsiento (int nAsiento){
        Viaje v = new Viaje(nAsiento);
    }
}
