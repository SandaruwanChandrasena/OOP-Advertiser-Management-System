<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
    
        <!-- Use this jstl tag to connect java classes and jsp -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
    
<c:if test="${not isAdvertiserLoggedIn}">    
    
<!DOCTYPE html> <!--page 1 -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="AdvertiserLogin.css" />
    <title>Login Page</title>
  </head>
  <body>
    <div class="sign-in-form">
      <img src="AdvertiserLoginBack.png" alt="" />
      <h1>Sign in</h1>


      <form action="AdvertiserLog" method="post">
        <input type="text" name="uid" class="input-box" placeholder="User Name" required />
        <input type="password" name ="pass" class="input-box" placeholder="Password" required/>
        <p>
          <span><input type="checkbox" /></span>I agree to the term of services
        </p>

        
        <input type="submit" value="Sign in" class="signin-btn" id="button"  name="submit"/>

        <p>Do you have an account ? <a href="AdvertiserInsert.jsp">Sign up</a></p>
      </form>
      
    </div>
  </body>
</html>


</c:if>

<c:if test="${isAdvertiserLoggedIn}" >

<c:redirect url="AdvertiserAccount.jsp"/>

</c:if>

