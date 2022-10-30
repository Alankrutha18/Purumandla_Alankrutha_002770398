/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Alankrutha Reddy purumandla
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor) {
        this.doctors.remove(doctor);
    }
}
