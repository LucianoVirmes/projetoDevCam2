<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="../css/styleLista.css" rel="stylesheet" type="text/css">
</head>
	
<body>
<table class="tabela">
  <thead>
    <tr>
      <th>Nome</th>
      <th>Data Admissao</th>
      <th>Data Nascimento</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${pessoaList}" var="pessoa">
      <tr>
        <td>${pessoa.nome }</td>
        <td>${pessoa.dataAdmissao }</td>
        <td>${pessoa.dataNascimento }</td>
        <td><a href="edita?id=${pessoa.id }">Editar</a></td>
         <td><a href="remove?id=${pessoa.id }">Remover</a></td>
      </tr>          
    </c:forEach>
  </tbody>
</table>
</body>
</html>