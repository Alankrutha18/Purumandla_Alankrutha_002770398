/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import Model.Hospital;

/**
 *
 * @author Alankrutha Reddy Purumandla
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;

    public HospitalDirectory(){
        hospitals = new ArrayList<>();
    }
    
    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public void addHospital(Hospital hospital) {
        this.hospitals.add(hospital);
    }
    
    public void removeHospital(Hospital hospital) {
        this.hospitals.remove(hospital);
    }
}
