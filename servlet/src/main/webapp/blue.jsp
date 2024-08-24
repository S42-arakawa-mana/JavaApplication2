<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><%= request.getAttribute("color") %></title>
    </head>
    <body>
        <p><%= request.getAttribute("color") %></p>
    </body>
</html>