package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.JloggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.conceretes.Product;

//bir projede entitiyler hariç hiçbiþeyi newleme. ileride problem çýkar
public class Main {

	public static void main(String[] args) {
			//spring IoC ile çözülecek
			ProductService productService = new ProductManager(new AbcProductDao() ,new JloggerManagerAdapter());
			
			Product product = new Product(1, 2, 12, 50, "Elma");
			productService.add(product);
	}

}
