<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav">
				<h1>MUM Schedule</h1>
				<h4>Menu</h4>
				<ul class="nav nav-pills nav-stacked">
					<li><a href="/admin/viewSchedule">Schedule</a></li>
					<li class="active"><a href="/admin/viewCourse">View
							courses</a></li>
					<li><a href="/admin/addCourse">Add course</a></li>
				</ul>
				<br>
			</div>

			<div class="col-sm-9">
				<h1>List of courses</h1>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Course id</th>
							<th>Course name</th>
							<th>Professor</th>
						</tr>
					</thead>
					<c:forEach items="${courses}" var="course">

						<tr>
							<td>${course.id }</td>
							<td>${course.name }</td>
							<td>${course.prof }</td>

						</tr>

					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<footer class="container-fluid">
		<p>MUM schedule</p>
	</footer>

</body>
</html>
