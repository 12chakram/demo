<!DOCTYPE html>

<%String context=request.getContextPath();%>
<%String server =  request.getServerName(); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Top Menu Style - Ace Admin</title>

		<meta name="description" content="top menu &amp; navigation" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		
		<link href="<c:url value="/app/resources/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/app/resources/css/font-awesome.min.css" />" rel="stylesheet">
		

		<!-- text fonts -->
		<link href="<c:url value="/app/resources/css/ace-fonts.css" />" rel="stylesheet">

		<!-- ace styles -->
		
		<link href="<c:url value="/app/resources/css/ace.min.css" />" rel="stylesheet">
		
		
		<!-- ace settings handler -->
		
		<!-- basic scripts -->
		
		
		<script src="<c:url value="/app/resources/js/jquery.min.js" />"></script>

	
		<!-- ace scripts --> 
		<script src="<c:url value="/app/resources/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/app/resources/js/ace-elements.min.js" />"></script>
		<script src="<c:url value="/app/resources/js/ace.min.js" />"></script>

		<!-- inline scripts related to this page -->
		
		<!-- the following scripts are used in demo only for onpage help and you don't need them -->

		<script type="text/javascript"> ace.vars['base'] = '..'; </script>
		 
			<!--  Application specific JS -->
		<script src="<c:url value="/app/resources/js/app/commonvalidations.js"/>"></script>
		<script src="<c:url value="/app/resources/js/app/common.js"/>"></script>
		<script src="<c:url value="/app/resources/js/app/commonajax.js"/>"></script>
		<script src="<c:url value="/app/resources/js/app/dashboard.js"/>"></script>
		
		
</head>
</html>
