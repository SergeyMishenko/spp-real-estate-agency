<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div id="container">

            <div id="header">
        
         <form method="POST" action="AuthorizationServlet" >
            login: <input type="text"  pattern="[A-Za-z0-9]{3,}" name="login">
            password: <input type="password" pattern="[A-Za-z0-9]{1,}" name="password">
            <input type="submit" value="отправить">
         </form>
        
        
        <p><a href="http://localhost:8080/WebApplication1/registration.jsp">зарегистрироваться</a></p> 
        
            </div>

    </div>
        
    </body>
</html>
