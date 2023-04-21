/*
 *@author AaronCurro
 */
public class Viaje {
    int horaSalida;
    int minSalida;
    int numAsiento;
    Viaje (int horaSalida, int minSalida){
        this.horaSalida=horaSalida;
        this.minSalida=minSalida;
    }
    Viaje (int numAsiento){
        this.numAsiento=numAsiento;
    }
    Viaje (int horaSalida, int minSalida, int numAsiento){
        this.horaSalida=horaSalida;
        this.minSalida=minSalida;
        this.numAsiento=numAsiento;
    }
}
