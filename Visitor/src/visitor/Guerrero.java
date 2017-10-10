/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author manue
 */
public class Guerrero implements IPersonaje {

    private String arma = "";

    // ------------------------------
    public Guerrero() {
    }

    // ------------------------------
    public String getArma() {
        return this.arma;
    }

    // ------------------------------
    public void setArma(String arma) {
        this.arma = arma;
    }

    // ------------------------------
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
