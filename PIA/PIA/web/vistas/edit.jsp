
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              PersonaDAO dao=new PersonaDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Persona p=(Persona)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador">
                Clave:<br>
                <input class="form-control" type="text" name="txtDni" value="<%= p.getDni()%>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>"><br>
                Apellido Paterno: <br>
                <input class="form-control" type="text" name="txtApp" value="<%= p.getApp()%>"><br>
                Apellido Materno: <br>
                <input class="form-control" type="text" name="txtApm" value="<%= p.getApm()%>"><br>
                E-mail: <br>
                <input class="form-control" type="text" name="txtEm" value="<%= p.getEm()%>"><br>
                Edad: <br>
                <input class="form-control" type="text" name="txtEd" value="<%= p.getEd()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= p.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
