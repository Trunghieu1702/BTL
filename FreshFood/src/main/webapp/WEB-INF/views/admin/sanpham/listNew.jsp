<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách bài viết</title>
</head>

<body>
	<div class="container-fluid">
		<!-- Breadcrumbs-->
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
			<li class="breadcrumb-item active">Overview</li>
		</ol>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">First</th>
					<th scope="col">Last</th>
					<th scope="col">Last</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<c:forEach var="item" items="${model.listResult}">
					<tr>
						<th scope="row">1</th>
						<td>${item.tensp}</td>
						<td>${item.gia}</td>
						<td><a class="btn btn-sm btn-primary btn-edit"
							data-toggle="tooltip" title="Cập nhật bài viết" href='#'><i
								class="fa fa-pencil-square-o" aria-hidden="true"></i> </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- /.main-content -->
	<script>
		
	</script>
</body>

</html>