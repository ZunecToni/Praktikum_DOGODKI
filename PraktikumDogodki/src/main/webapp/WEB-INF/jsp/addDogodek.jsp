<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %> <!-- problemi s šumniki -->
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" /> <!--compiled and minified CSS -->
    <link rel="script" href="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js" />     <!-- jQuery library -->
    <link href="css/main.css" rel="stylesheet" />
</head>
<body>


<div class="container">
    <form method="post" action="/Dodajdogodek">	
        Ime Dogodka: <input type="text" name="naziv" /> <br />
        Datum začetka: <input type="date" name="zacetek" /> <br />
       	Trajanje dogodka: <input type="date" name="trajanje" /> <br />
        Ulica: <input type="text" name="ulica" /> <br />
        Hišna številka: <input type="text" name="hisnast" /> <br />
        Kraj pošte: <input type="text" name="posta" /> <br />
        Poštna številka: <input type="text" name="postast" /> <br />
        Min oseb <input type="text" name="minoseb" /> <br />
        Max oseb <input type="text" name="maxoseb" /> <br />
        Datum zadnje prijave: <input type="date" name="konecPrijav" /> <br />
        Datum zadnje odjave: <input type="date" name="konecOdjav" /> <br />
        Opis Dogodka
		<textarea rows="50" cols="60" name="opis" form="usrform">
		</textarea>
		Samo na povabilo? 
		<input type="radio" name="potrebnoPovabilo" value="DA">v
		<input type="radio" name="potrebnoPovabilo" value="NE" checked>v
        
        <input type="submit" value="OK" />
	 </form>
</div>
</body>
</html>
 