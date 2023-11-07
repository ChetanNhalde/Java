package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public interface ProductIOUtils {
	
	static void writeProductDetailsinFile(Map<Integer,Product> mp,String category, String fname)throws IOException {
		try(PrintWriter pw = new PrintWriter(new FileWriter(fname))) {
		mp.values().stream()
		.filter( s -> s.getProductCategory() == Category
		.valueOf(category.toUpperCase()))
		.forEach(pw::println);
		
		}
		
		
	}

}
