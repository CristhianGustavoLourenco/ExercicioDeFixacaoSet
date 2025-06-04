/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class Students {
    
    private int codStudents;

    public Students(int codStudents) {
        this.codStudents = codStudents;
    }

    public int getCodStudents() {
        return codStudents;
    }

    public void setCodStudents(int codStudents) {
        this.codStudents = codStudents;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codStudents;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Students other = (Students) obj;
        return this.codStudents == other.codStudents;
    }

    
    
    
}
