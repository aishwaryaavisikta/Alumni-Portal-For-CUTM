<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.alumni.changepassword.ChangePassword" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CHANGE PASSWORD</title>
<meta name="description" content="">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="Js/Changepassword.js"></script>
<style>
#inner-page {
margin:0px;
}
#detail {
margin-left:300px;
margin-right:200px;
}
.footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  /* Set the fixed height of the footer here */
  height: 50px;
  background-color: #222;
}
.footer > .container {
  padding-right: 15px;
  padding-left: 15px;
}
body{
font-family:Verdana;
font-size:14px;
}
</style>
</header>
<body>
<header id="header">
  <nav class="navbar navbar-inverse" role="banner">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <div id="topbar">
<h2 id="sitename"><font color="white">ALUMNI PORTAL FOR CUTM</font></h2>
</div>
</div>
      <div class="collapse navbar-collapse navbar-right">
	  <div id="topbarnav"> 
        <ul class="nav navbar-nav pull-right">
          
          <li><a href="Home.jsp">Home</a></li>
          <li><a href="readprofile.jsp">Profile</a></li>
          <li class="active"><a href="ChangePassword.jsp">Change Password</a></li>
          <li><a href="contact.jsp">Alumni List</a></li>
		  <li><a href="Login.jsp">Logout</a></li>
        </ul>
	  </div>
	  </div>
    </div>
  </nav>
</header>
<div id="inner-page">
  <div class="jumbotron">
     <div><h2 align="center"><font face="verdana" color="3300CC">CHANGE PASSWORD</font></h2></div>
		<form name="Changepassword" id="Changepassword" method="post" action="ChangePassword" onsubmit="return changepassvalidate()">
<center>
<div id="detail">
<table class="table">
<tr>
<td><label><b>Current Password:</b></label></td>
<td><input type="password" name="password" id="password" value="" maxlength="16"></td></tr>
<tr><td><label><b>New Password:</b></label></td>
<td><input type="password" name="password1" id="password1" value="" maxlength="16"></td></tr>
<tr><td><label><b>Retype Password:</b></label></td>
<td><input type="password" name="password2" id="password2" value="" maxlength="16"></td></tr>
<tr><td align="right"><input type="submit" value="CONFIRM"  size="30"></td>
</tr>
</table>
</div>
</center>
</form>
  </div>
  </div>
<footer class="footer">
      <div class="container">
        <p><font color="white"><center>Designed By &copy; 2015 A Different View</center></font></p>
      </div>
    </footer>
<script type="text/javascript" src="js/jquery.js"></script> 
<script type="text/javascript" src="js/bootstrap.min.js"></script> 

</body>
</html>