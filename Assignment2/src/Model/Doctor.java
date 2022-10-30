/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Alankrutha Reddy Purumandla
 */
public class Doctor {
    String doctorName;
    Hospital hospital;

    public Doctor(String doctorName, Hospital hospital) {
        this.doctorName = doctorName;
        this.hospital = hospital;
    }
    
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
