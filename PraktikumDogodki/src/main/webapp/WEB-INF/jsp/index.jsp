<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Dobrodošli v dogodkih.</h1>

<div >
<form action="addDogodek">
<label for="naziv">Naziv:</label>
<input id="naziv" type="text" name="naziv" placeholder="Vpisite naziv dogodka."><br>

<label for="lokacija">Lokacija:</label>
<input id="lokacija" type="text" name="lokacija" placeholder="Vpisite lokacijo dogodka."><br>

<label for="zacetek">Zacetek:</label>
<input id="zacetek" type="date" name="zacetek">
<input id="zacetekCas" type="time" name="zacetek"><br>

<label for="konec">Konec:</label>
<input id="konec" type="date" name="trajanje">
<input id="konecCas" type="time" name="trajanje"><br>

<label for="opis">Opis:</label><br>
<textarea rows="4" cols="25" id="opis" type="text" name="opis" placeholder="opisite dogodek.">
</textarea><br>

<!-- <input type='file' id="inputFile" />
<br> -->

<label for="minOseb">Minimalno oseb:</label>
<input id="minOseb" type="number" name="minOseb" placeholder="Vpisite naziv dogodka."><br>

<label for="maxOseb">Maksimalno oseb:</label>
<input id="maxOseb" type="number" name="maxOseb" placeholder="Vpisite naziv dogodka."><br>

<label for="povabilo">Povabilo?
<input id="povabilo" type="checkbox" name="potrebnoPovabilo" ></label><br>





<button id="gumb2" type="submit" value="OK">OK</button>
</form>
</div>
  

 
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


<script>
/*
$(document).ready(function(){

	$('html').css({ 'font-weight': 'bold', 'background-color': 'lightblue'});
	$('#opis').click(function(){
	var zacetek=$('#zacetek').val();
	var konec=$('#konec').val();
	console.log(Date.parse(zacetek));
	
	if((Date.parse(zacetek) > Date.parse(konec))){
    alert("Please select a different End Date.");
}
});
	
	
	
	$("#gumb2").click(function(){
	var slika=$('#inputFile').val();
	var event =
		'Dogodek : '+$('#naziv').val()+'<br>'+
		'Lokacija: '+$('#lokacija').val()+'<br>'+
		'Zacetek: '+$('#zacetek').val()+', '+$('#zacetekCas').val()	+'<br>'+
		'Konec: '+$('#konec').val()+', '+$('#konecCas').val()+'<br>'+
		'Opos: '+$('#opis').val()	+'<br>'+
		'Minimal oseb: '+$('#minOseb').val()+'<br>'+
		'Maximal oseb: '+$('#maxOseb').val();
		
	$('#drugo').hide();		
	$( "#tretje" ).fadeIn( "slow", function() {
	$('p#izpis').html(event);
	//$("#image_upload_preview").css({'height': '100px','width': '100px','background-color': 'powderblue'});
	$('img.slika').mouseover(function(){
		$('#txtSlika').text(slika
	
	);
	$('img.slika').mouseout(function(){
		$('#txtSlika').text(""
	
	);
	$('div#tretje').css({});
	
	
	
  });
    });
	});
	});});
	
	
	
	
   /*function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#image_upload_preview').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }

    $("#inputFile").change(function () {
        readURL(this);
    });*/
	



</script>
</body>
</html>