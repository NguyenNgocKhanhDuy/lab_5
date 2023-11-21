<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/contact/css/style.css">
    <title>Contact Form</title>
</head>
<body>
    <div id="container">
        <div id="contact_form">
            <div class="title">
                <p>Contact Us</p>
            </div>

            <form action="contact-servlet" class="form_input" method="get">
                <div class="holder">
                    <label>FULL NAME * </label>
                    <input type="text" id="name" placeholder="Enter Your Name" name="fullname">
                </div>
                <div class="second_input">
                    <div class="holder">
                        <label>EMAIL *</label>
                        <input type="email" id="email" placeholder="Enter Your Email" name="email">
                    </div>
                    <div class="holder">
                        <label>PHONE</label>
                        <input type="tele" id="phone" placeholder="Enter Number Phone" name="phone">
                    </div>
                </div>
                <div class="holder">
                    <label>NEEDED SERVICES *</label>
                    <div class="combobox">
                        <select name = "Choose">
                            <option>Please chooses</option>
                        </select>
                    </div>
                </div>
                <div class="holder message">
                    <label>MESSAGE</label>
                    <textarea id="message" placeholder="Your message here..."></textarea>
                </div>
                <div class="submit-btn">
                    <input type="submit" value="Submit" id="submit">
                </div>
            </form>
        </div>
    </div>
</body>
</html>