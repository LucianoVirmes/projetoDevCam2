<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Sorteio</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
	<h1 class="tituloSorteio">Quem fará o café?</h1>
	<div id="divTextoSorteio">
			
	</div>
	<div class= "sorteioGeral">
	
		<a href="#" onclick="javascript: sortear();"><button class="btnsorteio">Sortear</button></a><br>
		<a href="/vraptor03/" ><button>Voltar</button></a>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../js/sorteia.js" charset="utf-8"></script>
	
</body>

</html>