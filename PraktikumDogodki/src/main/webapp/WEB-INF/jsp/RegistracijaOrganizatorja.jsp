<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">

    <div class="row">
        <div class="col-sm-6">
            <h2>Register Organizator</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-8">
            <form class="form-horizontal">
               
                <div class="form-group">
                    <label class="col-sm-2 control-label">Ime:</label>
                    <div class="col-sm-10">
                        <p class="form-control-static" th:text="${registracijaorganizator.ime}">Ime</p>
                    </div>
                </div>
               <div class="form-group">
                    <label class="col-sm-2 control-label">Priimek:</label>
                    <div class="col-sm-10">
                        <p class="form-control-static" th:text="${registracijaorganizator.priimek}">Priimek</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-10">
                        <p class="form-control-static" th:text="${registracijaorganizator.email}">Email</p>
                    </div>
                </div>  
                
            </form>
        </div>
    </div>
</div>

</body>
</html>