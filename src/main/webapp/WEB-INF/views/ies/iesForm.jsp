<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
<c:choose >
	<c:when test="${iesForm['new'] }">
		<h5 class="h5">Nuevo IES</h5>
	</c:when>
	<c:otherwise>
		<h5 class="h5">Editar IES</h5>
	</c:otherwise>
</c:choose>
</div>

<spring:url value="/ies" var="iesActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="iesForm" action="${iesActionUrl}">

	<form:hidden path="idIes"/>

	<spring:bind path="nombre">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Nombre</label>
			<div class="col-sm-10">
				<form:input path="nombre" class="form-control form-control-sm" id="nombre" placeholder="Nombre"/>
			</div>
		</div>
	</spring:bind>
	<spring:bind path="tipoIes">
		<div class="form-group">
			<label class="col-sm-2 control-label">Tipo</label>
			<div class="col-sm-10">
				<form:select path="tipoIes" class="form-control form-control-sm" id="tipoIes">
					<form:options items="${opcionesTipoIes}" />
				</form:select>
			</div>
		</div>
	</spring:bind>
	<spring:bind path="tipoGestion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Gestion</label>
			<div class="col-sm-10">
				<form:select path="tipoGestion" class="form-control form-control-sm" id="tipoGestion">
					<form:options items="${opcionesTipoGestion}" />
				</form:select>
			</div>
		</div>
	</spring:bind>
	
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<c:choose>
				<c:when test="${iesForm['new']}">
					<input type="submit"  class="btn-sm btn-primary pull-right" value="Agregar"/>
				</c:when>
				<c:otherwise>
					<input type="submit" class="btn-sm btn-primary pull-right" value="Actualizar" />
				</c:otherwise>
			</c:choose>
		</div> 
	</div>
</form:form>

</main>