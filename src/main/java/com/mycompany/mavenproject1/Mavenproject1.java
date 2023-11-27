/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Yahya
 */

public class Mavenproject1 {

    public static void main(String[] args) {
        DepartementHashSet departementSet = new DepartementHashSet();

        Département dep1 = new Département(1, "IT", 10);
        Département dep2 = new Département(2, "HR", 8);
        Département dep3 = new Département(3, "Finance", 12);

        departementSet.ajouterDepartement(dep1);
        departementSet.ajouterDepartement(dep2);
        departementSet.ajouterDepartement(dep3);

        System.out.println("Departments:");
        departementSet.displayDepartement();

        String searchName = "HR";
        boolean foundByName = departementSet.rechercherDepartement(searchName);
        System.out.println("Department with name '" + searchName + "' found: " + foundByName);

        Département searchDepartment = new Département(2, "HR", 8);
        boolean foundByObject = departementSet.rechercherDepartement(searchDepartment);
        System.out.println("Department found by object: " + foundByObject);

        departementSet.supprimerDepartement(dep2);

        System.out.println("\nUpdated Departments:");
        departementSet.displayDepartement();

        System.out.println("\nDepartments sorted by ID:");
        departementSet.trierDepartementById().forEach(System.out::println);
    }
}

