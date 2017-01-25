<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the ice cream page</title>
</head>
<h1>Sample AJAX</h1>
<body>

<div id="demo">
<h1>The XMLHttpRequest Object</h1>
<button type="button" onclick="loadDoc()">Change Content</button>
</div>


<script>
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	
      xmlDoc = xhttp.responseXML;
      txt = "";
      
      x = xmlDoc.getElementsByTagName("flavors");
      for (i = 0; i < x.length; i++) {
          txt += x[i].childNodes[0].nodeValue + "<br>";
      }
      
    	
      document.getElementById("demo").innerHTML = txt;
    }
  };
  xhttp.open("GET", "icecreamflavors", true);
  xhttp.send();
}
</script>




</body>
</html>