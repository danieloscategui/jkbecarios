<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h6 class="h6">Becario - Cambio de estado</h6>
	
</div>

<spring:url value="/becario/updateEstado" var="becarioActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="becarioForm" action="${becarioActionUrl}">
		
		<form:hidden path="idBecario"/>
			
		<div class="form-group">
			<label class="col-sm-2 control-label" >DNI</label>
			<div class="col-sm-10">
				<form:input path="dni" class="form-control form-control-sm" id="dni" readonly="true" />
			</div>
		</div>	
	
		<div class="form-group">
			<label class="col-sm-2 control-label" >Nombre</label>
			<div class="col-sm-10">
				<form:input path="nombres" class="form-control form-control-sm" id="nombres" readonly="true" />
			</div>
		</div>
	
		<div class="form-group">
			<label class="col-sm-2 control-label" >Apellidos</label>
			<div class="col-sm-10">
				<form:input path="apellidos" class="form-control form-control-sm" id="apellidos" readonly="true" />
			</div>
		</div>
	
		<div class="form-group">
			<label class="col-sm-2 control-label">Estado</label>
			<div class="col-sm-10">
				<form:select path="estadoActual" class="form-control form-control-sm" id="estadoActual">
					<form:options items="${becarioEstado}" />
				</form:select>
			</div>
		</div>
	
	<form:hidden path="beca.idBeca"/>
	
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn-sm btn-primary pull-right" value="Actualizar" />
			
			<spring:url value="/becario/beca/${beca.idBeca}" var="urlCancelar"/>
			<button class="btn-sm btn-secondary pull-right" onclick="location.href='${urlBecaReporteExcel}'" >Cancelar</button>
		</div> 
	</div>
</form:form>

</main>