<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>

<link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
<title>Editar</title>
</head>
<meta charset="ISO-8859-1">
<body>
	<div id="erros">
  <ul>
    <c:forEach items="${errors}" var="error">
      <li>${error.category } - ${error.message }</li>
    </c:forEach>
  </ul>
</div>

<form action="<c:url value="/pessoa/lista/alteracao/${pessoa.id }"/>" method="post">
  <fieldset>
    <legend>Editar Pessoa</legend>
    
   
    <p id="nome">Nome: ${pessoa.nome }
   	<p id="dataAdmissao">Data de Admissão: <fmt:formatDate value="${pessoa.dataAdmissao}" type="both" pattern="dd/MM/yyyy"/>
    <p id="dataNascimento">Data de Nascimento: <fmt:formatDate value="${pessoa.dataNascimento}" type="both" pattern="dd/MM/yyyy"/>
   </fieldset>
   <hr>
   <fieldset>
    <legend>Alterar Pessoa</legend>
    <input type="hidden" name="pessoa.id" 
      value="${pessoa.id }" /> 
    
    <label for="nome">Nome:</label>
    <input id="nome" type="text" 
      name="pessoa.nome" value="${pessoa.nome }"/>
    <label for="dataAdmissao">Data Admissao:</label>
    <input id="dataAdmissao" type="date" 
      name="pessoa.dataAdmissao" value=<fmt:formatDate value="${pessoa.dataAdmissao}" type="both" pattern="dd/MM/yyyy"/>/>
   
    <label for="dataNascimento">Data Aniversario:</label>
    <input id="dataNascimento" type="date" 
      name="pessoa.dataNascimento" value=<fmt:formatDate value="${pessoa.dataNascimento}" type="both" pattern="dd/MM/yyyy"/>/>
  <input class="voltar" type="button" value="Voltar" onclick="window.location.href='/vraptor03/pessoa/lista'" />
    <button type="submit">Enviar</button>
  </fieldset>
</form>
</body>
</html>