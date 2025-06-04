/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciodefixacaoset;

import entities.Students;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author crist
 */

public class ExercicioDeFixacaoSet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            
            Set<Students> set = new HashSet<>();
            System.out.println("How many students for course A: ");
            int nQuantityStudents = scan.nextInt();
            
            for(int i = 0; i < nQuantityStudents; i++){
            System.out.println("Enter User Registration Code:");
            int userRegisterCode = scan.nextInt();
            set.add(new Students(userRegisterCode) );
            }
            
            System.out.println("How many students for course B: ");
            nQuantityStudents = scan.nextInt();
            
            for(int i = 0; i < nQuantityStudents; i++){
            System.out.println("Enter User Registration Code:");
            int userRegisterCode = scan.nextInt();
            set.add(new Students(userRegisterCode) );    
            }
            
            System.out.println("How many students for course C: ");
            nQuantityStudents = scan.nextInt();
        
            for(int i = 0; i < nQuantityStudents; i++){
            System.out.println("Enter User Registration Code:");
            int userRegisterCode = scan.nextInt();
            set.add(new Students(userRegisterCode) );    
            }
            
            System.out.println("Total Students: " + set.size());
            
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }

    }
}
