<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h1 class="h2">Becario</h1>
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<spring:url value="/becario/add" var="urlAddBecario"/>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlAddBecario}'" >Nuevo</button>
			<!-- 
			<button class="btn btn-sm btn-outline-secondary">Export</button>
			 -->
		</div>
		<!-- 
		<button class="btn btn-sm btn-outline-secondary dropdown-toggle">
			<span data-feather="calendar"></span> This week
		</button>
		 -->
	</div>
</div>


<h2>Listado</h2>

<div class="table-responsive">
	<table class="table table-striped table-sm">
		<thead>
			<tr>
				<th>DNI</th>
				<th>Becario</th>
				<th>Beca</th>
				<th>Estado Actual</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="becario" items="${becarioList}">
				<tr>
					<td>${becario.dni}</td>
					<td>${becario.fullName}</td>
					<td>${becario.beca.convocatoria}</td>
					<td>${becario.estadoActual}</td>
					<!-- 
					<spring:url value="/ies/${ies.idIes}" var="iesUrl"/>
					 -->

					<spring:url value="/becario/${becario.dni}/update" var="urlUpdateBecario"/>
					<td>
						<!-- 
						<a href="${iesUrl}">Ver</a>
						 -->
						<a href="${urlUpdateBecario}"><span data-feather="edit"></span></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</main>