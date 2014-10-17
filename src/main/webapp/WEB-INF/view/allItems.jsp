<!DOCTYPE html>
<%@include file="../../taglib.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

table {
  border-spacing: 0.5rem;
}

table, th, td {
    border: 1px solid green;
}

th {
    background-color: green;
    color: white;
}
</style>



</head>
<body>
	<div>
		<table style="margin-top: 50px;margin-left: 100px;"> 
			<thead>
				<tr>
					<th>Item ID</th>
					<th>Item Type</th>
					<th>Item Name</th>
					<th>Item Des</th>
					<th>Check-In Date</th>
					<th>Due Date</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${allItems}">
					<tr>
						<td>${item.itemId}</td>
						<td>${item.itemType}</td>
						<td>${item.itemName}</td>
						<td>${item.description}</td>
						<td>${item.checkInDate}</td>
						<td>${item.pmpDueDate}</td>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>





