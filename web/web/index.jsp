<%-- 
    Document   : index.jsp
    Created on : 13/04/2016, 16:05:54
    Author     : NICOLAS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="comun.jsp"%>
        <link rel="stylesheet" href="res/css/index.css">
    </head>
    <body ng-app="app">
        <nav class="nav container-fluid">
            <button ui-sref="index">Categorias</button>
            <button ui-sref="negocios">Negocios</button>
        </nav>
        
        <div class="menuLateral col-xs-0 col-sm-3  list-group">
            <ul>
                <li class="list-group-item"><button ui-sref="index">Categorias</button></li>
                <li class="list-group-item"><button ui-sref="negocios">Negocios</button></li>
                <li class="list-group-item"><button ui-sref="formularioSubida">Formulario Subida</button></li>
            </ul>
        </div>
        
        <div class="col-sm-9 col-xs-12 container">
            <div ui-view="principal"></div>
        </div>
    </body>
</html>
