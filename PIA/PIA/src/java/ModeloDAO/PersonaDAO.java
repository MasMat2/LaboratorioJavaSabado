
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="select * from persona";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("Id"));
                per.setDni(rs.getString("DNI"));
                per.setNom(rs.getString("Nombres"));
                per.setApp(rs.getString("ApellidoPaterno"));
                per.setApm(rs.getString("ApellidoMaterno"));
                per.setEm(rs.getString("Email"));
                per.setEd(rs.getString("Edad"));
                
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setDni(rs.getString("DNI"));
                p.setNom(rs.getString("Nombres"));
                p.setApp(rs.getString("ApellidoPaterno"));
                p.setApm(rs.getString("ApellidoMaterno"));
                p.setEm(rs.getString("Email"));
                p.setEd(rs.getString("Edad"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
       String sql="insert into persona(DNI, Nombres, ApellidoPaterno, ApellidoMaterno, Email, Edad)values('"+per.getDni()+"','"+per.getNom()+"','"+per.getApp()+"','"+per.getApm()+"','"+per.getEm()+"','"+per.getEd()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona cont) {
        String sql="update persona set DNI='"+cont.getDni()+"',Nombres='"+cont.getNom()+"', ApellidoPaterno='"+cont.getApp()+"', ApellidoMaterno='"+cont.getApm()+"', Email='"+cont.getEm()+"', Edad='"+cont.getEd()+"'where Id="+cont.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from persona where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return false;
    }
    
}
