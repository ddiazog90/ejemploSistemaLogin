package model;

public class productDAO implements settings{

	private product product;

	public productDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public productDAO(model.product product) {
		super();
		this.product = product;
	}
	/**
	 * Metodo para realizar el CRUD de un producto
	 * @param operation values of operation 1 -> Insert, 3 -> Update, 4 -> Delete
	 * @return
	 */
	public boolean crudProduct(int operation) {
		boolean value=switch(operation) {
		case 1->conn.setQuery(
				String.format("INSERT INTO empresa1.product VALUES(null,'%s','%s',%d,%s);", 
																		product.getNameProduct(),
																		product.getDescription(),
																		product.getStock(),
																		String.valueOf(product.getPrice())));
		case 3->conn.setQuery("");
		case 4->conn.setQuery("");
		default->false;
		};
		return value;
		
	}
}
