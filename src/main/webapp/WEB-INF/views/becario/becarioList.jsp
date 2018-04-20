<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2- mb-3">	
	<div>
		<!-- https://getbootstrap.com/docs/4.0/getting-started/introduction/ -->
		<ul class="list-unstyled">
			<li>Asesor: ${beca.asesor.nombre }</li>
			<li>${beca.convocatoria} - ${beca.modalidad}</li> 
			<li>${beca.ies.nombre } - ${beca.regionEstudio} - ${beca.sedeEstudio } - ${beca.carrera}</li>
			<li>${fn:length(becarioList)} Becarios</p>
		</ul>
	</div>
	
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<spring:url value="/becario/add" var="urlAddBecario"/>
			<spring:url value="/beca" var="urlBecas" />
			<!-- 
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlAddBecario}'" >Nuevo</button>
			 -->
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlBecas}'" >Regresar</button>
		</div>
	</div>
</div>

<div class="table-responsive">
	<table class="table table-striped table-sm">
		<thead>
			<tr>
				<th>DNI</th>
				<th>Becario</th>
				<th>Estado Actual</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="becario" items="${becarioList}">
				<tr>
					<td>${becario.dni}</td>
					<td>${becario.fullName}</td>
					<td>${becario.estadoActual.value}</td>

					<spring:url value="/becario/${becario.dni}/update" var="urlUpdateBecario"/>
					<spring:url value="/becario/${becario.dni}/updateEstado" var="urlUpdateEstadoBecario"/>
					<td>
						<a href="${urlUpdateBecario}" data-toggle="tooltip" title="Editar"><span data-feather="edit"></span></a>
						<a href="${urlUpdateEstadoBecario}" data-toggle="tooltip" title="Cambiar estado" ><span data-feather="flag"></span></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>


</main>

<script type="text/javascript">
$(document).ready(function(){
	$('#triggerEstadoModal').click(function{
		alert("HOLA");
		
	});
});
</script>