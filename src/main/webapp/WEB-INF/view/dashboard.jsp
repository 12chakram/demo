<!DOCTYPE html>

<%@include file="../../taglib.jsp"%>
<jsp:include page="../../static.jsp"></jsp:include>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		
		<script type="text/javascript">
	      $(document).ready(OnloadFunction);
	  </script>
		
	</head> 
	
	<body class="no-skin">
        <jsp:include page="./templates/header/authheader.jsp"></jsp:include>
        
        <div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
            <jsp:include page="./templates/leftnav/leftnav.jsp"></jsp:include>
         
            <div class="main-content" id="main-content">
            
            </div>
            <jsp:include page="./templates/footer/footer.jsp"></jsp:include>

                   <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div>
	</body>
</html>




	