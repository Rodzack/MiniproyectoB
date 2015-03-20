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
            String aRam[][];
          
            ///calculo de total por parte
            int mouse = Integer.parseInt(request.getParameter("saldo")) * 2 / 100;
            int pantalla = Integer.parseInt(request.getParameter("saldo")) * 17 / 100;
            int board = Integer.parseInt(request.getParameter("saldo")) * 11 / 100;
            int procesador = Integer.parseInt(request.getParameter("saldo")) * 18 / 100;
            int grafica = Integer.parseInt(request.getParameter("saldo")) * 15 / 100;
            int fuentePoder = Integer.parseInt(request.getParameter("saldo")) * 8 / 100;
            int teclado = Integer.parseInt(request.getParameter("saldo")) * 2 / 100;
            int cooler = Integer.parseInt(request.getParameter("saldo")) * 6 / 100;
            int dicoDuro = Integer.parseInt(request.getParameter("saldo")) * 6 / 100;
            int gabinete = Integer.parseInt(request.getParameter("saldo")) * 9 / 100;
             int ram = Integer.parseInt(request.getParameter("saldo")) * 9 / 100; 
            
            //Consultas por  parte (Mouse)        
            query = new Query();
            res = query.mouse(mouse);
            int m=0;
            while (res.next()) {
                    m++;
                }
            aMouse = new String [4][m];
            res = query.mouse(mouse);
            int jm=0;
            while (res.next()) {
                    
                    aMouse[0][jm] = res.getString("p.nombre");
                    aMouse[1][jm] = res.getString("d.tipoDeConexion");
                    aMouse[2][jm] = res.getString("dp.precio");
                    aMouse[3][jm] = res.getString("d.descripcionAdicional");
                    
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
            
            //Consultas por  parte (Precesador)        
            query = new Query();
            res = query.procesador(procesador);
            int pc=0;
            while (res.next()) {
                   pc++;
                }
            aPrecesador = new String [4][pc];
            res = query.procesador(procesador);
            int jpc=0;
            while (res.next()) {
                    
                    aPrecesador[0][jpc] = res.getString("p.nombre");
                    aPrecesador[1][jpc] = res.getString("d.velocidad");
                    aPrecesador[2][jpc] = res.getString("dp.precio");
                    aPrecesador[3][jpc] = res.getString("d.tecnologia");
                    
                    out.println(aPrecesador[0][jpc] + " | " + aPrecesador[1][jpc] + " | " + aPrecesador[2][jpc] + "<br>");

                    jpc++;
                }
            //Consultas por  parte (Grafica)        
            query = new Query();
            res = query.grafica(grafica);
            int g=0;
            while (res.next()) {
                   g++;
                }
            aGrafica = new String [4][g];
            res = query.grafica(grafica);
            int jg=0;
            while (res.next()) {
                    
                    aGrafica[0][jg] = res.getString("p.nombre");
                    aGrafica[1][jg] = res.getString("d.capacidad");
                    aGrafica[2][jg] = res.getString("dp.precio");
                    aGrafica[3][jg] = res.getString("d.tecnologia");
                    
                    out.println(aGrafica[0][jg] + " | " + aGrafica[1][jg] + " | " + aGrafica[2][jg] + "<br>");

                    jg++;
                }
            
            //Consultas por  parte (Fuente de poder)        
            query = new Query();
            res = query.fuentePoder(fuentePoder);
            int f=0;
            while (res.next()) {
                   f++;
                }
            aFuentePoder = new String [4][f];
            res = query.fuentePoder(fuentePoder);
            int jf=0;
            while (res.next()) {
                    
                    aFuentePoder[0][jf] = res.getString("p.nombre");
                    aFuentePoder[1][jf] = res.getString("tp.tipoProducto");
                    aFuentePoder[2][jf] = res.getString("dp.precio");
                    aFuentePoder[3][jf] = res.getString("d.voltaje");
                    out.println(aFuentePoder[0][jf] + " | " + aFuentePoder[1][jf] + " | " + aFuentePoder[2][jf] + "<br>");
                    jf++;
                }
            
            //Consultas por  parte (Teclado)        
            query = new Query();
            res = query.teclado(teclado);
            int t=0;
            while (res.next()) {
                   t++;
                }
            aTeclado = new String [3][t];
            res = query.teclado(teclado);
            int jt=0;
            while (res.next()) {
                    
                    aTeclado[0][jt] = res.getString("p.nombre");
                    aTeclado[1][jt] = res.getString("d.tipoDeConexion");
                    aTeclado[2][jt] = res.getString("dp.precio");
                    out.println(aTeclado[0][jt] + " | " + aTeclado[1][jt] + " | " + aTeclado[2][jt] + "<br>");

                    jt++;
                }
            //Consultas por  parte (Cooler)        
            query = new Query();
            res = query.cooler(cooler);
            int c=0;
            while (res.next()) {
                   c++;
                }
            aCooler = new String [3][c];
            res = query.cooler(cooler);
            int jc=0;
            while (res.next()) {
                    
                    aCooler[0][jc] = res.getString("p.nombre");
                    aCooler[1][jc] = res.getString("tp.tipoProducto");
                    aCooler[2][jc] = res.getString("dp.precio");
                    out.println(aCooler[0][jc] + " | " + aCooler[1][jc] + " | " + aCooler[2][jc] + "<br>");
                    jc++;
                }
            
            //Consultas por  parte (Disco Duro)        
            query = new Query();
            res = query.discoDuro(dicoDuro);
            int d=0;
            while (res.next()) {
                   d++;
                }
            aDiscoDuro = new String [3][d];
            res = query.discoDuro(dicoDuro);
            int jd=0;
            while (res.next()) {
                    
                    aDiscoDuro[0][jd] = res.getString("p.nombre");
                    aDiscoDuro[1][jd] = res.getString("d.capacidad");
                    aDiscoDuro[2][jd] = res.getString("dp.precio");
                    out.println(aDiscoDuro[0][jd] + " | " + aDiscoDuro[1][jd] + " | " + aDiscoDuro[2][jd] + "<br>");

                    jd++;
                }
            
            //Consultas por  parte (Gabinete)        
            query = new Query();
            res = query.gabinete(gabinete);
            int gb=0;
            while (res.next()) {
                   gb++;
                }
            aGabinete = new String [3][gb];
            res = query.gabinete(gabinete);
            int jgb=0;
            while (res.next()) {
                    
                    aGabinete[0][jgb] = res.getString("p.nombre");
                    aGabinete[1][jgb] = res.getString("tp.tipoProducto");
                    aGabinete[2][jgb] = res.getString("dp.precio");
                    out.println(aGabinete[0][jgb] + " | " + aGabinete[1][jgb] + " | " + aGabinete[2][jgb] + "<br>");

                    jgb++;
                }
            //Consultas por  parte (Ram)        
            query = new Query();
            res = query.ram(ram);
            int r=0;
            while (res.next()) {
                   r++;
                }
            aRam = new String [4][r];
            res = query.ram(ram);
            int jr=0;
            while (res.next()) {
                    
                    aRam[0][jr] = res.getString("p.nombre");
                    aRam[1][jr] = res.getString("d.capacidad");
                    aRam[2][jr] = res.getString("dp.precio");
                    aRam[3][jr] = res.getString("d.tecnologia");
                    out.println(aRam[0][jr] + " | " + aRam[1][jr] + " | " + aRam[2][jr] + "<br>");

                    jr++;
                }
            
            out.println("<table border=1>");
            out.println("<th>Mouse</th>");
            out.println("<th>Teclado</th>");
            out.println("<th>Ram</th>");
            out.println("<th>Procesador</th>");
            out.println("<th>Board</th>");
            out.println("<th>tarjeta de video</th>");
            out.println("<th>Disco duro</th>");
            out.println("<th>Pantalla</th>");
            
            out.println("<th>Fuente de poder</th>");
            out.println("<th>Gabinete</th>");
            out.println("<th>Cooler</th>");
        
            
            out.println("<tr>");

            out.println("<td> Nombre: "+aMouse [0][0]+"<br>Precio: "+aMouse [2][0] +"<br> Tipo de conexion: "+aMouse [1][0] +"<br>Descripcion: "+aMouse [3][0] +"</td>");
            out.println("<td> Nombre: "+aTeclado [0][0]+"<br>Precio: "+aTeclado [2][0] +"<br>Tipo de conexion: "+aTeclado [1][0] +"</td>");
            out.println("<td> Nombre: "+aRam [0][0]+"<br>Precio: "+aRam [2][0] +"<br>Capacidad: "+aRam [1][0] +"<br>Tecnologia: "+aRam [3][0] +"</td>");
            out.println("<td> Nombre: "+aPrecesador [0][0]+"<br>Precio: "+aPrecesador [2][0] +"<br>Velocidad: "+aPrecesador [1][0] +"<br>Tecnologia: "+aPrecesador [3][0] +
                    "</td>");
            out.println("<td> Nombre: "+aboard [0][0]+"<br>Precio: "+aboard [2][0] +"</td>");
            out.println("<td> Nombre: "+aGrafica [0][0]+"<br>Precio: "+aGrafica [2][0] +"<br>Capacidad: "+aGrafica [1][0] +"<br>Tecnologia: "+ aGrafica [3][0] +"</td>");
            out.println("<td> Nombre: "+aDiscoDuro [0][0]+"<br>Precio: "+aDiscoDuro [2][0] +"<br>Capacidad: "+aDiscoDuro [1][0] +"</td>");
            out.println("<td> Nombre: "+aPantalla [0][0]+"<br>Precio: "+aPantalla [2][0] +"</td>");
             out.println("<td> Nombre: "+aFuentePoder [0][0]+"<br>Precio: "+aFuentePoder [2][0] +"<br>Voltaje: "+aFuentePoder [3][0] +"</td>");
           out.println("<td> Nombre"+aGabinete [0][0]+"<br>Precio"+aGabinete [2][0] +"</td>");

            out.println("<td> Nombre: "+aCooler [0][0]+"<br>Precio: "+aCooler [2][0] +"</td>");
            
            out.println("</tr>");
            
            
            out.println("</table>");
           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

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