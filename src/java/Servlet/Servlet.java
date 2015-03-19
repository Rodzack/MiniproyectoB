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
             
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //Arreglos (Matrices)
            String aMouse[][];
            String aPantalla[][];
            String aboard[][];
            String aPrecesador[][];
            String aGrafica[][];
            String aFuentePoder[][];
            String aTeclado[][];
            String aCooler[][];
            String aDiscoDuro[][];
            String aGabinete[][];
          
            ///calculo de total por parte
            int mouse = Integer.parseInt(request.getParameter("saldo")) * 2 / 100;
            int pantalla = Integer.parseInt(request.getParameter("saldo")) * 10 / 100;
            int board = Integer.parseInt(request.getParameter("saldo")) * 12 / 100;
            int procesador = Integer.parseInt(request.getParameter("saldo")) * 19 / 100;
            int grafica = Integer.parseInt(request.getParameter("saldo")) * 19 / 100;
            int fuentePoder = Integer.parseInt(request.getParameter("saldo")) * 8 / 100;
            int teclado = Integer.parseInt(request.getParameter("saldo")) * 2 / 100;
            int cooler = Integer.parseInt(request.getParameter("saldo")) * 3 / 100;
            int dicoDuro = Integer.parseInt(request.getParameter("saldo")) * 6 / 100;
            int gabinete = Integer.parseInt(request.getParameter("saldo")) * 13 / 100;
               out.println(board);     
            //Consultas por  parte (Mouse)        
            query = new Query();
            res = query.mouse(mouse);
            int m=0;
            while (res.next()) {
                    m++;
                }
            aMouse = new String [3][m];
            res = query.mouse(mouse);
            int jm=0;
            while (res.next()) {
                    
                    aMouse[0][jm] = res.getString("p.nombre");
                    aMouse[1][jm] = res.getString("tp.tipoProducto");
                    aMouse[2][jm] = res.getString("dp.precio");
                    out.println(aMouse[0][jm] + " | " + aMouse[1][jm] + " | " + aMouse[2][jm] + "<br>");

                    jm++;
                }
            
            //Consultas por  parte (Pantalla)        
            query = new Query();
            res = query.pantalla(pantalla);
            int p=0;
            while (res.next()) {
                    p++;
                }
            aPantalla = new String [3][p];
            res = query.pantalla(pantalla);
            int jp=0;
            while (res.next()) {
                    
                    aPantalla[0][jp] = res.getString("p.nombre");
                    aPantalla[1][jp] = res.getString("tp.tipoProducto");
                    aPantalla[2][jp] = res.getString("dp.precio");
                    out.println(aPantalla[0][jp] + " | " + aPantalla[1][jp] + " | " + aPantalla[2][jp] + "<br>");

                    jp++;
                }
            //Consultas por  parte (Board)        
            query = new Query();
            res = query.board(board);
            int b=0;
            while (res.next()) {
                   b++;
                }
            aboard = new String [3][b];
            res = query.board(board);
            int jb=0;
            while (res.next()) {
                    
                    aboard[0][jb] = res.getString("p.nombre");
                    aboard[1][jb] = res.getString("tp.tipoProducto");
                    aboard[2][jb] = res.getString("dp.precio");
                    out.println(aboard[0][jb] + " | " + aboard[1][jb] + " | " + aboard[2][jb] + "<br>");

                    jp++;
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

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
