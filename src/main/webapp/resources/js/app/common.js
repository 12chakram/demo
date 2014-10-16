/**
 * 
 */

         function OnloadFunction ()
         {
        	 OnloadAjaxFunction();
					$('.date-picker').datepicker({
						autoclose: true,
						todayHighlight: true
					})
					//show datepicker when clicking on the icon
					.next().on(ace.click_event, function(){
						$(this).prev().focus();
					});
				
					//or change it into a date range picker
					$('.input-daterange').datepicker({autoclose:true});
				
					//to translate the daterange picker, please copy the "examples/daterange-fr.js" contents here before initialization
					$('input[name=date-range-picker]').daterangepicker({
						'applyClass' : 'btn-sm btn-success',
						'cancelClass' : 'btn-sm btn-default',
						locale: {
							applyLabel: 'Apply',
							cancelLabel: 'Cancel',
						}
					})
					.prev().on(ace.click_event, function(){
						$(this).next().focus();
					});
					
					
						$('#sample-table-2').dataTable( {
							bAutoWidth: false,
							"aoColumns": [
							  { "bSortable": false },
							  null, null,null, null, null,
							  { "bSortable": false }
							],
							"aaSorting": [],
					
							//,
							//"sScrollY": "200px",
							//"bPaginate": false,
					
							//"sScrollX": "100%",
							//"sScrollXInner": "120%",
							//"bScrollCollapse": true,
							//Note: if you are applying horizontal scrolling (sScrollX) on a ".table-bordered"
							//you may want to wrap the table inside a "div.dataTables_borderWrap" element
					
							//"iDisplayLength": 50
					    } );
			
         }
	