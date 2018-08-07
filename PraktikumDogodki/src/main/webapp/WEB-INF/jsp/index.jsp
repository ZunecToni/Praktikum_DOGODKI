<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Dobrodošli v dogodkih.</h1>

 
    <div>
      <table border="1">
        <tr>
          <th>ime</th>
          <th>priimek</th>
          <th>email</th>
        </tr>
        <c:forEach  items="${organizator}" var ="dogodek">
        <tr>
          <td>${organizator.ime}</td>
          <td>${organizator.priimek}</td>
                    <td>${organizator.email}</td>
          
        </tr>
        </c:forEach>
      </table>
    </div>


<a href="listDogodek"> Tu imate listo dogodkov.</a>
</body>
</html>