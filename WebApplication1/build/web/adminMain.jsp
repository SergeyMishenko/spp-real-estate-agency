<%-- 
    Document   : worker
    Created on : 22.04.2016, 21:26:22
    Author     : Сергей
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/styleAdmin.css">     
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
		

        <h2>Показать данные</h2>
        
        
        <form action="ShowTable" >
             выберите название таблицы: 
             <select name="nameTable">
                <option selected value="users">Пользователи</option>
                <option value="adress">Адреса</option>
                <option value="property">Недвижимость</option>
                <input  type="submit" value="Отправить">    
            </select>
        </form>
        
       
        
        <a href="adminMain.jsp"></a>
        <form method="POST" action="addAdress" >
            <div class="main">
                <h2>Добавление адреса!</h2>
            <ul>
                <div class="field"> 
                <li><p>страна проживания:</p>  <input type="text" name="country"></li>
                <li><p>город проживания:</p> <input type="text" name="city"></li>
                <li><p>улица: </p> <input  type="text" name="street"></li>
                <li><p>номер дома:</p> <input type="text" pattern="^[ 0-9]+$" name="house_number"></li>
                <li><p>корпус: </p> <input type="text" name="housing"></li>
                <li><p>квартира:</p> <input type="text" pattern="^[ 0-9]+$" name="apartment"></li>
                <li><input type="submit" value="добавить адрес"></li>
                </div>
            </ul> 
            </div>         
         </form>
        
        
        
        <form method="POST" action="RegistrationAdmin" >
            <div class="main">
                <h2>Добавление пользователя!</h2>
                <ul>
                    <div class="field"> 
                        <li><p>логин:</p> <input type="text" name="login"></li>
                        <li><p>пароль:</p> <input type="password" name="password"></li>
                        <li><p>имя:</p> <input type="text" name="name"></li>
                        <li><p>фамилия:</p> <input type="text" name="surname"></li>
                        <li><p>отчество:</p> <input type="text" name="middle_name"></li>
                        <li><p>телефон:</p> <input type="text" pattern="^[ 0-9]+$" name="phone"></li>
                        <li><p>почта:</p> <input type="text" name="email"></li>
                        <li><p>страна проживания:</p> <input type="text" name="country"></li>
                        <li><p>город проживания:</p> <input type="text" name="city"></li>
                        <li><p>улица:</p> <input type="text" name="street"></li>
                        <li><p>номер дома:</p> <input type="text" pattern="^[ 0-9]+$" name="house_number"></li>
                        <li><p>корпус:</p> <input type="text" name="housing"></li>
                        <li><p>квартира:</p> <input type="text" pattern="^[ 0-9]+$" name="apartment"></li>
                        <li><input type="submit" value="зарегистрироватся"></li>
                     </div>
                </ul> 
            </div>           
         </form>
        
         
        <form method="POST" action="AddPropertyServlet" >
            <div class="main">
                <h2>Добавить недвижимость!</h2>
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
               
         
        <form method="POST" action="DeleteUser" >
            <div class="main">
                <h2>Удалить пользователя!</h2>
                <ul>
                    <div class="field"> 
                        <li><p>login:</p> <input type="text" name="login"></li>
                        <li><input type="submit" value="удалить"></li>
                     </div>
                </ul> 
            </div>             
        </form>
         
          
        <form method="POST" action="DeleteAdress" >
            <div class="main">
                <h2>Удалить адрес!</h2>
                <ul>
                    <div class="field"> 
                        <li><p>id адрес:</p> <input type="text" name="id_adress"></li>
                        <li><input type="submit" pattern="^[ 0-9]+$" value="удалить"></li>
                    </div>
                </ul> 
            </div>             
        </form>
          
         
        <form method="POST" action="DeleteProprty" >
            <div class="main">
                 <h2>Удалить недвижимость!</h2>
                 <ul>
                   <div class="field"> 
                     <li><p>id недвижимости:</p> <input type="text" name="id_property"></li>
                     <li><input type="submit" pattern="^[ 0-9]+$" value="удалить"></li>
                   </div>
                </ul> 
            </div>         
        </form>
          
          
        <form method="POST" action="EditAdress" >
            <div class="main">
                 <h2>Редактирование адреса!</h2>
                 <ul>
                     <div class="field"> 
                        <li><p>id редактируемого адреса:</p> <input  type="text" name="id_adress"></li>
                        <li><p>страна проживания:</p> <input type="text" name="country"></li>
                        <li><p>город проживания:</p> <input type="text" name="city"></li>
                        <li><p>улица:</p> <input type="text" name="street"></li>
                        <li><p>номер дома:</p> <input type="text" pattern="^[ 0-9]+$" name="house_number"></li>
                        <li><p>корпус:</p> <input type="text" name="housing"></li>
                        <li><p>квартира:</p> <input type="text" pattern="^[ 0-9]+$" name="apartment"></li>
                        <li><input type="submit" value="редактировать адрес"></li>
                    </div>
                </ul> 
            </div>          
         </form>
        
        
        <form method="POST" action="EditUser" >
           <div class="main">
                <h2>Редактирование пользователя!</h2>
                <ul>
                    <div class="field"> 
                        <li><p>id пользователя:</p> <input type="text" name="id_user"></li>
                        <li><p>роль:</p> <input type="text" name="role"></li>
                        <li><p>логин:</p> <input type="text" name="login"></li>
                        <li><p>пароль:</p> <input type="password" name="password"></li>
                        <li><p>имя:</p> <input type="text" name="name"></li>
                        <li><p>фамилия:</p> <input type="text" name="surname"></li>
                        <li><p>отчество:</p> <input type="text" name="middle_name"></li>
                        <li><p>телефон:</p> <input type="text" pattern="^[ 0-9]+$" name="phone"></li>
                        <li><p>почта:</p> <input type="text" name="email"></li>
                        <li><p>id адреса:</p> <input  type="text" name="id_adress"></li>
                        <li><input type="submit" value="редактировать"></li>
                     </div>
                </ul> 
            </div>                   
         </form>
        
        
        <form method="POST" action="EditProperty" >
            <div class="main">
                <h2>Редактировать недвижимость!</h2>
                <ul>
                    <div class="field"> 
                        <li><p>id недвижимости:</p> <input type="text" name="id_property"></li>
                        <li><p>тип недвижимости:</p> <input type="text" name="type"></li>
                        <li><p>площадь квартиры:</p> <input type="text" pattern="^[ 0-9]+$" name="square"></li>
                        <li><p>цена $:</p> <input type="text" pattern="^[ 0-9]+$" name="price"></li>
                        <li><p>id недвижимости:</p> <input type="text" name="id_adress"></li>
                        <li><p>id продовца:</p> <input type="text" name="id_seller"></li>
                        <li><p>id адреса:</p> <input  type="text" name="id_adres"></li>
                        <li><input type="submit" value="редактировать"></li>
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
