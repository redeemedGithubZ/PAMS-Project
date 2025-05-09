
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentBSTTest {
    @Test
    public void testAddAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient", "09:00");
        bst.addAppointment(p1);
        assertNotNull(bst.getRoot());
    }
    @Test
    public void testAddMultipleAppointments() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient 1", "09:00");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient 2", "10:00");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient 3", "08:00");
        PatientAppointment p4 = new PatientAppointment(4, "Test Patient 4", "11:00");
        PatientAppointment p5 = new PatientAppointment(5, "Test Patient 5", "07:00");

        System.out.println("Patients created:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.addAppointment(p4);
        bst.addAppointment(p5);

        System.out.println("\nPatients in tree:");
        assertNotNull(bst.getRoot());
        bst.inOrderTraversal(bst.getRoot());
    }

    @Test
    public void testAvoidDuplicateTimes() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient 1", "09:00");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient 2", "09:00");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient 3", "08:00");
        PatientAppointment p4 = new PatientAppointment(4, "Test Patient 4", "08:00");
        PatientAppointment p5 = new PatientAppointment(5, "Test Patient 5", "07:00");

        System.out.println("\nPatients created:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.addAppointment(p4);
        bst.addAppointment(p5);

        System.out.println("\nPatients in tree:");
        assertNotNull(bst.getRoot());
        bst.inOrderTraversal(bst.getRoot());
    }

}
