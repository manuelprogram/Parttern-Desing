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
public class DarkRoss extends Bebida{

    public DarkRoss() {
        super("[+]Bebida:\n     [-]Dark Ross\n[+]Adicion:\n");
    }

    @Override
    public String GetNombre() {
        return this.nombre;
    }

    @Override
    public int GetPrecio() {
        return 4000;
    }
    
}
