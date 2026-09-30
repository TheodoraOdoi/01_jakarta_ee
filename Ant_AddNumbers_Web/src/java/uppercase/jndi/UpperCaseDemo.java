package uppercase.jndi;

import demo.jndi.UpperCase;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author user
 */
@WebServlet("/UpperCaseDemo")
public class UpperCaseDemo extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    public UpperCaseDemo() {super();}
    
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter())
        {
            InitialContext context = new InitialContext();
            UpperCase remoteBn = (UpperCase) context.lookup(
                    "java:global/Ant_AddNumbers_Web/UpperCase!demo.jndi.UpperCase");
            StringBuffer str = remoteBn.sayHello();
//            response.setContentType(LEGACY_DO_HEAD);
            out.print(str);
        }catch (NamingException ne)
        {
            System.err.println(ne.getLocalizedMessage());
        } 
    }

    

}
