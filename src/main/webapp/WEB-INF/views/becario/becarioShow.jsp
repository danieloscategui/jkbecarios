<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">

	<h5 class="h5">Becario encontrado</h5>
	
	<div class="btn-toolbar mb-2 mb-md-0">
		<div class="btn-group mr-2">
			<spring:url value="/becario/returnBeca" var="urlBecarioReturnBeca"/>
			<spring:url value="/becario/${becario.idBecario}/update" var="urlUpdateBecario"/>
			<spring:url value="/becario/${becario.idBecario}/updateEstado" var="urlUpdateEstadoBecario"/>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlUpdateBecario}'" >Actualizar Becario</button>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlUpdateEstadoBecario}'" >Actualizar Estado</button>
			<button class="btn btn-sm btn-outline-secondary" onclick="location.href='${urlBecarioReturnBeca}'" >Regresar</button>
		</div>
		
	</div>
</div>

<div>
	<div class="row">
		<label class="col-sm-2">DNI</label>
		<div class="col-sm-4">${becario.dni}</div>
		<label class="col-sm-2">Estado</label>
		<div class="col-sm-4">${becario.estadoActual}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Becario</label>
		<div class="col-sm-10">${becario.fullName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">F. Nac.</label>
		<fmt:formatDate value="${becario.fechaNacimiento}" pattern="dd/MM/yyyy" var="fechaNacimiento"/>
		<div class="col-sm-2">${fechaNacimiento}</div>
		<label class="col-sm-2">Edad</label>
		<div class="col-sm-2">${becario.edad}</div>
		<label class="col-sm-2">Sexo</label>
		<div class="col-sm-2">${becario.sexo.value}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Expediente</label>
		<div class="col-sm-10">${becario.numeroExpediente}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Beca</label>
		<div class="col-sm-10">${becario.beca.shortName}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Resolucion</label>
		<div class="col-sm-10">${becario.resolucionAdjudicacionFecha} - ${becario.resolucionAdjudicacion}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Representante</label>
		<div class="col-sm-10">${becario.representanteDni} - ${becario.representante}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Correos</label>
		<div class="col-sm-10">${becario.correoPersonal} - ${becario.correoPronabec}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Telefonos</label>
		<div class="col-sm-10">${becario.telefonos}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Direccion</label>
		<div class="col-sm-10">${becario.direccion}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Procedencia</label>
		<div class="col-sm-10">${becario.regionProcedencia} - ${becario.provinciaProcedencia} - ${becario.distritoProcedencia}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Postulacion</label>
		<div class="col-sm-10">${becario.regionPostulacion} - ${becario.provinciaPostulacion} - ${becario.distritoPostulacion}</div>
	</div>
	<div class="row">
		<label class="col-sm-2">Observaciones</label>
		<div class="col-sm-10">${becario.observaciones}</div>
	</div>
</div>	

</main>