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
			<a class="btn my-2 mx-5 btn-outline-primary " style="color: white;"
				href="${contextPath}/bot/">Listar Bots</a> <a
				class="btn my-2 mx-5 btn-outline-primary"
				style="color: white;" href="${contextPath}/bot/form?page=addBot">Adicionar
				Bot</a> <a class="btn my-2 mx-5 btn-outline-primary "
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
						gerenciamento dos bots do TheGoodBot N2020 - PS FIAP</p>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-5 mb-5">
					<form:form modelAttribute="segmentModel" action="${contextPath}/segment"
						method="post">
						<spring:hasBindErrors name="segmentModel">
							<div class="alert alert-danger" role="alert">
								<form:errors path="*" class="has-error" />
							</div>
						</spring:hasBindErrors>
						<div class="form-group row">
							<label for="name">Nome do Segmento</label>
							<form:input type="text" path="name" name="name" id="name"
								class="form-control" maxlength="40" size="40" />
							<font color="red"><form:errors path="name" /></font><br />
						</div>
						
						<div class="form-group row">
							<label for="name">Relacionado com</label>                     
	                        <form:select path="bot.id" class="form-control custom-select">
	                        	<form:options items="${bots}" itemValue="id" itemLabel="name" />
	                        </form:select>
						</div>
			
						<div class="row">
							<button type="submit" class="btn btn-primary btn-lg btn-block">Salvar</button>
						</div>
						<br>
						<div class="row">
							<a class="btn btn-lg btn-block"
								href="${contextPath}/segment">Voltar</a>
						</div>
					</form:form>
				</div>
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