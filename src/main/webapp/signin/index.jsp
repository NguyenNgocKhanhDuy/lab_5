
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/signin/css/style.css">
    <title>Sign In Form</title>
</head>
<body>
    <div id="container">
        <div id="sign-in">
            <div class="title">
                <p>Sign In</p>
            </div>

            <form action="signin-servlet">
                <input type="text" name="username" id="username" placeholder="username or email">
                <input type="password" name="password" id="passsword" placeholder=" password">

                <button type="submit" class="sign-in-btn">SIGN IN</button>
            </form>

            <div class="social-login">
                <div class="text">
                    <p>Or login with</p>
                </div>
                <div class="social-icon">
                    <img src="images/facebook.png" alt="">
                    <img src="images/google.png" alt="">
                </div>
            </div>

            <div class="sign-up">
                <p>Sign Up</p>
            </div>
        </div>
    </div>
</body>
</html>