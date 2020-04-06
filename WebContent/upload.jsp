<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<form action="DailyUploadController"  method="post" enctype="multipart/form-data">
			<div class="form-group">
				<input type="file" name="file" id="fileElem" class="form-control">
			</div>
			<div class="form-group">
			<input type="submit" value="Incarca" class="form-control">
			</div>
	</form>
</div>
</body>
</html>