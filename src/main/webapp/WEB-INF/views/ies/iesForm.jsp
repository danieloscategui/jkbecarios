<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h1 class="h2">IES</h1>
	<!-- 
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<button class="btn btn-sm btn-outline-secondary">Share</button>
			<button class="btn btn-sm btn-outline-secondary">Export</button>
		</div>
		<button class="btn btn-sm btn-outline-secondary dropdown-toggle">
			<span data-feather="calendar"></span> This week
		</button>
	</div>
	 -->
</div>

<c:choose >
	<c:when test="${iesForm['new'] }">
		<h2>Nuevo IES</h2>
	</c:when>
	<c:otherwise>
		<h2>Editar IES</h2>
	</c:otherwise>
</c:choose>

<spring:url value="/ies" var="iesActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="iesForm" action="${iesActionUrl}">

	<form:hidden path="idIes"/>

	<spring:bind path="nombre">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Nombre</label>
			<div class="col-sm-10">
				<form:input path="nombre" class="form-control" id="nombre" placeholder="Nombre"/>
			</div>
		</div>
	</spring:bind>
	<spring:bind path="tipoIes">
		<div class="form-group">
			<label class="col-sm-2 control-label">Tipo</label>
			<div class="col-sm-10">
				<form:input path="tipoIes" class="form-control" id="tipoIes"/>
			</div>
		</div>
	</spring:bind>
	<spring:bind path="tipoGestion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Gestion</label>
			<div class="col-sm-10">
				<form:input path="tipoGestion" class="form-control" id="tipoGestion"/>
			</div>
		</div>
	</spring:bind>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<c:choose>
				<c:when test="${iesForm['new']}">
					<input type="submit"  class="btn-lg btn-primary pull-right" value="Agregar"/>
				</c:when>
				<c:otherwise>
					<input type="submit" class="btn-lg btn-primary pull-right" value="Actualizar" />
				</c:otherwise>
			</c:choose>
		</div> 
	</div>
</form:form>

</main>