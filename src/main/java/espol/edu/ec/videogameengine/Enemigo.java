/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine;

/**
 *
 * @author Luizzz
 */
public class Enemigo extends Director {
    
    private String tipo;
    private int poder;

    public Enemigo(EnemigoBuilder builder) {
        super(builder);
        this.tipo = builder.tipo;
        this.poder = builder.poder;
    }

    public static class EnemigoBuilder extends Director implements Builder {
        private String tipo;
        private int poder;

        public EnemigoBuilder() {
            super(null);
        }

        @Override
        public EnemigoBuilder startBuild(String nombre) {
            super.startBuild(nombre);
            return this;
        }

        @Override
        public EnemigoBuilder addAccion(String accion) {
            super.addAccion(accion);
            return this;
        }

        @Override
        public EnemigoBuilder addSprite(String sprite) {
            super.addSprite(sprite);
            return this;
        }

        @Override
        public EnemigoBuilder setCaracteristicasBase() {
            super.setCaracteristicasBase();
            return this;
        }

        public EnemigoBuilder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public EnemigoBuilder setPoder(int poder) {
            this.poder = poder;
            return this;
        }

        @Override
        public Enemigo build() {
            return new Enemigo(this);
        }
    }
    
}















