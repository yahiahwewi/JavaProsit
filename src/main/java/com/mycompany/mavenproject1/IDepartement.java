/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.TreeSet;

/**
 *
 * @author Yahya
 */

public interface IDepartement<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String nom);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void displayDepartement();
    TreeSet<T> trierDepartementById();
}
