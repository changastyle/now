<div class="well" ng-controller="formularioSubidaController">
    
    <form id="formu" method="POST" enctype="multipart/form-data" action="upload">
        <label>Subir Archivo:</label>
        <input type="text" name="nombre" value="testFile">
        <input type="file" name="file">
        <button type="submit"> Subir</button>
    </form>
    
</div>
