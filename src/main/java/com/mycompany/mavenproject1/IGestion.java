/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Yahya
 */
public interface IGestion<T>{
public void ajouterEmploye(T t);
public boolean rechercherEmploye(String nom);
public boolean rechercherEmploye(T t);
public void supprimerEmploye(T t);
public void displayEmploye();
public void trierEmployeParId(); //Comparable
public void trierEmployeParNomDépartementEtGrade(); //Comparator
}