<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h1 class="h2">Listado de Asesores</h1>
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<button class="btn btn-sm btn-outline-secondary">Nuevo</button>
			<button class="btn btn-sm btn-outline-secondary">Export</button>
		</div>
	</div>
</div>


<h2>Tabla</h2>
<div class="table-responsive">
	<table class="table table-striped table-sm">
		<thead>
			<tr>
				<th>ID</th>
				<th>Asesor</th>
				<th>Editar</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="asesor" items="${listaAsesores}">
				<tr>
					<td>${asesor.idAsesor}</td>
					<td>${asesor.nombre}</td>
					<td><a href='<c:url value="${contextPath}/asesor/edit/${asesor.idAsesor}" />'>Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<!-- Formulario -->
<div>
	<!-- 
	<form action='<c:url value="/asesor/edit "/>' method="post">
		<label>ID</label>
		<input id="idAsesor" name="idAsesor" type="hidden">
		<label>Asesor</label>
		<input id="asesorNombre" name="asesorNombre" type="text" >
		<input type="button" title="Aceptar">
	</form>
	 -->
</div>

</main>