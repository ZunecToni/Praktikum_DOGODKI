<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


TEST
    
    <div>
      <table border="1">
        <tr>
          <th>naziv</th>
          <th>opis</th>
        </tr>
        <c:forEach  items="${dogodek}" var ="dogodek">
        <tr>
          <td>${dogodek.naziv}</td>
          <td>${dogodek.opis}</td>
          <td>${dogodek.lokacija}</td>
          <td>${dogodek.zacetek}</td>
          <td>${dogodek.trajanje}</td>
          <td>${dogodek.konecPrijav}</td>
          <td>${dogodek.konecOdjav}</td>
          <td>${dogodek.minOseb}</td>
          <td>${dogodek.maxOseb}</td>
          <td>${dogodek.status}</td>
          <td>${dogodek.potrebnoPovabilo}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
</body>
</html>