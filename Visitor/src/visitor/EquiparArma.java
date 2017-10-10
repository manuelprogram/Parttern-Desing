/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.List;

/**
 *
 * @author manue
 */
public class EquiparArma implements IVisitor{

    @Override
     public void visit( Mago m )
    {
        m.setArma("DAGA");
    }
    // ------------------------------
    @Override
     public void visit( Guerrero g )
    {
        g.setArma("ESPADA");
    }
    // ------------------------------
    @Override
     public void visit( List<IPersonaje> personajes )
    {
        for( IPersonaje p : personajes )
        {
             p.accept(this);
        }
    }
    
}
