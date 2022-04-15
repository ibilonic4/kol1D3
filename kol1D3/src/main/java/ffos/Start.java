/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Start {
    private List <Kolegij> kolegiji= new ArrayList<>();
    
    
    public Start(){
    ucitajKolegije();
    ispisKolegija();
    }
    
    public static void main(String[] args) {
        new Start();
    }

    private void ucitajKolegije() {

        String s;
        while(true){
        ucitajKolegij();
        s=JOptionPane.showInputDialog("unesi k za prekid");
        if(s.trim().toLowerCase().equals("k")){break;}
        
        }




    }

    private void ucitajKolegij() {
JOptionPane.showMessageDialog(null, "unos kolegija");

Kolegij k = new Kolegij();

k.setSifra(Pomocno.ucitajBroj("sifra"));
k.setNaziv(Pomocno.ucitajString("naziv"));
k.setDozvoljenBroj(Pomocno.ucitajBroj("dozvoljeni izostanci"));
k.setIzostanci(new ArrayList<>());

String z;

while(true){
JOptionPane.showMessageDialog(null, "unos izostnka");
k.getIzostanci().add(ucitajIzostanak());
z= JOptionPane.showInputDialog("unesi k za prekid");
if(z.trim().toLowerCase().equals("k")){break;}

}

kolegiji.add(k);

    }

    private Izostanak ucitajIzostanak() {
Izostanak i = new Izostanak();   
    i.setDatum(Pomocno.ucitajDatum("unesi datum"));
    i.setRazlog(Pomocno.ucitajString("razlog izostanka"));
    
    
    return i;
    
    }

    private void ispisKolegija() {
for(Kolegij k : kolegiji){
    int j = 0;
    
    for(Izostanak i : k.getIzostanci() ){
    j++;
    }
    
    if(j>k.getDozvoljenBroj()){System.out.println(k.getNaziv() + " previse izostanaka");}
    else{
    System.out.println(k.getNaziv() + " " + j + "/"+k.getDozvoljenBroj());}
}

    }
}
