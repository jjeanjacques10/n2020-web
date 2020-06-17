<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="pt-br">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<title>TheGoodBot N2020</title>
<link href="${contextPath}/icons/css/all.css" rel="stylesheet">
</head>
<body>

	<nav class="site-header sticky-top py-1"
		style="background-color: #0f70b7;">
		<div
			class="container d-flex flex-column flex-md-row justify-content-center">
			<a class="btn my-2 mx-5 btn-outline-primary" style="color: white;"
				href="${contextPath}/bot/">Listar Bots</a> <a
				class="btn my-2 mx-5 btn-outline-primary " style="color: white;"
				href="${contextPath}/bot/form?page=addBot">Adicionar Bot</a> <a
				class="btn my-2 mx-5 btn-outline-primary active"
				style="color: white;" href="${contextPath}/segment">Segmentos</a>
		</div>
	</nav>

	<main role="main">
		<div class="container text-center mt-5 mb-4">
			<div class="row justify-content-center">
				<div class="col-md-4">
					<img src="${contextPath}/images/logo.png" alt="TheGoodBot"
						class="img-fluid">
				</div>
			</div>
			<div class="row justify-content-center mt-5">
				<div class="col-md-4">
					<p style="color: grey; font-size: 18px">Aplicação de
						gerenciamento dos segments do TheGoodBot N2020 - PS FIAP</p>
				</div>
			</div>
			<div class="row justify-content-center mt-3">
				<p>
					<a class="btn btn-success btn-lg mt-4"
						href="${contextPath}/segment/form?page=addSegment" role="button">Adicionar
						novo segmento</a>
			</div>
		</div>
		<div class="container">
			<div class="row justify-content-center">

				<c:forEach items="${segments}" var="segment">

					<div
						class="col-md-3 mb-5 text-center border rounded mx-3 py-3">
						<h2>${segment.name}</h2>
						<p>
							<form:form action="${contextPath}/segment/${segment.id}"
								method="delete">
								<a class="btn btn-primary"
									href="${contextPath}/segment/${segment.id}" role="button"><i
									class="fas fa-eye"></i></a>
								<a class="btn btn-info ml-2"
									href="${contextPath}/segment/form?page=editSegment&id=${segment.id}"
									role="button"><i class="fas fa-edit"></i></a>
								<button type="submit" value="Excluir"
									class="btn btn-danger ml-2" class="fas fa-trash">
									<i class="fas fa-trash"></i>
								</button>
							</form:form>

						</p>
					</div>

				</c:forEach>

			</div>
			<hr>
		</div>
		<!-- /container -->
	</main>

	<footer class="container">
		<p>&copy; TheGoodBot - PS FIAP N2020</p>
	</footer>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>