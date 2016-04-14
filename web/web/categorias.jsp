<%-- 
    Document   : categorias
    Created on : 13/04/2016, 16:35:13
    Author     : NICOLAS
--%>
<div ng-controller="categoriasController">
    <div class="well">
        <form ng-submit="submitForm()">
            <div class="form-group">
                <button type="button" class="close" ng-show="modoEdicion" ng-click="retornarModoAlta()">&times;</button>
                <label>Nombre Categoria:</label>
                <input type="text" ng-model="categoriaSeleccionada.nombre" required placeholder="Nombre Categoria.." class="form-control">
            </div>
            <div class="form-group">
                <label>Icono Categoria:</label>
                <input type="text" ng-model="categoriaSeleccionada.icono" required placeholder="Icono Categoria.." class="form-control">
            </div>
            <button class="btn btn-success" ng-hide="modoEdicion"><span class="glyphicon glyphicon-ok"></span> Agregar Categoria</button>
            <button class="btn btn-primary" ng-show="modoEdicion"><span class="glyphicon glyphicon-pencil"></span> Editar Categoria</button>
        </form>
    </div>
    
    
    <div class="well">
        <h1>Categorias!</h1> 
        <img src="res/img/logo.png" ng-show="cargando">
        <div class=" col-xs-10">
            <input type="text" ng-model="filtro" class="form-control" placeholder="Busqueda Rapida..">
        </div>
        <button class="btn btn-default col-xs-2"><span class="glyphicon glyphicon-search"></span></button>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <td>Icono</td>
                    <td>Categoria</td>
                    <td>Editar</td>
                    <td>Borrar</td>
                </tr>
            </thead>
            <tbody>
                <tr ng-repeat="categoria in categorias">
                    <td>{{categoria.icono}}</td>
                    <td ng-click="abrirCategoria(categoria)" ui-sref="negocios">{{categoria.nombre}}</td>
                    <td><button class="btn btn-primary" ng-click="seleccionCategoria(categoria)">
                            <span class="glyphicon glyphicon-pencil"></span> Editar
                        </button></td>
                        <td><button class="btn btn-danger" ng-click="seleccionCategoria(categoria)">
                            <span class="glyphicon glyphicon-remove"></span> Borrar
                        </button></td>
                </tr>
            </tbody>
        </table>
    </div>
   
</div>


