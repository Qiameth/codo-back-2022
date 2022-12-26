<nav class="navbar navbar-expand-lg navbar-dark bg-dark p-3">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath()%>">
    	<img src="https://www.rawshorts.com/freeicons/wp-content/uploads/2017/01/blue_repicthousebase_1484336386-1.png" alt="home" width="30" height="30" class="d-inline-block align-text-top">
    	Home
    	</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/FindAllProductoController">Listado</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="<%=request.getContextPath()%>/nuevo.jsp">Nuevo Producto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Conocimientos
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/html.jsp">HTML</a></li>
            <li><a class="dropdown-item" href="#">CSS</a></li>
            <li><a class="dropdown-item" href="#">JS</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">DB</a></li>
            <li><a class="dropdown-item" href="#">Java</a></li>
            <li><a class="dropdown-item" href="#">Habilidades Blandas</a></li>
          </ul>
        </li>
      </ul>
      <!-- FORMULARIO DE BUSQUEDA DE PRODUCTOS -->
      <form class="d-flex"
      autocomplete="off"
      	action="<%=request.getContextPath()%>/SearchProductosController">
        <input class="form-control me-2"
        	name="claveBusqueda" 
        	type="search" 
        	placeholder="Búsqueda por título" 
        	aria-label="Search">
        <button class="btn btn-outline-success" type="submit">
        	Buscar
        </button>
      </form>
    </div>
  </div>
</nav>