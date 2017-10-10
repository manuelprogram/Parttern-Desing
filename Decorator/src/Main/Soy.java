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
public class Soy extends Adicional {

    public Soy(Bebida beber) {
        super("Soy");
        this.beber = beber;
    }

    @Override
    public String GetNombre() {
        return this.beber.GetNombre() + "     [-] " + this.nombre + "\n";
    }

    @Override
    public int GetPrecio() {
        return this.beber.GetPrecio() + 800;
    }

}
