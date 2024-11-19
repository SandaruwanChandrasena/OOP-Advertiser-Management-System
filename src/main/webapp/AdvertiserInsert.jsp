<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="AdvertiserInsert.css" />
    <title>Sign up Page</title>
</head>
<body>
	<div class="sign-in-form">
      <img src="AdvertiserInsertP.png" alt="" />
      <h1>Sign up</h1>

      <form action="Insert" method="post"> 

        <input type="text" name="name" class="input-box" placeholder="Name" required />
        <input type="email" name="email" class="input-box" placeholder="Email" required />
        <input type="text" name="phone" class="input-box" placeholder="Phone Number" required />
        <input type="text" name="uid" class="input-box" placeholder="User Name" required />
        <input type="password" name="psw" class="input-box" placeholder="Password" />
        

        <!-- <button type="button" class="signup-btn">Sign up</button> -->
        <input type="submit" name="submit" value="Sign up" class="signin-btn" id="button" />

        <p>Do you have an account ? <a href="AdvertiserLogin.jsp">Sign in</a></p>

      </form>
    </div>
	
</body>
</html>