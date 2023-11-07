package com.tester;
import com.shop.core.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static utils.ShopUtils.*;
import static utils.ProductIOUtils.writeProductDetailsinFile;

public class TesterShop {
	public static void main(String[] args) {
		List<Product> ls = populateProductList();
		Map<Integer,Product> mp = populateProductMap(ls);
		
		
		try(Scanner sc = new Scanner(System.in)) {
			writeProductDetailsinFile(mp, sc.nextLine(),sc.nextLine());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
