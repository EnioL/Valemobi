<%-- 
    Document   : listagemcustomer
    Created on : May 13, 2017, 3:42:26 AM
    Author     : Enio
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media</title>
    </head>
    
    <body>
        
        <c:if test="${customers.size() == 0}">
            <div>Nenhum registro se enquadra nas especificações.</div>
        </c:if>
        <c:if test="${customers.size() != 0}">
        <table class="table table-hover">
                    <thead class="thead-inverse">
                        <tr>
                            <th>id</th>
                            <th>cpf</th>
                            <th>nome</th>
                            <th>ativo</th>
                            <th>valor total</th>                           
                        </tr>
                    </thead>
                    <tbody>        
        
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td><c:out value="${customer.id}"/></td>
                    <td><c:out value="${customer.cpf}"/></td>
                    <td><c:out value="${customer.nome}"/></td>
                    <td><c:out value="${customer.active}"/></td>
                    <td><c:out value="${customer.total}"/></td>                             
                </tr>
            </c:forEach>
        </c:if>
       
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
            </tr>
        </tbody>
    </table>
        <div>Media: <c:out value="${media}"/></div>
        <button type= 'button' onclick="javascript:window.location='index.jsp'" class='btn btn-primary'>Home</button>
    </body>
</html>