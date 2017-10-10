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
public class Decaf extends Bebida {

    public Decaf() {
        super("[+]Bebida:\n     [-]Decaf\n[+]Adicion:\n");
    }

     @Override
    public String GetNombre() {
        return this.nombre;
    }
    
    @Override
    public int GetPrecio() {
        return 3000;
    }

   

}
