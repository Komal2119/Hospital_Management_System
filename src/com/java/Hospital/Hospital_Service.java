package Service;
import java.util.ArrayList;
import java.util.List;
import com.java.Hospital.Doctor;
import com.java.Hospital.Patient;
import com.java.Hospital.Staff;

public class Hospital_Service {
private List<Doctor> doctors;
private List<Patient> patients;
private List<Staff> staffs;


public Hospital_Service() {
	doctors=new ArrayList<Doctor>();
	patients=new ArrayList<Patient>();
	staffs=new ArrayList<Staff>();
	
}

public void addDoctor(Doctor doctor) {
	doctors.add(doctor);
}
public void addPatient(Patient patient) {
	patients.add(patient);
}
public void addStaff(Staff staff) {
	staffs.add(staff);
}
}