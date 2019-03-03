<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Pessoas</title>
</head>
<body>
	<form action="adicionapessoa">
   <fieldset>
     <legend>Adicionar Pessoa</legend>
     
     <label for="nome">Nome:</label>
     <input id="nome" type="text" name="pessoa.nome"/>
     
     <label for="descricao">Data Admissão:</label>
     <textarea id="descricao" name="pessoa.dataAdmissao"></textarea>
     
     <label for="preco">Data Nascimento:</label>
     <input id="preco" type="text" name="pessoa.dataNascimento"/>
     
     <button type="submit">Enviar</button>
   </fieldset>
 </form>
</body>
</html>
