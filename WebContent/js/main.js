$(document).ready(function() {
    console.log( "ready!" );
    
    $("#id1").change(function() {
    	console.log( "id 1 changed!" ); 
    	uname = $("#id1").val();
    	console.log(uname);
    	$.ajax({            
    		type:"get",  //http method            
    		url: "CheckName", //servlet url            
    		data:"uname="+uname, //parameter for servlet            
    		dataType: "text", //response data type            
    		success:function(data) {
    			$("#id2").val(data)     			
    		},
    		error: function (xhr, ajaxOptions, thrownError){}
    		});

    });
});