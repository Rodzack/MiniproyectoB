package Servlet;

import Beans.Beans;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Beans.Query;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jhosep
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Servlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            ResultSet res;
            Query query;
             Beans bean;
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(request.getParameter("saldo"));
            
            double mouse = Double.parseDouble(request.getParameter("saldo")) * 2 / 100;
            double pantalla = Double.parseDouble(request.getParameter("saldo")) * 10 / 100;
            double board = Double.parseDouble(request.getParameter("saldo")) * 12 / 100;
            double procesador = Double.parseDouble(request.getParameter("saldo")) * 19 / 100;
            double grafica = Double.parseDouble(request.getParameter("saldo")) * 19 / 100;
            double fuentePoder = Double.parseDouble(request.getParameter("saldo")) * 8 / 100;
            int teclado = Integer.parseInt(request.getParameter("saldo")) * 2 / 100;
            double cooler = Double.parseDouble(request.getParameter("saldo")) * 3 / 100;
            double dicoDuro = Double.parseDouble(request.getParameter("saldo")) * 6 / 100;
            double gabinete = Double.parseDouble(request.getParameter("saldo")) * 13 / 100;
            query = new Query();
            res = query.teclado(teclado);
         
            
            
            
            
            
            
            
            
            
            
            
            
            

            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
