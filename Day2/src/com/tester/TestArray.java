package com.tester;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		while(true) {
			System.out.println("1.Show Array\n2. Add Element\n3. Search Element\n4. Double Array Element\n5. Sort Array");
			System.out.println("Enter Choice: ");
			switch(sc.nextInt()) {
			case 1:
				for(int c : arr) {
					System.out.println(c);
				}
				break;
			
			case 2:
				System.out.println("Enter the index and element");
				int index = sc.nextInt(), element = sc.nextInt();
				if(index < size && index >= 0) {
		            arr[index] = element;
		        } else {
		            System.out.println("Index out of bounds");
		        }
				break;
				
			case 3:
				System.out.println("Enter the element");
				element = sc.nextInt();
				for(int i = 0;i<size;i++) 
					if(arr[i] == element)
						System.out.println("Element at index: " + i);
				break;
				
			case 4:
				for(int a: arr) {
		            a *= 2;
		        }
				break;
				
			case 5:
				Arrays.sort(arr);
				break;
				
		    }
				
				
			}
		}
	}


