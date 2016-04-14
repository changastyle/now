app = angular.module('app',['ui.router']);

app.config(function($stateProvider)
{
    $stateProvider.state('index',
    {
       url:"index",
       controller:'categoriasController',
       views:
       {
           "principal":
            {
                templateUrl:"categorias.jsp",
            }
       }
    });
    $stateProvider.state('negocios',
    {
        url:"negocios",
        controller:'negociosController',
        views:
        {
            "principal":{templateUrl:"negocios.jsp"}
        }
    });
    $stateProvider.state('formularioSubida',
    {
        url:"subida",
        controller:'formularioSubidaController',
        views:
        {
            "principal":{templateUrl:"formularioSubida.jsp"}
        }
    });
});

app.service('servicioIntercomunicador', function ServicioIntercomunicador()
{
    servicioIntercomunicador = this;
    
    servicioIntercomunicador.categoriaSeleccionada = {};
});

app.controller('categoriasController', function($scope, servicioIntercomunicador)
{
    $scope.urlWS = "../categorias";
    $scope.categorias = [];
    $scope.cargando = false;
    $scope.modoEdicion = false;
    $scope.categoriaSeleccionada = {};
    
    $scope.findCategorias = function()
    {
        $.ajax(
        {
            url: $scope.urlWS,
            beforeSend: function (xhr) 
            {
                $scope.cargando = true;
            },
            success: function (resultado, textStatus, jqXHR) 
            {
                console.log("findCategorias: " +resultado);
                $scope.categorias = resultado;
                $scope.cargando = false;
                $scope.$apply();
                
            }
        });
    } 
    $scope.cambiarModoEdicion = function()
    {
        $scope.modoEdicion = true;
    }
    $scope.retornarModoAlta = function()
    {
        $scope.modoEdicion = false;
        $scope.categoriaSeleccionada = {};
    }
    $scope.seleccionCategoria = function(categoria)
    {
        $scope.categoriaSeleccionada = categoria;
        $scope.cambiarModoEdicion();
    }
    $scope.addCategoria = function()
    {
        $scope.categorias.push($scope.categoriaSeleccionada);
        $scope.categoriaSeleccionada = {};
    }
    $scope.editCategoria = function()
    {
        for(i = 0 ; i < $scope.categorias.length ; i++)
        {
            if($scope.categoriaSeleccionada.id == $scope.categorias[i].id)
            {
                $scope.categorias[i] = $scope.categoriaSeleccionada;
                $scope.categoriaSeleccionada = {};
                //console.log(JSON.stringify($scope.categorias[i]));
            }
        }
        $scope.retornarModoAlta();
    }
    $scope.removeCategoria = function()
    {
    }
    $scope.abrirCategoria = function(categoria)
    {
        console.log("abriendo " + JSON.stringify(categoria));
        servicioIntercomunicador.categoriaSeleccionada = categoria;
    }
    $scope.submitForm = function()
    {
        if($scope.modoEdicion)
        {
            console.log("submiteo en modo edicion!");
            $scope.addCategoria();
        }
        else
        {
            console.log("submiteo en modo alta!");
            $scope.editCategoria();
        }
    }
    $scope.saludar = function()
    {
        console.log("hola");
    }
    $scope.findCategorias();
});

app.controller('negociosController',function($scope, servicioIntercomunicador)
{
    $scope.categoriaSeleccionada = servicioIntercomunicador.categoriaSeleccionada;  
});

app.controller('formularioSubidaController',function($scope, servicioIntercomunicador)
{
    $scope.subir = function()
    {
        console.log("Subiendo.." + JSON.stringify($("#formu")));
    }
});