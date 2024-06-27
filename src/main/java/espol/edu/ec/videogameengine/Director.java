/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luizzz
 */
public class Director {
    private String nombre;
    private List<String> acciones = new ArrayList<>();
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void dibujar() {
        // Implementación de dibujar
    }

    public void actualizar() {
        // Implementación de actualizar
    }

    // Métodos getters para obtener los atributos
    public String getNombre() {
        return nombre;
    }

    public List<String> getAcciones() {
        return acciones;
    }

    // Métodos para construir la entidad
    public Director startBuild(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Director addAccion(String accion) {
        this.acciones.add(accion);
        return this;
    }

    public Director addSprite(String sprite) {
        // Agregar sprite a la entidad
        return this;
    }

    public Director setCaracteristicasBase() {
        // Configurar características base
        return this;
    }

    public Director build() {
        // Retorna el director que ahora representa una entidad completa
        return this;
    }
}



















