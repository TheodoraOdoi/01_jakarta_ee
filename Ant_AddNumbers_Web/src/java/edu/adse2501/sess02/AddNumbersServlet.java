package edu.adse2501.sess02;

import com.adse2501.sess02.AddNumbers;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet("/add")
public class AddNumbersServlet extends HttpServlet
{
    
    // EJB Bean variable
    @EJB
    private AddNumbers addNumbers;
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException
    {
        String firstValue = request.getParameter("txtFirstNum");
        String secondValue = request.getParameter("txtSecondNum");
        
        // Check if any of the above values is empty
        if (firstValue == null || firstValue.trim().isEmpty() ||
                secondValue == null || secondValue.trim().isEmpty() )
        {
            request.setAttribute("error", "Please enter both numbers");
            request.getRequestDispatcher("/frmaddnums.jsp").forward(request, response);
            return;
        }
        
        try
        {
          int num1 = Integer.parseInt(firstValue);
          int num2 = Integer.parseInt(secondValue);
          
          // Perform the addition
          int sum = addNumbers.addNums(num1, num2);
          
          request.setAttribute("sum", sum);
          
          request.getRequestDispatcher("/frmaddnums.jsp").forward(request, response);
        }catch(NumberFormatException nfe)
        {
            request.setAttribute("Error", "Please enter valid whole numbers e.g 2");
            request.getRequestDispatcher("/frmaddnums.jsp").forward(request, response);
        }
    } 
}
