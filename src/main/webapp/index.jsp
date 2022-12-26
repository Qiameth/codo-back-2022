<!Doctype html>
<html>
	<head>
	<jsp:include page="styles.jsp" />
		<script type="text/javascript">
					function verListado() {
						//http://localhost:8080/app-web/FindAllProductoController
						window.location = '<%=request.getContextPath()%>
			/FindAllProductoController';
			}
		</script>
	</head>
	<body>
		<!-- aca va el navbar.jsp -->
		<jsp:include page="navbar.jsp" />
		<main class="container my-3">
			<section>
				<h1>Administrador de la base de datos 22569</h1>
				<h2>Tabla productos</h2>
				<i class="fas fa-home"></i>
				<br>
				<a type="button" class="btn btn-success px-4 py-2" href="<%=request.getContextPath()%>/FindAllProductoController">Ver listado</a>
			</section>
		</main>
		<jsp:include page="scripts.jsp" />
	</body>
</html>