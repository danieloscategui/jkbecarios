<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">


<c:choose >
	<c:when test="${becaForm['new']}">
		<h5 class="h5">Nueva Beca</h5>
		<c:set var="readonly" value="false"/>
	</c:when>
	<c:otherwise>
		<h5 class="h5">Editar Beca</h5>
		<c:set var="readonly" value="true" />
	</c:otherwise>
</c:choose>

</div>

<spring:url value="/beca" var="becaActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="becaForm" action="${becaActionUrl}">
	
	<form:hidden path="idBeca"/>
	<spring:bind path="convocatoria">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Convocatoria</label>
			<div class="col-sm-10">
				<form:input path="convocatoria" class="form-control form-control-sm" id="convocatoria" placeholder="Convocatoria" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="modalidad">
		<div class="form-group">
			<label class="col-sm-2 control-label">Modalidad</label>
			<div class="col-sm-10">
				<form:input path="modalidad" class="form-control form-control-sm" id="modalidad" placeholder="Modalidad" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="ies">
		<div class="form-group">
			<label class="col-sm-2 control-label">IES</label>
			<div class="col-sm-10">
				<form:select path="ies" class="form-control form-control-sm" id="ies" >
					<form:options items="${listaIes}" itemLabel="nombre" itemValue="idIes"/>
				</form:select>
			</div>
		</div>
	</spring:bind>
	<spring:bind path="regionEstudio">
		<div class="form-group">
			<label class="col-sm-2 control-label">Region Estudio</label>
			<div class="col-sm-10">
				<form:input path="regionEstudio" class="form-control form-control-sm" id="regionEstudio" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="sedeEstudio">
		<div class="form-group">
			<label class="col-sm-2 control-label">Sede Estudio</label>
			<div class="col-sm-10">
				<form:input path="sedeEstudio" class="form-control form-control-sm" id="sedeEstudio" />
			</div>
		</div>
	</spring:bind>	
	<spring:bind path="carrera">
		<div class="form-group">
			<label class="col-sm-2 control-label">Carrera</label>
			<div class="col-sm-10">
				<form:input path="carrera" class="form-control form-control-sm" id="carrera" />
			</div>
		</div>
	</spring:bind>	
	<spring:bind path="inicioBeca">
		<div class="form-group">
			<label class="col-sm-2 control-label">Inicio Beca</label>
			<div class="col-sm-10">
				<form:input path="inicioBeca" class="form-control form-control-sm datepicker" id="inicioBeca"  />
			</div>
		</div>
	</spring:bind>	
	<spring:bind path="terminoBeca">
		<div class="form-group">
			<label class="col-sm-2 control-label">Termino Beca</label>
			<div class="col-sm-10">
				<form:input path="terminoBeca" class="form-control form-control-sm" id="terminoBeca" />
			</div>
		</div>
	</spring:bind>	
	<spring:bind path="semestreEgreso">
		<div class="form-group">
			<label class="col-sm-2 control-label">Semestre Egreso</label>
			<div class="col-sm-10">
				<form:input path="semestreEgreso" class="form-control form-control-sm" id="semestreEgreso" />
			</div>
		</div>
	</spring:bind>	
	<spring:bind path="asesor">
		<div class="form-group">
			<label class="col-sm-2 control-label">Asesor</label>
			<div class="col-sm-10">
				<form:select path="asesor" class="form-control form-control-sm" id="asesor">
					<form:options items="${listaAsesores}" itemLabel="nombre" itemValue="idAsesor" />
				</form:select>
			</div>
		</div>
	</spring:bind>	
		
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<c:choose>
				<c:when test="${becaForm['new']}">
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