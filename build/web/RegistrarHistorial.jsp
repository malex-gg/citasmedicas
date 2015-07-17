<%-- 
    Document   : RegistrarHistorial
    Created on : 16/04/2015, 12:49:49
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Historial</title>
    </head>
    <body>
        <div>
            <h1> Registro Historial Médico</h1> 
            <form name="form1" action="registrarhistorial.do" method='POST'>
                <p>Cédula: <input type='text' name='cedulah'></p>
                <p>Nombre: <input type='text' name='nombreh'></p>
                <p>Apellido: <input type='text' name='apellidoh'></p>
                <p>Edad: <input type='text' name='edadh'></p>
                <p>Seleccione el Sexo: <select id='sexo' name='sexoh'>
                        <option value='masculino'>Masculino</option>
                        <option value='femenino'>Femenino</option>
                    </select></p>
                <p>Tipo de Sangre: <select id='tiposangre' name='tiposangreh'>
                        <option value='O+'>O+</option>
                        <option value='O-'>O-</option>
                        <option value='A+'>A+</option>
                        <option value='A-'>A-</option>
                        <option value='AB+'>AB+</option>
                        <option value='AB-'>AB-</option>
                    </select>
                </p>
                <p>Alergias: <textarea name="alergiash" rows="10" cols="40"></textarea>
                <p>Sintomas: <textarea name="sintomash" rows="10" cols="40"></textarea>
                    <!--<p>Alergias: <input type='text' name='alergias'></p>-->
                <p>Observaciones: <textarea name="observacionesh" rows="10" cols="40"></textarea>
                <p>Dictamen Médico: <textarea name="dictamenh" rows="10" cols="40"></textarea>
                <p>Receta: <textarea name="recetah" rows="10" cols="40"></textarea>
                <p><input type='submit' value='Registrar Historial Médico'></p>

            </form>
        </div>
    </body>
</html>
