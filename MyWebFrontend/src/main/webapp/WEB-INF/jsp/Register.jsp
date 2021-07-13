<%@ page language="java" contentType="text/html"%>
<%@ include file="/index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<form action="register" method="post" style="border:1px solid #ccc">

  <div class="signup">
    <h1>Sign-Up</h1>
    
    <hr>
    
    <label for="text"><b>Customer Name</b></label>
    <input type="text" placeholder="Enter Customer Name" name="custName" required>
    
    <label for="text"><b>Email ID</b></label>
    <input type="text" placeholder="Enter Email" name="username" required>

	<label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passwd" required>
    
    <label for="gender"><b>Gender</b></label>
	<input type="radio" name="gender" value="M">Male
	<input type="radio" name="gender" value="F">Female
    <br> <br>
    <label for="mobileNo"><b>Mobile No</b></label>
    <input type="text" placeholder="Enter Mobile Number" name="mobileNo" required>
    
    <div class="clearfix">
    
    	<button type="submit" class="signupbtn">Sign Up</button>
      <button type="reset" class="cancelbtn">Reset</button>
      
    </div>
  </div>
</form>


</body>
</html>