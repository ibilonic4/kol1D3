/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Pomocno {

    static int ucitajBroj(String s) {

        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(s));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "moras unjeti broj");
            }
        }
    }

    static String ucitajString(String s) {
        String string;
        while (true) {

            string = JOptionPane.showInputDialog(s);

            if (string.trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "unesi trazeni podatak");
            }

            return string;
        }
    }

    static Date ucitajDatum(String s) {
        SimpleDateFormat d = new SimpleDateFormat("dd.MM.yyyy.");

        while (true) {
            try {
                return d.parse(JOptionPane.showInputDialog("unesi datum formata dd.MM.yyyy."));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "unesi datum ");
            }
        }

    }

    public static float ucitajFloat() {
        String s;
        float f;
        while (true) {
            try {
                f = Float.parseFloat(JOptionPane.showInputDialog("unesi decimalni broj"));
                return f;
            } catch (Exception e) {
                JOptionPane.showInputDialog("unesi decimalni");
            }
        }

    }

    static boolean ucitajBoolean(String s) {
        while (true) {
            try {
                return Boolean.parseBoolean(JOptionPane.showInputDialog(s));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "unesi true za da, a bilo sta za ne");
            }

        }
    }

    static float ucitajProsjek() {

        String s;
        float f;

        while (true) {
            try {
                f = Float.parseFloat(JOptionPane.showInputDialog("unesi prosjek na dvije decimale"));
                if (f < 0 || f > 5) {
                    JOptionPane.showMessageDialog(null, "to nije ocjena");
                    continue;
                }
                return f;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Niste ispravno unjeli");
            }

        }

    }

    static int ucitajOcijenu() {
        String s;
        int i;

        while (true) {
            try {
                i = Integer.parseInt(JOptionPane.showInputDialog("unesi ocjenu od 1 do 5"));
                if (i < 0 || i > 5) {
                    JOptionPane.showMessageDialog(null, "to nije ocjena");
                    continue;
                }
                return i;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Niste ispravno unjeli");
            }

        }

    }

}
