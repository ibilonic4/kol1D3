/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.List;

/**
 *
 * @author Ivor
 */
public class Kolegij {
    private int sifra;
    private String naziv;
    private int dozvoljenBroj;
    private List<Izostanak> izostanci;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDozvoljenBroj() {
        return dozvoljenBroj;
    }

    public void setDozvoljenBroj(int dozvoljenBroj) {
        this.dozvoljenBroj = dozvoljenBroj;
    }

    public List<Izostanak> getIzostanci() {
        return izostanci;
    }

    public void setIzostanci(List<Izostanak> izostanci) {
        this.izostanci = izostanci;
    }

    @Override
    public String toString() {
return naziv;    }
    
    
}
