package vn.edu.hcmuaf.fit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ContactServlet", value = "/contact-servlet")
public class ContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String fullName = (String) request.getParameter("fullname");
        String email = (String) request.getParameter("email");
        String phone = (String) request.getParameter("phone");

        if (fullName.length() <=0 ){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Fullname');");
            out.println("</script>");
        }else if (email.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Email');");
            out.println("</script>");
        }else if (phone.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Phone');");
            out.println("</script>");
        }else {
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Success');");
            out.println("</script>");
        }

        request.getRequestDispatcher("/contact/index.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}