
import controlador.empleadosController;
import modelos.EmpleadosModel;
import vistas.*;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        EmpleadosModel ModeloEmpleados = new EmpleadosModel();
        frmEmpleados VistaEmpleados = new frmEmpleados(VistaPrincipal, true);
        empleadosController ControladorEmpleados = new empleadosController(VistaEmpleados, VistaPrincipal, ModeloEmpleados);
    }
    
}
