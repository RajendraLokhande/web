<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h3>Save Product Data</h3>
        
       <form:form action="product" modelAttribute="product" method="POST">
       <table>

       <tr>
            <td> product ID</td>
            <td><form:input path="productId" /></td>
       </tr>
       <tr>
            <td> product Name</td>
            <td><form:input path="productName" /></td>
        </tr>
        
        <tr>  
               <td> product Price</td>
               <td><form:input path="productPrice" /></td>
        </tr>
       
       <tr>
            <td><input type= "submit" value="Submit" /></td>
       </tr>
       </table>
     </form:form>  
       
       
</body>
</html>