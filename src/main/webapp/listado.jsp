<!Doctype html>
<!-- directiva para importar clases-->
<%@page import="ar.com.codoacodo.domain.Producto"%>
<%@page import="java.util.List"%>
<html lang="es">
	<head>
		<jsp:include page="styles.jsp"/>
	</head>
	<!-- codigo html para mostrar la tabla que viene desde el controller-->
	<body>
		<!-- aca va el navbar.jsp -->
		<jsp:include page="navbar.jsp"/>
		<main class="container my-3">
			<h1>Listado de Producto</h1>
			<section class="table-responsive">
				<table class="table table-striped">
				  <caption>Lista de productos</caption>
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">C&oacute;digo</th>
				      <th scope="col">T&iacute;tulo</th>
				      <th scope="col">Precio</th>
				      <th scope="col">Fecha Alta</th>
				      <th scope="col">Autor</th>
				      <th scope="col">Imagen</th>
				      <th scope="col">&nbsp;</th>
				    </tr>
				  </thead>
				  <tbody>
				  <% //scriplet
				  	//en las jsp existe un objeto llamado request que esta implicito
				  	//capurar/bajar/obtener la lista que guardamos en el controller
				  	List<Producto> listado = (List<Producto>)request.getAttribute("productos");
				  	for(Producto p : listado) {
				  %>
				    <tr>
				      <th scope="row"><%=p.getId()%></th>
				      <td><%=p.getCodigo()%></td>
				      <td><%=p.getTitulo()%></td>
				      <td><%=p.getPrecio()%></td>
				      <td><%=p.getFechaAlta()%></td>
				      <td><%=p.getAutor()%></td>
				      <td><%=p.getImg()%></td>
				      <td class="align-middle"> 
					    <div class="d-flex">
							<a class="btn btn-warning flex-fill me-2" role="button" href="<%=request.getContextPath()%>/EditarProductoController?id=<%=p.getId()%>">Editar</a>
				      		<!--el modal sirve para largar la confirmación-->
							<button type="button" class="btn btn-danger flex-fill" 
								data-bs-toggle="modal" 
								data-bs-target="#modalEliminar" 
								onclick="setProductoId(<%=p.getId()%>)">
							  Eliminar
							</button>				      
					    </div>
					  </td>
				    </tr>
				  <%
				  	}
				  %>				    
				  </tbody>
				</table>
			</section>
		</main>
		<!-- Modal -->
		<div class="modal fade" id="modalEliminar" tabindex="-1" aria-labelledby="labelModalEliminar" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    	<form action="<%=request.getContextPath()%>/DeleteProductoController">
		    	  <input type="hidden" name="idProducto" id="idProducto">
			      <div class="modal-header">
			        <h5 class="modal-title" id="labelModalEliminar">Eliminar Producto</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        ¿Confirma que desea eliminar? 
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
			        <button type="submit" class="btn btn-danger">Eliminar</button>
			      </div>
		    	</form>
		    </div>
		  </div>
		</div>
		<jsp:include page="scripts.jsp"/>
		<script>
			function setProductoId(id) {
				document.getElementById('idProducto').value=id;
			}
		</script>
	</body>
	
</html>