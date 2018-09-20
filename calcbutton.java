/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calcbutton extends HttpServlet
{
 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int a1=Integer.parseInt(request.getParameter("display1"));
        int a2=Integer.parseInt(request.getParameter("display2"));
        String op=request.getParameter("op");
        out.println("<html><head></head><body>");
        switch(op)
        {
            case "+" :    out.println("<h1>Addition</h1>"+(a1+a2));
                        break;
            case "-" :    out.println("<h1>Subtraction</h1>"+(a1-a2));
                        break;
            case "*" :    out.println("<h1>Multiplication</h1>"+(a1*a2));
                        break;
            case "/" :    out.println("<h1>Division</h1>"+(a1/a2));
                        break;
            default:    out.println("<h1>Invalid opeartor</h1>");
        }
        out.println("</body></html>");
        }
        catch(IOException | NumberFormatException e)
        {
          //  System.out.println("<h1>Exception</h1>");
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
