<%-- 
    Document   : newjsp
    Created on : 04.05.2016, 10:50:41
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
        
        <form action="PropertyOutput" >
            <input type="submit" value="показать недвижимость">
         </form>   
        
        <p><a href="http://localhost:8080/WebApplication1/addProperty.jsp">добавить обект недвижимости</a></p> 
    
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
