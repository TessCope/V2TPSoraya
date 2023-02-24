/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author malki
 */
public class InfoSpectacle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
           Connection connection = null;
            String url = "jdbc:mysql://localhost:3306/gestionSpectaclesBD2";
            String user = "root";
            String pwd = "gr007,,";
            String test = "";
            Statement statement;
            String genre = "0";
            PreparedStatement preparedStatement = null;
            String requete = null;
            ResultSet resultSet = null;
            String nomSpectacle = "Les Blondes Naturelles";
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, pwd);

                if (connection != null) {
                    test = "reussi";
                }
                
                requete = "SELECT * FROM Spectacle";
            preparedStatement = connection.prepareStatement(requete);
            resultSet = preparedStatement.executeQuery();
                
                    while (resultSet.next()) {
                        if (nomSpectacle == resultSet.getString("titre")){
                          
            
               
                    }
                       break;  }
                     String typeSpectacle = resultSet.getString("type");
                String description = resultSet.getString("description");
                 
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InfoSpectacle</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Voici le nom du spectacle: " + nomSpectacle + "</h1>");
           out.println("<h1>Voici son genre: " + typeSpectacle + "</h1>");
          out.println("<h1>Voici la description: " + description + "</h1>");
            
            out.println("<h1>La connection a " + test + "</h1>");
            out.println("</body>");
            out.println("</html>");
                        
           
             
                
                
              
                    resultSet.close();
            preparedStatement.close();
            connection.close();
                 
            } catch (Exception sqlE) {
                sqlE.printStackTrace();
                genre = "null";
                test = "echoue";
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
