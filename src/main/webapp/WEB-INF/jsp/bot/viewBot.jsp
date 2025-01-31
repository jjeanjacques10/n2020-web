<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
				class="btn my-2 mx-5 btn-outline-primary active "
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
				<div class="md-5 mb-5">
					<form>
						<div class="form-group row">
							<label for="name">Nome do Bot</label> <input type="text"
								class="form-control" id="name" value="${bot.name}" readonly>
						</div>
						<div class="form-group row">
							<label for="welcome_message">Mensagem de boas vindas</label>
							<textarea class="form-control" id="mBoasVindas" readonly>${bot.welcome_message}</textarea>
						</div>
						<div class="form-group row">
							<label for="farewell_message">Mensagem de despedida</label>
							<textarea class="form-control" id="farewell_message" readonly>${bot.farewell_message}</textarea>
						</div>
						<div class="form-group row">
							<label for="default_answer">Resposta padrão</label>
							<textarea class="form-control" id="default_answer" readonly>${bot.default_answer}</textarea>
						</div>
						<div class="form-group row mb-4">
							<label for="tempo">Tempo até que o bot desconecte por
								ausÃªncia</label> <input type="number" class="form-control"
								id="downtime" value="${bot.downtime}" readonly>
						</div>
						<div class="form-group row mb-4">
							<label for="tempo">Segmentos</label>
							<ul>
								<c:forEach items="${bot.segments}" var="segment">
									<li>${segment.name}</li>
								</c:forEach>
							</ul>
						</div>
						<div class="row">
							<a class="btn btn-primary btn-lg btn-block"
								href="${contextPath}/bot">Voltar</a>
						</div>

					</form>
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