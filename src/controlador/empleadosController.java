
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.EmpleadosModel;
import vistas.frmEmpleados;
import vistas.frmPrincipal;


public class empleadosController implements ActionListener {
    frmEmpleados VistaEmpleados;
    frmPrincipal VistaPrincipal;
    EmpleadosModel ModeloEmpleados;

    public empleadosController(frmEmpleados VistaEmpleados, frmPrincipal VistaPrincipal, EmpleadosModel ModeloEmpleados) {
        this.VistaEmpleados = VistaEmpleados;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloEmpleados = ModeloEmpleados;
        
        //levantar las vistas
        this.VistaPrincipal.setVisible(true);
        
        
        //oner a la escucha los botones
        
       this.VistaEmpleados.btnAgregar.addActionListener(this);
       this.VistaEmpleados.btnEditar.addActionListener(this);
       this.VistaEmpleados.btnElimonar.addActionListener(this);
       
       //levantar la vista empleados
       this.VistaEmpleados.setVisible(true);
       
       //realizar la conexion
       this.ModeloEmpleados.ListarDatos();
       //levantar el modelo y lograr recorrer el resultset
    }
    
  

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
    }
    
}
