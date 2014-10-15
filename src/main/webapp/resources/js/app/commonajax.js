/**
 * 
 */
$(document).ready(function() {
	$("#addItem").click(function() {
		$.ajax({
			type : 'GET',
			url : "/demo/app/item/addItem",
			success : function(data) {
				 $('#main-content').html("");
				 $('#main-content').html(data);
				 OnloadFunction();
			}
		});
		return false;
	});
	
})
			
		
	