/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine;

/**
 *
 * @author Luizzz
 */
public class Objeto extends Director {
    private int peso;
    private String tipo;

    public Objeto(ObjetoBuilder builder) {
        super(builder);
        this.peso = builder.peso;
        this.tipo = builder.tipo;
    }

    public static class ObjetoBuilder extends Director implements Builder {
        private int peso;
        private String tipo;

        public ObjetoBuilder() {
            super(null);
        }

        @Override
        public ObjetoBuilder startBuild(String nombre) {
            super.startBuild(nombre);
            return this;
        }

        @Override
        public ObjetoBuilder addAccion(String accion) {
            super.addAccion(accion);
            return this;
        }

        @Override
        public ObjetoBuilder addSprite(String sprite) {
            super.addSprite(sprite);
            return this;
        }

        @Override
        public ObjetoBuilder setCaracteristicasBase() {
            super.setCaracteristicasBase();
            return this;
        }

        public ObjetoBuilder setPeso(int peso) {
            this.peso = peso;
            return this;
        }

        public ObjetoBuilder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        @Override
        public Objeto build() {
            return new Objeto(this);
        }
    }
}
