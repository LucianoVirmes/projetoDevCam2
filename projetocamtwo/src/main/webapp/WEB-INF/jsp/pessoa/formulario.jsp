<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<title>Cadastro de Pessoas</title>
</head>
<body>
	<div id="erros">
  <ul>
    <c:forEach items="${errors}" var="error">
      <li>${error.category } - ${error.message }</li>
    </c:forEach>
  </ul>
</div>
	<form action="adicionapessoa" method="post">
   <fieldset>
     <legend>Adicionar Pessoa</legend>
     
     <label for="nome">Nome:</label>
     <input id="nome" type="text" name="pessoa.nome"/>
     
     <label for="dataAdmissao">Data Admissao:</label>
     <input id="dataAdmissao" type="date" name="pessoa.dataAdmissao"/>
     
     <label for="dataNascimento">Data Nascimento:</label>
     <input id="dataNascimento" type="date" name="pessoa.dataNascimento"/>
     
     <button type="submit">Enviar</button>
   </fieldset>
   
  <input class="voltar" type="button" value="Voltar" onclick="window.location.href='../'" />
 </form>
</body>
</html>
