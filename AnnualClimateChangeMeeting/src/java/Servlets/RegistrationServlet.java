/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Entities.Guest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javafx.scene.Cursor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pcsidcav
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("txtName");
        String age = request.getParameter("txtAge");
        String donatedAmount = request.getParameter("txtDonatedAmount");
        String organization = request.getParameter("slOrganization");
        String gender = request.getParameter("rbGender");
        String[] interests = request.getParameterValues("chkInterests");
        String politician = request.getParameter("chkPolitician");
        
        Guest newGuest = new Guest();
        newGuest.setAge(Integer.valueOf(age));
        newGuest.setDonatedAmount(Double.valueOf(donatedAmount));
        newGuest.setGender(gender);
        newGuest.setInterests(interests);
        newGuest.setName(name);
        newGuest.setOrganization(organization);
        newGuest.setPolitician(Boolean.valueOf(politician));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Confirmation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Guest Details</h1>");
            out.println("Name:" + newGuest.getName() + "<br/>");
            out.println("Age:" + newGuest.getAge() + "<br/>");
            out.println("Donated amount:" + newGuest.getDonatedAmount() + "<br/>");
            out.println("Organization:" + newGuest.getOrganization() + "<br/>");
            out.println("Gender:" + newGuest.getGender() + "<br/>");
            out.println("Interests:");
            for(int i = 0; i < newGuest.getInterests().length; i++){
                 out.println(newGuest.getInterests()[i] + "<br/>");
            }
            out.println("Politician:");
            if(newGuest.isPolitician()){
                out.println("Yes");
            }
            else{
                out.println("No");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
