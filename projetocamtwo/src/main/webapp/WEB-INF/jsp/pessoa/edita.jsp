<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="../css/styleEdita.css" rel="stylesheet" type="text/css"></head>
<meta charset="ISO-8859-1">
<body>
<form action="altera">
  <fieldset>
    <legend>Editar Pessoa</legend>
    
   
    <p id="nome">Nome: ${pessoa.nome }
   	<p id="dataAdmissao">Data Admiss�o: ${pessoa.dataAdmissao}
    <p id="dataNascimento">Data Anivers�rio: ${pessoa.dataNascimento}
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
      name="pessoa.dataAdmissao" value="${pessoa.dataAdmissao }"/>
   
    <label for="dataNascimento">Data Aniversario:</label>
    <input id="dataNascimento" type="date" 
      name="pessoa.dataNascimento" value="${pessoa.dataNascimento }"/>
  
    <button type="submit">Enviar</button>
  </fieldset>
</form>
</body>
</html>