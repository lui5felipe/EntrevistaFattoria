<%-- 
    Document   : cadastro
    Created on : 22/02/2018, 12:44:29
    Author     : luisf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produtos</title>
    </head>
    <body>
        <div align="center">
        <h1>Criar Produto</h1>
        <form:form action="/salvar" method="post" modelAttribute="Produto">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Nome:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Preço:</td>
                <td><form:input path="preco" /></td>
            </tr>
            <tr>
                <td>Quantidade:</td>
                <td><form:input path="qtd" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Salvar"></td>
            </tr>
        </table>
        </form:form>
    </div>
    </body>
</html>
