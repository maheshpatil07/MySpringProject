<%@ page language="java" contentType="text/html"%>
<%@ include file="/index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>

<form action="addProduct" method="post" style="border:1px solid #ccc">

  <div class="signup">
    <h1>Reg-Product</h1>
    
    <hr>
    
    <label for="text"><b>Product ID</b></label>
    <input type="text" placeholder="Enter Product ID" name="productId" required>
    
    <label for="text"><b>Product Name</b></label>
    <input type="text" placeholder="Enter Product Name" name="productName" required>
	
	<label for="text"><b>Price</b></label>
    <input type="text" placeholder="Enter Price" name="price" required>
    
     <label for="text"><b>Stock</b></label>
    <input type="text" placeholder="Enter Stock" name="stock" required>
    
    <label for="text"><b>Product Description</b></label>
	<textarea name="productDesc" cols="50" rows="5"></textarea>
    
    <div class="clearfix">
    
      <button type="submit" class="signupbtn">Insert</button>
      <button type="reset" class="cancelbtn">Reset</button>
      
    </div>
  </div>
</form>




</body>
</html>