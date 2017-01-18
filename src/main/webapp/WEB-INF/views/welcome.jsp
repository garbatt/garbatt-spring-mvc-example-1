<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <script src="myjscript.js"></script>
        <link rel="stylesheet" type="text/css" href="mystyle.css" />
    </head>
    <body>
        <h1>Welcome to the World!</h1>
        <p>This is the welcome page wish I could say more!</p>
        
        <h1>Sample JavaScript</h1>

		<button type="button"
		onclick="document.getElementById('demo1').innerHTML = Date()">
		Click me to display Date and Time.</button>

        <p id="demo1"></p>
        
        
        <button type="button" onclick="myFunction()">Try it, script in file</button>
        
        <p id="demo"></p>
        
<!--         <img src=ducky.gif alt="Ducky image"/> -->
        
    </body>
</html>
