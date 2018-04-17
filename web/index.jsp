<%-- 
    Document   : page
    Created on : Apr 16, 2018, 12:15:55 PM
    Author     : Jacinto
--%>

<%@page import="java.io.IOException"%>
<%@page import="javax.print.PrintException"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <form method = "get" action ="recibe">
            <input type="text" name="ip">
            
            <%
            /*try {
                ArrayList<Usuario> users = (ArrayList)request.getAttribute("users");
                if (!users.isEmpty()){
                    for(int i=0;i<users.size();i++){
                        //out.print(users.get(i).getCode() + "<br>");
                        //out.close();
                        
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }*/
            %>
        </form>
    </body>
</html>
