
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/payment/css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>Payment Form</title>
</head>
<body>
    <div id="container">
        <form action="payment-servlet" id="form">
            <div class="account">
                <p class="title">Account</p>
                    <div class="holder">
                        <label><i class="fa-solid fa-user"></i></label>
                        <input type="text" placeholder="Full Name" name="fullname">
                    </div>

                    <div class="holder">
                        <label><i class="fa-solid fa-envelope"></i></label>
                        <input type="email" placeholder="Email Address" name="email">
                    </div>

                    <div class="holder">
                        <label><i class="fa-solid fa-key fa-rotate-270"></i></label>
                        <input type="password" placeholder="Password" name="password">
                    </div>
            </div>

            <div class="dob-gender">
                <div class="dob">
                    <p class="title">Date of Birth</p>
<!--                    <input type="date" name="" id="dob">-->
                    <div class="dob-input">
                        <input type="number" placeholder="DD" name="day">
                        <input type="number" placeholder="MM" name="month">
                        <input type="number" placeholder="YYYY" name="year">
                    </div>
                </div>
                <div class="gender">
                    <p class="title">Gender</p>
                    <div class="gender-select">
                        <div class="gender-item">
                            <input type="radio" name="gender" id="male">
                            <p>Male</p>
                        </div>

                        <div class="gender-item">
                            <input type="radio" name="gender" id="female">
                            <p>Female</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="payment">
                <p class="title">Payment Details</p>
                <div class="payment-select">
                    <div class="payment-type">
                        <input type="radio" name="payment" id="credit">
                        <i class="fa-brands fa-cc-visa"></i>
                        <p>Credit Card</p>
                    </div>
                    <div class="payment-type">
                        <input type="radio" name="payment" id="paypal">
                        <i class="fa-brands fa-cc-paypal"></i>
                        <p>Paypal</p>
                    </div>
                </div>
                <div class="card-info">
                    <div class="holder">
                        <label><i class="fa-regular fa-credit-card"></i></label>
                        <input type="number" name="cardnumber" id="card-numer" placeholder="Card Number">
                    </div>

                    <div class="cvc-date">
                        <div class="holder cvc-date-item">
                            <label><i class="fa-solid fa-user"></i></label>
                            <input type="number" name="cardcvc" id="card-cvc" placeholder="Card CVC">
                        </div>

                        <div class="holder cvc-date-item">
                            <select>
                                <option>01 Jan</option>
                            </select>
                            <select class="year">
                                <option>2015</option>
                            </select>
                        </div>
                    </div>

                </div>
            </div>

            <div class="terms">
                <p class="title">Terms and Conditions</p>
                <div class="term-check">
                    <input type="checkbox" name="" id="">
                    <label></label>
                    <p class="sub_text">I accept the terms and conditions for signing up to this service, and hereby confirm I have read the privacy policy</p>
                </div>
            </div>
            <input type="submit" value="" style="display: none">
        </form>
    </div>

</body>
</html>