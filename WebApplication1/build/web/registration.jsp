<%-- 
    Document   : registration
    Created on : 04.05.2016, 12:26:00
    Author     : Сергей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link rel="stylesheet" href="css/styleRegistration.css">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css"> 
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script> 

                
    </head>
    <body>
        
         <div id="container">

             
            <div id="header">
                real estate agency  
            </div>   
            
             <div id="content">
                 

        <form method="POST" action="registration" >
            <div class="main">
                <h1>Добавление пользователя!</h1>
            <ul>
                <div class="field"> 
                <li><p>логин:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="login"></li>
                <li><p>пароль:</p> <input type="password" pattern="[A-Za-z0-9]{1,}" name="password"></li>
                <li><p>имя:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="name"></li>
                <li><p>фамилия:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="surname"></li>
                <li><p>отчество:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="middle_name"></li>
                <li><p>телефон:</p> <input type="text" pattern="^[ 0-9]+$" name="phone"></li>
                <li><p>email:</p> <input type="text" name="email"></li>
                <li><p>странна проживания:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="country"></li>
                <li><p>город проживания:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="city"></li>
                <li><p>улица:</p> <input type="text" pattern="[A-Za-z0-9]{1,}" name="street"></li>
                <li><p>номер дома:</p> <input type="text" pattern="^[ 0-9]+$" name="house_number"></li>
                <li><p>корпус:</p> <input type="text"  name="housing"></li>
                <li><p>квартира:</p> <input type="text" pattern="^[ 0-9]+$" name="apartment"></li>
                <li><input type="submit" value="зарегистрироватся"></li>
            </div>
            </ul> 
            </div>           
         </form>
        </div>
             
        <div id="menu">
            <ul class="menu-2">
                <li><a href="http://localhost:8080/WebApplication1/index.jsp">Authorization</a></li>
                <li><a href="http://localhost:8080/WebApplication1/registration.jsp">Registration</a></li>
            </ul>
       </div> 
            
       <div id="footer">
         Агенство недвижимости  
       </div>        
    </div>
    </body>
</html>
