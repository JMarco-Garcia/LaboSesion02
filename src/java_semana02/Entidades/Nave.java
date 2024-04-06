/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_semana02.Entidades;

import java_semana02.Abstracciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class Nave extends Personaje{
    
    private int puntaje;
    
    public Nave(){}
    public Nave(int vidas, int puntaje, int nivel) {
        super(nivel, vidas);
        this.puntaje = puntaje;
    }
   
    /**
     * @return the puntaje
     */
    public int getpuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setpuntaje(int puntaje) {
        this.puntaje = puntaje;
    }  
}
