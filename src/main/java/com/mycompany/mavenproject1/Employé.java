/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Yahya
 */
public class Employé {

    private String nom;
    private  String prénom;
    private  String nomDep;
    private  int grade;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public Employé(int id ,String nom , String prénom , String nomDep , int grade){
        this.id=id;
        this.nom=nom;
        this.prénom=prénom;
        this.nomDep=nomDep;
        this.grade=grade;
        
    }
    
    public Employé (){
    
   }
    
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getGrade() {
        return grade;
    }
   
    
    
    //// Equals
@Override
public boolean equals(Object obj) {
    if (obj instanceof Employé) {
        Employé e = (Employé) obj;
        return this.nom.equals(e.getNom()) && this.id == e.getId();
    }
    return false;
}

// ToString
@Override
public String toString() {
    return "Employé{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", prénom='" + prénom + '\'' +
            ", nomDep='" + getNomDep() + '\'' +
            ", grade=" + grade +
            '}';
}

}
