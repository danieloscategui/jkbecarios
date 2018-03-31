<!-- 
	http://keylesson.com/index.php/2015/02/17/spring-mvc-tiles-integration-example-1697/
 -->
 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="sidebar">
		<p>sidebar</p>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<br>Now, we custom this page
	</tiles:putAttribute>
	
</tiles:insertDefinition>