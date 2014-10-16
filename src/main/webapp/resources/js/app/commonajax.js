/**
 * 
 */
 function OnloadAjaxFunction () {
	$("#addItem").click(function() {
		$.ajax({
			type : 'GET',
			url : "/demo/app/item",
			success : function(data) {
				 $('#main-content').html("");
				 $('#main-content').html(data);
				 OnloadFunction();
				 
			}
		});
		return false;
	});
	
		$('#createItemFrom').submit(function(event) {
		//var formData = $("#createItemFrom").serialize();
		  var itemName = $('#itemName').val();
	      var itemType = $('#itemType').val();
	      var description = $('#description').val();
	      var checkInDate = $('#checkInDate').val();
	      var pmpDueDate = $('#pmpDueDate').val();
	      
	      var jsonRequest = { "itemName" : itemName, "itemType" : itemType, "description": description, "checkInDate":checkInDate,"pmpDueDate":pmpDueDate};
	    
		$.ajax({
			type : 'POST',
			data: JSON.stringify(jsonRequest),
			//data: formData,
			url: $("#createItemFrom").attr("action"),
			 beforeSend: function(xhr) {
		            xhr.setRequestHeader("Accept", "application/json");
		            xhr.setRequestHeader("Content-Type", "application/json");
		        },
			success : function(item) {
				$('#createItemFrom')[0].reset();
				$("#resItemName").text(item.itemName);
				$("#resItemID").text(item.itemId);
				$("#resItemType").text(item.itemType);
				$("#resItemDesc").text(item.description);
				$("#resCheckIn").text(item.checkInDate);
				$("#resPMPDue").text(item.pmpDueDate);
				$("#itemResponseDiv").show();
				/*var respContent = "";
	            respContent += "<span class='success'>Smartphone was created: [";
	            respContent += item.itemId + " : ";
	            respContent += smartphone.itemName + " : " ;
	            respContent += smartphone.itemType +":";
	            respContent += smartphone.description +":";
	            respContent += smartphone.checkInDate +":";
	            respContent += smartphone.PMDueDate +"]</span>";
	            alert(respContent);
				 $('#main-content').html(respContent);*/
				 OnloadFunction();
				 
			},
			 failure : function(response) {
				  alert("Request failed: " + response.responseText);
	        },
	        error : function(response) {
	                alert("Request failed: " + response.responseText);
	        }
		});
		event.preventDefault();
	});
		
		
		$("#allItemsLink").click(function() {
			$.ajax({
				type : 'GET',
				url : "/demo/app/item/all",
				success : function(data) {
					 $('#main-content').html("");
					 $('#main-content').html(data);
					 OnloadFunction();
				}
			});
			return false;
		});
		
	
}
			
		
	