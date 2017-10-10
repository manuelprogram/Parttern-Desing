/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here

        Bebida simple = null;
        String bebi = "¿ Que Bebida desea tomar ?\n1] House Blend $5000\n2] Dark Ross $4000\n3] Decaf $3000\n4] Expresso $2500\n5] Salir";
        String adi = "¿ Que desea Adicionarle ?\n1] Milk $2000\n2] Mocha $1000\n3] Soy $800\n4] Whip $2000\n5] Caramelo $1100\n6] PAGAR !!\n";
        int op = 10;
        while (true) {
            boolean good = true;
            String cad = JOptionPane.showInputDialog(null, bebi, "JUAN VALDEZ", JOptionPane.QUESTION_MESSAGE);
            if (cad.equals("")) {
                good = false;
            } else {
                op = Integer.parseInt(cad);
            }
            switch (op) {
                case 1:
                    simple = new HouseBlend();
                    break;
                case 2:
                    simple = new DarkRoss();
                    break;
                case 3:
                    simple = new Decaf();

                    break;
                case 4:
                    simple = new Expresso();

                    break;
                case 5:
                    return;
                default:
                    good = false;
            }
            if (good) {
                while (op != 6) {
                    cad = JOptionPane.showInputDialog(null, adi, "JUAN VALDEZ", JOptionPane.QUESTION_MESSAGE);
                    op = cad.equals("") ? 10 : Integer.parseInt(cad);
                    switch (op) {
                        case 1:
                            simple = new Milk(simple);
                            break;
                        case 2:
                            simple = new Mocha(simple);
                            break;
                        case 3:
                            simple = new Soy(simple);
                            break;
                        case 4:
                            simple = new Whip(simple);
                            break;
                        case 5:
                            simple = new Caramelo(simple);
                            break;
                        default:
                            if (op != 6) {
                                JOptionPane.showMessageDialog(null,"Seleccione bien!!","Error 404",JOptionPane.ERROR_MESSAGE);
                            }
                    }
                }
                JOptionPane.showMessageDialog(null," RECIBO DE CAJA\n"+simple.GetNombre()+"\n[+] Precio: "+simple.GetPrecio(),"JUAN VALDEZ",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
