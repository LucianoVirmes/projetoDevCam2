<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
      <tr id="pessoa-${pessoa.id}">
        <td>${pessoa.nome }</td>
        <td><fmt:formatDate value="${pessoa.dataAdmissao}" type="both" pattern="dd/MM/yyyy"/></td>
        <td><fmt:formatDate value="${pessoa.dataNascimento}" type="both" pattern="dd/MM/yyyy"/></td>
        <td><input type="button" value="Editar" onclick="window.location.href='edita?id=${pessoa.id }'" /></td>
         <td><a href="javascript:void(0);" onclick="remover(${pessoa.id})">Remover</a></td>
      </tr>
    </c:forEach>
  </tbody>
</table>
	<input class="voltar" type="button" value="Voltar" onclick="window.location.href='../'" />
	
	 <script type="text/javascript" src="../js/script.js"></script>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
</body>
</html>