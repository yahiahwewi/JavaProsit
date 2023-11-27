/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Yahya
 */
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Département> {
    private HashSet<Département> départements;

    public DepartementHashSet() {
        départements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Département departement) {
        départements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Département dep : départements) {
            if (dep.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Département departement) {
        return départements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Département departement) {
        départements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Département dep : départements) {
            System.out.println(dep.toString());
        }
    }

    @Override
    public TreeSet<Département> trierDepartementById() {
        return new TreeSet<>(départements);
    }
}

