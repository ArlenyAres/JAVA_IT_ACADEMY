
public class Pc {
	
	private int discoDuro;
    private int memoriaRam;
    private String procesador;
    private boolean wifi;

    public Pc (int memoriaRam, String procesador) {// sobre carga de constru
        this.discoDuro = 500;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.wifi = false;
    }

    public Pc (int discoDuro, int memoriaRam, String procesador) {
        this.discoDuro = discoDuro;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.wifi = true;
    }


    public int getDiscoDuro() {
        return this.discoDuro;
    }

    public int getMemoriaRam() {
        return this.memoriaRam;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public boolean getWifi() {
        return this.wifi;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setMemoriaRam (int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setWifi (boolean wifi) {
        this.wifi = wifi;
    }

    public String ejecutandose(String programa) { // creando otra salida.
        return "Estoy ejecutando el programa. " + programa;

    }

    public String toString() {
        return "Soy un PC que tengo " + this.discoDuro + " de Gigas de disco." + this.memoriaRam + " Gigas de ram, con un procesador de " +
                this.procesador + " dispongo de WiFi." + this.wifi;
    }

}