<%@ page language="java" contentType="text/html"%>
<%@ include file="/index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
</head>
<body>

<form action="addCategory" method="post" style="border:1px solid #ccc">

  <div class="signup">
    <h1>Insert-Category</h1>
    
    <hr>
    
    <label for="text"><b>Category ID</b></label>
    <input type="text" placeholder="Enter Category ID" name="catId" required>
    
    <label for="text"><b>Category Name</b></label>
    <input type="text" placeholder="Enter Category Name"  name="catName" required>
    
	
	<label for="text"><b>Category Description</b></label>
	<textarea name="catDesc" cols="50" rows="5"></textarea>
	
	
    <div class="clearfix">
    
      <button type="submit" class="signupbtn">Insert</button>
      <button type="reset" class="cancelbtn">Reset</button>
      
    </div>
  </div>
</form>
</body>
</html>