package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("beanCliente", Cliente.class);
		Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		Cliente cliente3 = context.getBean("beanCliente3", Cliente.class);
		
		Producto producto = context.getBean("beanProducto", Producto.class);
		Producto producto2 = context.getBean("beanProducto2", Producto.class);
		Producto producto3 = context.getBean("beanProducto3", Producto.class);
		Producto producto4 = context.getBean("beanProducto4", Producto.class);
		Producto producto5 = context.getBean("beanProducto5", Producto.class);
		
		Factura factura = context.getBean("beanFactura", Factura.class);
		Factura factura2 = context.getBean("beanFactura2", Factura.class);
		
		FacturaDetalle facturadetalle = context.getBean("beanFacturaDetalle", FacturaDetalle.class);
		FacturaDetalle facturadetalle2 = context.getBean("beanFacturaDetalle", FacturaDetalle.class);	
		
		
		cliente.setIdCliente(1);
		cliente.setCedula("8127389712");
		cliente.setNombre("Luis");
		cliente.setApellido("Jimenez");
		cliente.setEdad(25);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Guayaquil");
		cliente.setTelefono("092321312332");
		cliente.setCorreo("jimenez@ismac.com");
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("183129839021");
		cliente2.setNombre("Luis");
		cliente2.setApellido("Cando");
		cliente2.setEdad(21);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("Loja");
		cliente2.setTelefono("02213123");
		cliente2.setCorreo("cando@ismac.com");
		
		cliente3.setIdCliente(3);
		cliente3.setCedula("173712893789");
		cliente3.setNombre("Sabrina");
		cliente3.setApellido("Loor");
		cliente3.setEdad(22);
		cliente3.setFechaNacimiento(new Date());
		cliente3.setDireccion("Tulcan");
		cliente3.setTelefono("029821903");
		cliente3.setCorreo("sabrina@ismac.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(29.10);
		factura.setIva(0.12);
		factura.setTotal(31.50);
		
		factura2.setIdFactura(2);
		factura2.setNumFactura("FAC-002");
		factura2.setFecha(new Date());
		factura2.setTotalNeto(48.15);
		factura2.setIva(0.12);
		factura2.setTotal(50.90);
		
		producto.setIdProducto(1);
		producto.setNombre("Frutilla");
		producto.setDescripcion("Caja de frutilla");
		producto.setPrecio(11.99);
		producto.setStock(100);
		
		producto2.setIdProducto(2);
		producto2.setNombre("Limones");
		producto2.setDescripcion("Caja de limones");
		producto2.setPrecio(3.99);
		producto2.setStock(100);
		
		producto3.setIdProducto(3);
		producto3.setNombre("Mandarina");
		producto3.setDescripcion("Libra de Uvas");
		producto3.setPrecio(4.99);
		producto3.setStock(100);
		
		producto4.setIdProducto(4);
		producto4.setNombre("Lechuga");
		producto4.setDescripcion("Hoja de lechuga");
		producto4.setPrecio(1.99);
		producto4.setStock(100);
		
		producto5.setIdProducto(5);
		producto5.setNombre("Fresa");
		producto5.setDescripcion("Caja de fresa");
		producto5.setPrecio(11.99);
		producto5.setStock(100);
		
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(5);
		facturadetalle.setFactura(factura);
		
		facturadetalle2.setIdFacturaDetalle(2);
		facturadetalle2.setCantidad(10);
		facturadetalle2.setFactura(factura2);
	
		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());
		System.out.println(factura2.toString());
		System.out.println(facturadetalle2.toString());
		
					
		context.close();

	}

}
