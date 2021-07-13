<%@ page language="java" contentType="text/html"%>
<%@ include file="/index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supplier</title>
</head>
<body>
<form action="addSupplier" method="post" style="border:1px solid #ccc">

  <div class="signup">
    <h1>Supplier-Details</h1>
    
    <hr>
    
    <label for="text"><b>Supplier ID</b></label>
    <input type="text" placeholder="Enter Supplier ID" name="supplierId" required>
    
    <label for="text"><b>Supplier Name</b></label>
    <input type="text" placeholder="Enter Supplier Name" name="supplierName" required>
    
	
	<label for="text"><b>Supplier Address</b></label>
	<br>
	<textarea name="supplierAddr" cols="50" rows="5"></textarea>
	
	
    <div class="clearfix">
    
      <button type="submit" class="signupbtn">Insert</button>
      <button type="reset" class="cancelbtn">Reset</button>
      
    </div>
  </div>
</form>
</body>
</html>