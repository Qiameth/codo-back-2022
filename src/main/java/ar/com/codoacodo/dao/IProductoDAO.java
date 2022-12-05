package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Producto;

public interface IProductoDAO {

	/* define los métodos de acceso a la tabla PRODUCTOS */
	/* CRUD: CREATE */

	// select * from producto where id = id
	public Producto getById(Long id) throws Exception;

	// como es findAll, no requiere condictión
	// select * from producto
	public List<Producto> findAll() throws Exception;

	// le decimos qué vamos a eliminar
	// delete from producto where id = id
	public void delete(Long id) throws Exception;

	// va a venir con un identificador desde afuera
	// update producto
	// set campo1 =valor1 ...etc
	// where id = producto.id
	public void update(Producto producto) throws Exception;

	// insert into producto (campo1,..., campoN)
	// values()newProducto.campo1, ..., newProducto.campoN)
	public void create(Producto newProducto) throws Exception;

}
