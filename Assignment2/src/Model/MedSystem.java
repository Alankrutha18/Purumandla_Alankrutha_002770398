package Model;

import Data.PatientDirectory;
import Data.PersonDirectory;
import Data.DoctorDirectory;
import Data.HospitalDirectory;
import javax.swing.JTextField;

public class MedSystem {
    
    private PatientDirectory patientList;
    private PersonDirectory personList;
    private DoctorDirectory doctorList;
    private HospitalDirectory hospitalList;
    
    private City city;
    
    public MedSystem(){
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
        doctorList = new DoctorDirectory();
        hospitalList = new HospitalDirectory();
        initializeHospitalDoctorDirectories();
    }
    private void initializeHospitalDoctorDirectories(){
        Hospital hosp1 = new Hospital("h1", "com1");
        Hospital hosp2 = new Hospital("h2", "com2");
        Hospital hosp3 = new Hospital("h3", "com3");
        
        this.hospitalList.addHospital(hosp1);
        this.hospitalList.addHospital(hosp2);
        this.hospitalList.addHospital(hosp3);
        
        this.doctorList.addDoctor(new Doctor("doc11", hosp1));
        this.doctorList.addDoctor(new Doctor("doc12", hosp1));
        this.doctorList.addDoctor(new Doctor("doc21", hosp2));
        this.doctorList.addDoctor(new Doctor("doc22", hosp2));
        this.doctorList.addDoctor(new Doctor("doc31", hosp3));
        this.doctorList.addDoctor(new Doctor("doc32", hosp3));
    }
            
    public void addPerson(Person p){
        personList.addPerson(p);
    }

    public void addPatient(Patient p){
        patientList.addPatients(p);
    }
    
    
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public Person searchUser(int txtId) {
        System.out.println("idid:"+txtId);
        return personList.searchUser(txtId);
    }

    public void encounterPatient(int id, Encounter enc) {
        patientList.encounterPatient(id, enc);
    }

    public void deletePerson(int id) {
        personList.deletePerson(id);
    }

    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }

   

}
