/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.edu.ec.videogameengine;

import espol.edu.ec.videogameengine.Configuracion.ConfiguracionGeneral;

/**
 *
 * @author Luizzz
 */
public class VideogameEngine {

    public static void main(String[] args) {
        System.out.println("VideoGame Engine");
        
        ConfiguracionGeneral config = ConfiguracionGeneral.getInstancia();
        config.setDimensionesPantalla(1920);
        config.setMinMemoriaRAM(4096);
        config.setMinEspacioDisco(10000);
        
        Jugador.JugadorBuilder jugadorBuilder = new Jugador.JugadorBuilder()
                .startBuild("Heroe")
                .addAccion("Caminar")
                .addAccion("Saltar")
                .setCaracteristicasBase()
                .setVida(100)
                .setFuerza(100);
        
        Jugador jugador = jugadorBuilder.build();
        
        jugador.dibujar();
        jugador.actualizar();
        
        System.out.println("Dimensiones Pantalla: " + config.getDimensionesPantalla());
        System.out.println("Min Memoria RAM: " + config.getMinMemoriaRAM());
        System.out.println("Min Espacio Disco: " + config.getMinEspacioDisco());
    }
}



















