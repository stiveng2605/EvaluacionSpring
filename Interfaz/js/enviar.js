$(document).ready(function() {
    $('#listar').on('click', function() {
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = "";
        tabla.innerHTML += '<thead> <th>Codigo</th> <th>Nombres</th> <th>Apellidos</th> <th>Materias</th> <th>Notas</th></thead>';
    
    
        $.ajax({
            url: "http://localhost:8080/listarEstudiantes",
            type: "GET",
            dataType: "JSON",
            success : function(respuesta) {
                console.log(respuesta);
                for(i=0; i <= respuesta.length; i++){
                    tabla.innerHTML += '<tr> <td>' + respuesta[i].codigo + '</td> <td>' +
                        respuesta[i].nombre + '</td> <td>' + 
                        respuesta[i].apellido + '</td> <td>' +
                        respuesta[i].materias + '</td> <td>' +
                        respuesta[i].notas + '</td> <td>'
                }
                
            }
        })
    
    });
    
    $('#boton').on('click', function() {
        let datos = {
            codigo: parseInt($('#codigo').val()),
            nombre: $('#nombre').val(),
            apellido: $('#apellido').val(),
            materias: materias = [$('#materia_1').val(), $('#materia_2').val(), $('#materia_3').val()],
            notas: notas = [parseFloat($('#nota_1').val()), parseFloat($('#nota_2').val()), parseFloat($('#nota_1').val())],
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
    
        $.ajax({
            url: "http://localhost:8080/agregarEstudiante",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            datatype: "JSON",
            success: function(respuesta) {
                alert(respuesta);
            }
        });
    });
    
    $('#eliminar').on('click', function(){
    
        let materia = $('#materia').val();
        $.ajax({
            url: "http://localhost:8080/eliminarEstudiante/" + materia,
            type: "DELETE",
            datatype: "JSON",
            success: function(respuesta) {
                console.log(respuesta)
                alert(respuesta) 
                
            }
    
        });
    });
});

