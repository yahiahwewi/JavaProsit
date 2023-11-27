/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Yahya
 */
public class Département implements Comparable<Département> {
    private int nbrEmp;
    private int id;
    private String nom;
    
        public Département(){
    
    }
    
    
    
    
    public Département(int id ,String nom ,int nbrEmp ){
    this.id=id;
    this.nom=nom;
    this.nbrEmp=nbrEmp;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }
    
    
 //Equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Département e){
            return ( this.nom.equals(e.nom) && this.id == e.id);
        }
        return false;
    }
    
    
      @Override
    public String toString() {
        return "Employé{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
               ", nbrEmp=" + nbrEmp +

                '}';
    }

    @Override
    public int compareTo(Département o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
