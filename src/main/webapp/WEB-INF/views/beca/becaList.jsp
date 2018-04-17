<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h1 class="h2">Becas</h1>
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<spring:url value="/beca/add" var="urlAddBeca"/>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlAddBeca}'" >Nuevo</button>
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
				<th># ID</th>
				<th>Convocatoria</th>
				<th>Modalidad</th>
				<th>IES</th>
				<th>Region Estudio</th>
				<th>Sede Estudio</th>
				<th>Carrera</th>
				<th>Inicio Beca</th>
				<th>Termino Beca</th>
				<th>Semestre Egreso</th>
				<th>Asesor</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="beca" items="${becaList}">
				<tr>
					<td>${beca.idBeca}</td>
					<td>${beca.convocatoria}</td>
					<td>${beca.modalidad}</td>
					<td>${beca.ies.nombre}</td>
					<td>${beca.regionEstudio}</td>
					<td>${beca.sedeEstudio }
					<td>${beca.carrera}</td>
					
					<fmt:formatDate var="inicioBeca" value="${beca.inicioBeca}" pattern="dd-MM-yyyy" />
					<fmt:formatDate var="terminoBeca" value="${beca.terminoBeca}" pattern="dd-MM-yyyy" />
					
					<td>${inicioBeca}</td>
					<td>${terminoBeca}</td>
					
					<td>${beca.semestreEgreso}</td>
					<td>${beca.asesor.nombre}</td>
					<!-- 
					<spring:url value="/ies/${ies.idIes}" var="iesUrl"/>
					 -->

					<spring:url value="/beca/${beca.idBeca}/update" var="urlUpdateBeca"/>
					<spring:url value="/becarios/beca/${beca.idBeca}" var="urlBecariosPorBeca"/>
					<td>
						<!-- 
						<a href="${iesUrl}">Ver</a>
						 -->
						<a href="${urlUpdateBeca}"><span data-feather="edit"></span></a>
						<a href="${urlBecariosPorBeca}"><span data-feather="list"></span></a>
					</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</main>