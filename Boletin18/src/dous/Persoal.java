/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dous;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Persoal {
    private String telefono;
    private String correo;

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persoal() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
