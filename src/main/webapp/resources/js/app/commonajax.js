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
	
	$("#createItem").click(function() {
		$.ajax({
			type : 'POST',
			url : "/demo/app/item/add",
			success : function(data) {
				 $('#main-content').html("");
				 $('#main-content').html(data);
				 OnloadFunction();
				 
			}
		});
		return false;
	});
	
}
			
		
	