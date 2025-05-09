
public class AppointmentBST {
    private AppointmentNode root;

    public AppointmentBST() {
        root = null;
    }

    public void addAppointment(PatientAppointment appointment) {
        root = insertRec(root, appointment);
    }

    private AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
        // TODO: Implement logic to insert by appointment time (avoid duplicates)
        AppointmentNode current = root;
        while(current != null){

            int currentTime = Integer.parseInt(current.data.appointmentTime.substring(0, 2) + current.data.appointmentTime.substring(3));
            int appointmentTime = Integer.parseInt(appointment.appointmentTime.substring(0, 2) + appointment.appointmentTime.substring(3));

            if (appointmentTime == currentTime){
                return root;
            }
            else if (appointmentTime > currentTime){
                if (current.right == null){
                    current.right = new AppointmentNode(appointment);
                    return root;
                }
                current = current.right;
            }
            else {
                if (current.left == null){
                    current.left = new AppointmentNode(appointment);
                    return root;
                }
                current = current.left;
            }
        }

        root = new AppointmentNode(appointment);
        return root;
    }

    public void inOrderTraversal(AppointmentNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public AppointmentNode getRoot() {
        return root;
    }
}
