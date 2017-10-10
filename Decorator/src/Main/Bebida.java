/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author manue
 */
public abstract class Bebida {

   public boolean complemento;
   public String nombre;

    public Bebida(String nombre) {
        complemento = false;
        this.nombre = nombre;
    }

    public abstract String GetNombre();
    public abstract int GetPrecio();
}
