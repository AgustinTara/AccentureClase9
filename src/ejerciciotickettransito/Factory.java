package ejerciciotickettransito;

import ejerciciotickettransito.gentickets.*;

public class Factory {
    public static sensorvelocidad.Sensor crearSensorVelocidad() {
        return new sensorvelocidad.Sensor();
    }
    public static sensorclima.Sensor crearSensorClima() {
        return new sensorclima.Sensor();
    }
    public static Procesador crearProcesador() {
        GeneradorTicket generadorTicket = 
                new GeneradorTicketTxt(
                        z -> new com.google.gson.Gson().toJson(z),
                        "C:\\tickets\\"
                );
        
        return new Procesador(generadorTicket);
    }
}
