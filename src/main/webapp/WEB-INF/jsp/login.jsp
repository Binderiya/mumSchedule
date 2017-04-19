<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
/**
 * parallax.css
 * @Author Original @msurguy -> http://bootsnipp.com/snippets/featured/parallax-login-form
 * @Reworked By @kaptenn_com 
 * @package PARALLAX LOGIN.
 */
body {
	background-color: #a7def9;
	background-image: url("/WEB-INF/img/pattern.gif");
	background-repeat: repeat-y;
	background-repeat: repeat-y;
}

.panel-body {
	margin: center;
}

h1 {
	text-align: center;
	color: rgb(57, 125, 193);
}

.form-signin input[type="text"] {
	margin-bottom: 5px;
	border-bottom-left-radius: 0;
	border-bottom-right-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.form-signin .form-control {
	position: relative;
	font-size: 16px;
	font-family: 'Open Sans', Arial, Helvetica, sans-serif;
	height: auto;
	padding: 10px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.vertical-offset-100 {
	padding-top: 100px;
	width: 800px;
	margin: auto
}
</style>
</head>
<body>
	<div class="container">
		<div class="row vertical-offset-100">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row-fluid user-row">
							<img src="http://s11.postimg.org/7kzgji28v/logo_sm_2_mr_1.png"
								class="img-responsive" alt="Conxole Admin" />
								<h1>MUM Schedule</h1>
						</div>
					</div>
					<div class="panel-body">
						<form accept-charset="UTF-8" action="/login" method="post"
							role="form" class="form-signin">
							<fieldset>
								<label class="panel-login"> </label> <input class="form-control"
									name="username" placeholder="Username" id="username"
									type="text"> <input class="form-control"
									name="password" placeholder="Password" id="password"
									type="password"> <br></br> <input
									class="btn btn-lg btn-success btn-block" type="submit"
									id="login" value="Login »">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>