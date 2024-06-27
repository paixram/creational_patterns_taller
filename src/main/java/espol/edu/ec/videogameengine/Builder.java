/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.videogameengine;

/**
 *
 * @author Luizzz
 */
interface Builder {
    Builder startBuild(String nombre);
    Builder addAccion(String accion);
    Builder addSprite(String sprite);
    Builder setCaracteristicasBase();
    Director build();
}















