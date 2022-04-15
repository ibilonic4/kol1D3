/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.Date;

/**
 *
 * @author Ivor
 */
public class Izostanak {
    private Date datum;
    private String razlog;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getRazlog() {
        return razlog;
    }

    public void setRazlog(String razlog) {
        this.razlog = razlog;
    }

    @Override
    public String toString() {
        return datum + " " + razlog;
    }
    
    
}
