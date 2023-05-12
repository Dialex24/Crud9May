/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class EmpleadosModel {
    String Codigo;
    String Apellidos;
    String Nombre;
    String Telefono;
    Conexion nuevaConexion;
    Connection myConexion;
    ResultSet rst;

    public EmpleadosModel() {
    }

    public EmpleadosModel(String Codigo, String Apellidos, String Nombre, String Telefono) {
        this.Codigo = Codigo;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public ResultSet ListarDatos(){
        
        try
        {
          
          myConexion = nuevaConexion.Conectar();
          Statement sentencia = myConexion.createStatement();
          rst = sentencia.executeQuery("Select * from Empleados");
          return rst;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "no se pudo listar empleados");
            return rst;
        }
    }
}
