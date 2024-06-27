/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine.Configuracion;

/**
 *
 * @author Luizzz
 */
public class ConfiguracionGeneral {
    private static ConfiguracionGeneral instancia;
    private int dimensionesPantalla;
    private int minMemoriaRAM;
    private int minEspacioDisco;
    
    private ConfiguracionGeneral() {
        this.dimensionesPantalla = 1080;
        this.minMemoriaRAM = 2048; // 2 GB
        this.minEspacioDisco = 5000; // 5 GB
    }
    
    public static ConfiguracionGeneral getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGeneral();
        }
        return instancia;
    }
    
    public int getDimensionesPantalla() {
        return dimensionesPantalla;
    }

    public void setDimensionesPantalla(int dimensionesPantalla) {
        this.dimensionesPantalla = dimensionesPantalla;
    }

    public int getMinMemoriaRAM() {
        return minMemoriaRAM;
    }

    public void setMinMemoriaRAM(int minMemoriaRAM) {
        this.minMemoriaRAM = minMemoriaRAM;
    }

    public int getMinEspacioDisco() {
        return minEspacioDisco;
    }

    public void setMinEspacioDisco(int minEspacioDisco) {
        this.minEspacioDisco = minEspacioDisco;
    }
}































