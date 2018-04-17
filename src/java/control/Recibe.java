/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author Jacinto
 */
public class Recibe extends HttpServlet {
    ArrayList<Usuario> users = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String ip = request.getParameter("ip");
        request.setAttribute("users", users);
        //String code = request.getParameter("code");
        
        String error = "";
        String success = "";
        
        if (!ip.equals("")){
            //for (int i = 0; i < users.size(); i++) {
                Usuario u = new Usuario(ip);
                u.setCode(String.valueOf(users.size()+1));
                users.add(u);
            //}
            
            response(response, users.get(users.size()-1).getCode());
            
        }
    }
    
    private void response(HttpServletResponse response, String code)
        throws IOException {
		PrintWriter out = response.getWriter();
		//out.println("<html>");
		//out.println("<body>");
		out.println(code);
		//out.println("</body>");
		//out.println("</html>");
    }
}
