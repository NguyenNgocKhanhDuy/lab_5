package vn.edu.hcmuaf.fit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignInServlet", value = "/signin-servlet")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");

        if (username.length() <=0 ){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert username');");
            out.println("</script>");
        }else if (password.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert password');");
            out.println("</script>");
        }else {
            if (username.equals("admin") && password.equals("123")) {
                out.println("<script type = 'text/javascript'>");
                out.println("alert('Success');");
                out.println("</script>");
            }else {
                out.println("<script type = 'text/javascript'>");
                out.println("alert('Incorrect username or password');");
                out.println("</script>");
            }
        }

        request.getRequestDispatcher("/signin/index.jsp").include(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}