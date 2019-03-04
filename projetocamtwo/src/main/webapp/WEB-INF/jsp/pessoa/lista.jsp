<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pessoas</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
	
<body>
<table class="tabela">
  <thead>
    <tr>
      <th>Nome</th>
      <th>Data de Admissão</th>
      <th>Data de Nascimento</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${pessoaList}" var="pessoa">
      <tr>
        <td>${pessoa.nome }</td>
        <td>${pessoa.dataAdmissao }</td>
        <td>${pessoa.dataNascimento }</td>
        <td><input type="button" value="Editar" onclick="window.location.href='edita?id=${pessoa.id }'" /></td>
         <td><input type="button" value="Excluir" onclick="window.location.href='remove?id=${pessoa.id }'" /></td>
      </tr>          
    </c:forEach>
  </tbody>
</table>
	<input class="voltar" type="button" value="Voltar" onclick="window.location.href='../'" />
</body>
</html>