<%@ page language="java" contentType="text/html"%>

<html>
<head>
<style>

@import url("//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css");
.login-block{
    background: #DE6262; 
background: -webkit-linear-gradient(to bottom, #FFB88C, #DE6262); 
background: linear-gradient(to bottom, #FFB88C, #DE6262); 
float:left;
width:100%;
padding : 90px 0;
}
.banner-sec{background:url(https://static.pexels.com/photos/33972/pexels-photo.jpg)  no-repeat left bottom; background-size:cover; min-height:500px; border-radius: 0 10px 10px 0; padding:0;}
.container{background:#fff; border-radius: 10px; box-shadow:15px 20px 0px rgba(0,0,0,0.1);}
.carousel-inner{border-radius:0 10px 10px 0;}
.carousel-caption{text-align:left; left:5%;}
.login-sec{padding: 50px 30px; position:relative;}
.login-sec .copy-text{position:absolute; width:80%; bottom:20px; font-size:13px; text-align:center;}
.login-sec .copy-text i{color:#FEB58A;}
.login-sec .copy-text a{color:#E36262;}
.login-sec h2{margin-bottom:30px; font-weight:800; font-size:30px; color: #DE6262;}
.login-sec h2:after{content:" "; width:100px; height:5px; background:#FEB58A; display:block; margin-top:20px; border-radius:3px; margin-left:auto;margin-right:auto}
.btn-login{background: #DE6262; color:#fff; font-weight:600;}
.banner-text{width:70%; position:absolute; bottom:40px; padding-left:20px;}
.banner-text h2{color:#fff; font-weight:600;}
.banner-text h2:after{content:" "; width:100px; height:5px; background:#FFF; display:block; margin-top:20px; border-radius:3px;}
.banner-text p{color:#fff;}

/* Style the navbar */
#navbar {
	position: sticky;
    z-index: 22;
    top: 0;
    left: 0;
    width: 100%;
    height: 60px;
  	background-color: #333;
  	
}

/* Navbar links */
#navbar a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px;
  text-decoration: none;
  border-radius:3px;
}

a:hover{
background-color:red;}

* {box-sizing: border-box}
.attributes{
    display: block;
    width: 100%;
    padding: .375rem .75rem;
    font-size: 1rem;
    line-height: 1.5;
    color: #495057;
    background-color: #fff;
    background-clip: padding-box;
    border-radius: .25rem;
    transition: border-color .15s ease-in-out,box-shadow .15s ease-in-out;
    margin-bottom: 1rem;
}
.signup
{
	width : 38%;
	background : #fff;
	padding : 30px;
	margin : 8px auto ;
	margin-top : 50px;
	margin-bottom : 50px;
	box-shadow : 0 0 3px 0 rgba(0,0,0,0.3);
	background-color: #d6d6d694;
	
}
.submit{
	font-family: "Google Sans",Roboto,Arial,sans-serif;
	font-color : white;
  	font-weight: 500;
    color: #fff;
    background-color:  #6200ee;
    border : none;
    border-radius: 7px;
    padding : 8px;
    transition: all 200ms ease 0s;
    cursor : pointer;
    opacity: 0.9;
}


body 
{
	font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,
				"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji",
				"Segoe UI Emoji","Segoe UI Symbol";
	font-size: 1rem;
    font-weight: 400;
	margin : 0;
	padding : 0;
}



/* Full-width input fields */
input[type=text], input[type=password] 
{
  width: 100%;
  
  margin: 5px 0 22px 0;
  display: inline-block;
  
  background: #fff;
  border-radius : 7px;
  
  padding: .375rem .75rem;
  border: 1px solid #ced4da;
}

input[type=text]:focus, input[type=password]:focus 
{
  background-color: #fff;
  outline: none;
}

hr 
{
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

button 
{
  border: none;
  cursor: pointer;
  opacity: 0.9;
}

button:hover 
{
  opacity:1;
}

.cancelbtn
{
	background-color : #0d10108f;
	color : white;
	padding : 13px;
	margin : 7px;
	border-radius : 7px;
	width : 20%;
}

.signupbtn
{
	background-color : #6200ee;
	color : white;
	padding : 13px;
	margin : 7px;
	border-radius : 7px;
	width : 20%;
	
}



/* Add padding to container elements */
/*
.container 
{
	width : 300px;
	background : #fff;
	padding : 30px;
	margin : 8px auto ;
	box-shadow : 0 0 3px 0 rgba(0,0,0,0.3);
	margin-top : 100px;
}
*/



.signup h1
{
	color : #1c8adb;
}

/* Clear floats */
.clearfix::after 
{
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
</head>
<body>

  <div id="navbar">

		  
		  <a href="login">Home</a>
		  <a href="signup">Register</a>
		  <a href="category">Category</a>
		  <a href="product">Product</a>
		  <a href="supplier">Supplier</a>
  </div>

</body>
</html>
