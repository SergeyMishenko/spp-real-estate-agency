<%-- 
    Document   : addProperty
    Created on : 05.05.2016, 1:46:54
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
                                
       
        <form method="POST" action="AddPropertyUser" >
            <div class="main">
                 <h1>Добавить недвижимость!</h1>
                <ul>
                    <div class="field"> 
                    <li><p>тип недвижимости:</p> <input type="text" name="type"></li>
                    <li><p>площадь квартиры:</p> <input type="text" pattern="^[ 0-9]+$" name="square"></li>
                    <li><p>цена $:</p> <input type="text" pattern="^[ 0-9]+$" name="price"></li>
                    <li><p>страна:</p> <input type="text" name="country"></li>
                    <li><p>город:</p> <input type="text" name="city"></li>
                    <li><p>улица:</p> <input type="text" name="street"></li>
                    <li><p>номер дома:</p> <input type="text" pattern="^[ 0-9]+$" name="house_number"></li>
                    <li><p>корпус:</p> <input type="text" name="housing"></li>
                    <li><p>квартира:</p> <input type="text" pattern="^[ 0-9]+$" name="apartment"></li>
                    <li><input type="submit" value="добавить недвижимость"></li>
                    </div>
                 </ul> 
            </div>           
        </form>
      </div>

             <div id="menu">
            <ul class="menu-2">
                <li><a href="http://localhost:8080/WebApplication1/index.jsp">Authorization</a></li>
                <li><a href="http://localhost:8080/WebApplication1/registration.jsp">Registration</a></li>
                <li><a href="http://localhost:8080/WebApplication1/userMain.jsp">User main</a></li>
            </ul>
       </div>  
            
       <div id="footer">
         Агенство недвижимости  
       </div>    
             
    </div>
    </body>
</html>
    