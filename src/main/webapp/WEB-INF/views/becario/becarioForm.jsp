<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
<div
	class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
	<h1 class="h2">Becario</h1>
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
	<c:when test="${becarioForm['new'] }">
		<h2>Nuevo Becario</h2>
	</c:when>
	<c:otherwise>
		<h2>Editar Becario</h2>
	</c:otherwise>
</c:choose>

<spring:url value="/becario" var="becarioActionUrl"/>

<form:form class="form-horizontal" method="post" modelAttribute="becarioForm" action="${becarioActionUrl}">
	
	<spring:bind path="dni">
		<div class="form-group">
			<label class="col-sm-2 control-label" >DNI</label>
			<div class="col-sm-10">
				<c:choose>
					<c:when test="${becarioForm['new']}">
						<form:input path="dni" class="form-control" id="dni" placeholder="DNI"  />
					</c:when>
					<c:otherwise>
						<form:input path="dni" class="form-control" id="dni" placeholder="DNI" disabled="true" />
					</c:otherwise>
				</c:choose>
				
			</div>
		</div>	
	</spring:bind>
	
	<spring:bind path="nombres">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Nombre</label>
			<div class="col-sm-10">
				<form:input path="nombres" class="form-control" id="nombres" placeholder="Nombres"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="apellidos">
		<div class="form-group">
			<label class="col-sm-2 control-label" >Apellidos</label>
			<div class="col-sm-10">
				<form:input path="apellidos" class="form-control" id="apellidos" placeholder="Apellidos"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="fechaNacimiento">
		<div class="form-group">
			<label class="col-sm-2 control-label">Fecha Nacimiento</label>
			<div class="col-sm-10">
				<form:input path="fechaNacimiento" class="form-control" id="fechaNacimiento"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="edad">
		<div class="form-group">
			<label class="col-sm-2 control-label">Edad</label>
			<div class="col-sm-10">
				<form:input path="edad" class="form-control" id="edad"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="estadoActual">
		<div class="form-group">
			<label class="col-sm-2 control-label">Estado Actual</label>
			<div class="col-sm-10">
				<form:input path="estadoActual" class="form-control" id="estadoActual"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="direccion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Direccion</label>
			<div class="col-sm-10">
				<form:input path="direccion" class="form-control" id="direccion"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="representante">
		<div class="form-group">
			<label class="col-sm-2 control-label">Representante</label>
			<div class="col-sm-10">
				<form:input path="representante" class="form-control" id="representante"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="representanteDni">
		<div class="form-group">
			<label class="col-sm-2 control-label">Representante DNI</label>
			<div class="col-sm-10">
				<form:input path="representanteDni" class="form-control" id="representanteDni"/>
			</div>
		</div>
	</spring:bind>
	
	
	<spring:bind path="numeroExpediente">
		<div class="form-group">
			<label class="col-sm-2 control-label">Numero Expediente</label>
			<div class="col-sm-10">
				<form:input path="numeroExpediente" class="form-control" id="numeroExpediente"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="beca.idBeca">
		<div class="form-group">
			<label class="col-sm-2 control-label">Beca</label>
			<div class="col-sm-10">
				<form:input path="beca.idBeca" class="form-control" id="beca.idBeca"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="telefonos">
		<div class="form-group">
			<label class="col-sm-2 control-label">Telefonos</label>
			<div class="col-sm-10">
				<form:input path="telefonos" class="form-control" id="telefonos"/>
			</div>
		</div>
	</spring:bind>
	
	
	<spring:bind path="correoPersonal">
		<div class="form-group">
			<label class="col-sm-2 control-label">Correo Personal</label>
			<div class="col-sm-10">
				<form:input path="correoPersonal" class="form-control" id="correoPersonal"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="correoPronabec">
		<div class="form-group">
			<label class="col-sm-2 control-label">Correo Pronabec</label>
			<div class="col-sm-10">
				<form:input path="correoPronabec" class="form-control" id="correoPronabec"/>
			</div>
		</div>
	</spring:bind>
	
	
	<spring:bind path="regionProcedencia">
		<div class="form-group">
			<label class="col-sm-2 control-label">Region Procedencia</label>
			<div class="col-sm-10">
				<form:input path="regionProcedencia" class="form-control" id="regionProcedencia"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="provinciaProcedencia">
		<div class="form-group">
			<label class="col-sm-2 control-label">Provincia Procedencia</label>
			<div class="col-sm-10">
				<form:input path="provinciaProcedencia" class="form-control" id="provinciaProcedencia"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="distritoProcedencia">
		<div class="form-group">
			<label class="col-sm-2 control-label">Distrito Procedencia</label>
			<div class="col-sm-10">
				<form:input path="distritoProcedencia" class="form-control" id="distritoProcedencia"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="regionPostulacion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Region Postulacion</label>
			<div class="col-sm-10">
				<form:input path="regionPostulacion" class="form-control" id="regionPostulacion"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="provinciaPostulacion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Provincia Postulacion</label>
			<div class="col-sm-10">
				<form:input path="provinciaPostulacion" class="form-control" id="provinciaPostulacion"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="distritoPostulacion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Distrito Postulacion</label>
			<div class="col-sm-10">
				<form:input path="distritoPostulacion" class="form-control" id="distritoPostulacion"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="resolucionAdjudicacion">
		<div class="form-group">
			<label class="col-sm-2 control-label">Resolucion Adjudicacion</label>
			<div class="col-sm-10">
				<form:input path="resolucionAdjudicacion" class="form-control" id="resolucionAdjudicacion"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="resolucionAdjudicacionFecha">
		<div class="form-group">
			<label class="col-sm-2 control-label">Fecha Resolucion Adjudicacion</label>
			<div class="col-sm-10">
				<form:input path="resolucionAdjudicacionFecha" class="form-control" id="resolucionAdjudicacionFecha"/>
			</div>
		</div>
	</spring:bind>
	
	<spring:bind path="observaciones">
		<div class="form-group">
			<label class="col-sm-2 control-label">Observaciones</label>
			<div class="col-sm-10">
				<form:input path="observaciones" class="form-control" id="observaciones"/>
			</div>
		</div>
	</spring:bind>
		
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<c:choose>
				<c:when test="${becarioForm['new']}">
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