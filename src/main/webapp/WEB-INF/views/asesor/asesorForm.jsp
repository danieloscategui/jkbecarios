<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	
</div>

<c:choose >
	<c:when test="${asesorForm['new']}">
		<h5 class="h5">Nuevo Asesor</h5>
	</c:when>
	<c:otherwise>
		<h5>Editar Asesor</h5>
	</c:otherwise>
</c:choose>

<spring:url value="/asesor" var="asesorActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="asesorForm" action="${asesorActionUrl}">

	<form:hidden path="idAsesor"/>

	<spring:bind path="nombre">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Nombre</label>
			<div class="col-sm-10">
				<form:input path="nombre" class="form-control form-control-sm" id="nombre" placeholder="Nombre"/>
			</div>
		</div>
	</spring:bind>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<c:choose>
				<c:when test="${asesorForm['new']}">
					<input type="submit"  class="btn-sm btn-primary pull-right" value="Agregar"/>
				</c:when>
				<c:otherwise>
					<input type="submit" class="btn-sm btn-primary pull-right" value="Actualizar" />
				</c:otherwise>
			</c:choose>
			<spring:url value="/asesor" var="urlCancelar"/>
			<button class="btn-sm btn-secondary pull-right" onclick="location.href='${urlBecaReporteExcel}'" >Cancelar</button>
		</div> 
	</div>
</form:form>

</main>