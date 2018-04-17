<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html >
<html>
<head>

<title>Becarios JK</title>

<!-- 
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, shrink-to-fit=no" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/resources/jqwidgets/jqxcore.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxdata.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxbuttons.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxscrollbar.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxlistbox.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxdropdownlist.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxdatatable.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxpanel.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxradiobutton.js" />"></script>
<script src="<c:url value="/resources/jqwidgets/jqxinput.js" />"></script>
<script src="<c:url value="/resources/js/demo.js" />"></script>

<script src="<c:url value="/resources/dist/js/bootstrap.min.js" />"></script>

<link href="<c:url value="/resources/jqwidgets/styles/jqx.base.css" />" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/jqwidgets/styles/jqx.bootstrap.css" />" rel="stylesheet" type="text/css"/>
<!-- 
<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet" type="text/css"/>
 -->

<link href="<c:url value="/resources/dist/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/dashboard.css" />" rel="stylesheet" type="text/css"/>

</head>

<body>

	<tiles:insertAttribute name="header"/>
	
	<div class="container-fluid">
		<div class="row">
			<tiles:insertAttribute name="sidebar"/>
			<tiles:insertAttribute name="body"/>
		</div>
	</div>

</body>

<!-- Icons -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
	feather.replace()
</script>

<!-- Graphs -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
<script>
     var ctx = document.getElementById("myChart");
     var myChart = new Chart(ctx, {
       type: 'line',
       data: {
         labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
         datasets: [{
           data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
           lineTension: 0,
           backgroundColor: 'transparent',
           borderColor: '#007bff',
           borderWidth: 4,
           pointBackgroundColor: '#007bff'
         }]
       },
       options: {
         scales: {
           yAxes: [{
             ticks: {
               beginAtZero: false
             }
           }]
         },
         legend: {
           display: false,
         }
       }
     });
    </script>

</html>