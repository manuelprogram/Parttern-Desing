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
public class HouseBlend extends Bebida {

    public HouseBlend() {
        super("[+]Bebida:\n     [-]HouseBlend\n[+]Adicion:\n");
    }
    @Override
    public String GetNombre() {
        return this.nombre;
    }

    @Override
    public int GetPrecio() {
        return 5000;
    }

}
