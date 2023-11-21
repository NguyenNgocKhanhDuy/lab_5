package vn.edu.hcmuaf.fit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PaymentServlet", value = "/payment-servlet")
public class PaymentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String day = request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year") ;
        String cardNumber = request.getParameter("cardnumber");
        String cardCVC = request.getParameter("cardcvc");

        PrintWriter out = response.getWriter();


        if (fullName.length() <=0 ){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Fullname');");
            out.println("</script>");
        }else if (email.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Email');");
            out.println("</script>");
        }else if (password.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert Password');");
            out.println("</script>");
        }else if (day.length()<= 0 || month.length() <= 0 || year.length() <= 0){
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Incorrect Day Of Birth');");
            out.println("</script>");
        } else if (cardNumber.length() <= 0) {
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert card Number');");
            out.println("</script>");
        } else if (cardCVC.length() <= 0) {
            out.println("<script type = 'text/javascript'>");
            out.println("alert('Insert card cvc');");
            out.println("</script>");
        } else {
            int dayValue = Integer.valueOf(day);
            int monthValue = Integer.valueOf(month);
            int yearValue = Integer.valueOf(year);
            int cardNumberValue = Integer.valueOf(cardNumber);
            int cardCVCValue = Integer.valueOf(cardCVC);

            if (cardNumberValue <= 0) {
                out.println("<script type = 'text/javascript'>");
                out.println("alert('Incorrect card Number');");
                out.println("</script>");
            }
            if (cardCVCValue <= 0) {
                out.println("<script type = 'text/javascript'>");
                out.println("alert('Incorrect card cvc');");
                out.println("</script>");
            }


            if (yearValue >= 0){
                if (monthValue >= 0) {
                    int maxDay = 0;
                    switch (monthValue) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            maxDay = 31;
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            maxDay = 30;
                            break;
                        case 2:{
                            if(yearValue % 400 == 0 || (yearValue % 4 == 0 && yearValue % 4 != 0)){
                                maxDay = 29;
                            }else {
                                maxDay = 28;
                            }
                            break;
                        }
                    }
                    if (!(dayValue >= 0 && dayValue <= maxDay)) {
                        out.println("<script type = 'text/javascript'>");
                        out.println("alert('Incorrect day');");
                        out.println("</script>");
                    }else {
                        out.println("<script type = 'text/javascript'>");
                        out.println("alert('Success');");
                        out.println("</script>");
                    }
                }else {
                    out.println("<script type = 'text/javascript'>");
                    out.println("alert('Incorrect month');");
                    out.println("</script>");
                }
            }else {
                out.println("<script type = 'text/javascript'>");
                out.println("alert('Incorrect year');");
                out.println("</script>");
            }
        }

        request.getRequestDispatcher("/payment/index.jsp").include(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}