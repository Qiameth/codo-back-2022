package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IProductoDAO;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;

//una clase que extiendo de HttpServlet
public class FindAllProductoController extends HttpServlet{

	//tienen dos metondos:
	//doGet
	//doPost
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IProductoDAO dao = new ProductoDAOMysqlImpl();
		
		//tengo la lista
		//para solucionar el problema del try catch, creamos un array vacío y luego agregamos el try y el catch
		
		
		List<Producto> productos = new ArrayList<>();
		
		try {
			productos = dao.findAll();//[p1,p2...pN] ctrl+t
		}catch (Exception e) {
			//muestra por pantalla el error que tuvo, si es que lo tiene
			e.printStackTrace();
		}
		
		//antes de irme a la nueva página
		//clave, valor
		req.setAttribute("productos", productos);
				
	
		//este bloque de código lo utilizaremos en todos lados
		//le estamos indicando dónde ir
		getServletContext().getRequestDispatcher("listado.jsp").forward(req, resp);
	}

}

