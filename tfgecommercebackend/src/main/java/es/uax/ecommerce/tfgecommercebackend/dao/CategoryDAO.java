package es.uax.ecommerce.tfgecommercebackend.dao;

import java.util.List;
import es.uax.ecommerce.tfgecommercebackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get (int id);
	

}
