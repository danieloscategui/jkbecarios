<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BECARIOS JK</title>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div id="sidebar">
		<tiles:insertAttribute name="sidebar"/>
	</div>
	<div id ="body">
		<tiles:insertAttribute name="body"/>
	</div>
</body>
</html>