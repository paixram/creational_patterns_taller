/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine;

/**
 *
 * @author Luizzz
 */
public class Jugador extends Director {
    
    private int vida;
    private int fuerza;

    public Jugador(JugadorBuilder builder) {
        super(builder);
        this.vida = builder.vida;
        this.fuerza = builder.fuerza;
    }

    public static class JugadorBuilder extends Director implements Builder {
        private int vida;
        private int fuerza;

        public JugadorBuilder() {
            super(null);
        }

        @Override
        public JugadorBuilder startBuild(String nombre) {
            super.startBuild(nombre);
            return this;
        }

        @Override
        public JugadorBuilder addAccion(String accion) {
            super.addAccion(accion);
            return this;
        }

        @Override
        public JugadorBuilder addSprite(String sprite) {
            super.addSprite(sprite);
            return this;
        }

        @Override
        public JugadorBuilder setCaracteristicasBase() {
            super.setCaracteristicasBase();
            return this;
        }

        public JugadorBuilder setVida(int vida) {
            this.vida = vida;
            return this;
        }

        public JugadorBuilder setFuerza(int fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        @Override
        public Jugador build() {
            return new Jugador(this);
        }
    }
    
}






















