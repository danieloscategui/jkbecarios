<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3">
	<p class="h5">IES: ${fn:length(iesList)} registros</p>
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<spring:url value="/ies/add" var="urlAddIes"/>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlAddIes}'" >Nuevo</button>
		</div>
	</div>
</div>

<div class="table-responsive">
	<table class="table table-striped table-sm">
		<thead class="thead-light">
			<tr>
				<th># ID</th>
				<th>IES</th>
				<th>Tipo</th>
				<th>Gestion</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ies" items="${iesList}">
				<tr>
					<td>${ies.idIes}</td>
					<td>${ies.nombre}</td>
					<td>${ies.tipoIes}</td>
					<td>${ies.tipoGestion}</td>
					<!-- 
					<spring:url value="/ies/${ies.idIes}" var="iesUrl"/>
					 -->

					<spring:url value="/ies/${ies.idIes}/update" var="urlUpdateAsesor"/>
					<td>
						<!-- 
						<a href="${iesUrl}">Ver</a>
						 -->
						<a href="${urlUpdateAsesor}"><span data-feather="edit"></span></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</main>