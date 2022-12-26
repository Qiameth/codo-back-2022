<%@page import="ar.com.codoacodo.domain.Producto"%>
<%
	Producto p = (Producto)request.getAttribute("producto");
%>
<!Doctype html>
<html>
	<head>
		<jsp:include page="styles.jsp"/>
	</head>
	<body>
		<jsp:include page="navbar.jsp"/>
		<main class="container my-3">
			<h1>Editar Producto</h1>
			<div class="row">
				<div class="col-12">
					<form class="row g-3 needs-validation" novalidate
						action="<%=request.getContextPath()%>/EditarProductoController"
						autocomplete="off"
						method="POST">
					  <input type="hidden" name="id" value="<%=p.getId()%>">
					  <div class="col-md-4">
					    <label for="validationCustom01" class="form-label">
					    	C&oacute;digo
					    </label>
					    <input type="text"
					    	readonly="readonly"
					    	name="codigo" 
					    	class="form-control" 
					    	id="validationCustom01" 
					    	value="<%=p.getCodigo()%>" 
					    	required>
					    <div class="valid-feedback">
					      Looks good!
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">T&iacute;tulo</label>
					    <input type="text"
					    	name="titulo" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="<%=p.getTitulo()%>" 
					    	required>
					    <div class="valid-feedback">
					      Looks good!
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">Precio</label>
					    <input type="number"
					    	name="precio" 
					    	class="form-control" 
					    	id="validationCustom02"
					    	value="<%=p.getPrecio()%>" 
					    	required>
					    <div class="valid-feedback">
					      Looks good!
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom03" class="form-label">Fecha Alta</label>
					    <input type="date"
					    	name="fechaAlta" 
					    	readonly="readonly"
					    	class="form-control" 
					    	id="validationCustom03"
					    	value="<%=p.getFechaAlta()%>"
					    	required>
					    <div class="invalid-feedback">
					      Provea una fecha válida.
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom04" class="form-label">Autor</label>
					    <input type="text"
					    	name="autor" 
					    	class="form-control" 
					    	id="validationCustom03"
					    	value="<%=p.getAutor()%>" 
					    	required>
					    <div class="invalid-feedback">
					      Provea un autor válido.
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom05" class="form-label">Imagen</label>
					    <div class="input-group">
						  <input type="file"
						  	name="img" 
						  	class="form-control" 
						  	id="inputGroupFile04" 
						  	value="<%=p.getImg()%>"
						  	aria-describedby="inputGroupFileAddon04" 
						  	aria-label="Upload">
						</div>
					    <div class="invalid-feedback">
					      Provea una imagen válida.
					    </div>
					  </div>
					  <hr class="bg-secondary border-2 border-top border-secondary mt-3 col-11 m-auto">
					  <div class="d-flex flex-wrap justify-content-evenly col-12 mt-2">
					    <button class="col-2 btn btn-primary px-4 py-2 col-5" type="submit">Editar</button>
					    <button type="button" class="btn btn-success px-4 py-2 col-5" onclick="window.history.back();">Volver</button>
					  </div>
					  <hr class="bg-secondary border-2 border-top border-secondary mt-2 col-11 m-auto">
					</form>
				</div>
			</div>
		</main>
	</body>
</html>