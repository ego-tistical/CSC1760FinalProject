package csc1760FinalProject;

import java.util.Scanner;

public class Main {	
	
	public static void mainMenu() {
		System.out.println("-----------------");
		System.out.println("--- Main Menu ---");
		System.out.println("-----------------");
		System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Volume");
        System.out.println("3. Draws a rectangle");
        System.out.println("4. Exit");
        System.out.print("Insert selection: ");
	}
	
	public static void areaMenu() {
		System.out.println("-----------------");
		System.out.println("--- Area Menu ---");
		System.out.println("-----------------");
		System.out.println("a. Rectangle");
        System.out.println("b. Circle");
        System.out.println("c. Right Triangle");
        System.out.println("d. Main Menu");
        System.out.print("Insert selection: ");
	}
	
	public static void volumeMenu() {
		System.out.println("--- Volume Menu ---");
		System.out.println("a. Cylinder");
        System.out.println("b. Sphere");
        System.out.println("c. Main Menu");
        System.out.print("Insert selection: ");
	}
	
	
	public static void main(String[] args) {
		int choice;
		
		mainMenu();
		
		Scanner in = new Scanner(System.in);
		
		choice = in.nextInt();
		
		while(choice != 4) {
			
			if (choice == 1) {
				areaMenu();
				Scanner sc = new Scanner(System.in);
				char selection = sc.next().charAt(0);
				
				
				switch (selection) {
	            case 'a': 
	            	Scanner input = new Scanner(System.in);
	            	System.out.print("Please enter rectangle height: ");
	            	double height = input.nextDouble();
	            	System.out.print("Please enter rectangle width: ");
	            	double width = input.nextDouble();
	            	System.out.println("The area of the rectangle is " + width*height);
	            	break;
	            case 'b': 
	            	Scanner input1 = new Scanner(System.in);
	            	System.out.print("Please enter the radius of the circle: ");
	            	double radius = input1.nextDouble();
	            	System.out.println("The area of the circle is " + (radius*radius)*Math.PI);
	            	break;
	            case 'c': 
	            	Scanner input2 = new Scanner(System.in);
	            	System.out.println("Please the base length of the right triangle: ");
	            	double base = input2.nextDouble();
	            	System.out.println("Please enter height of the right triangle: ");
	            	double height1 = input2.nextDouble();
	            	System.out.println("The area of the right triangle is " + (base*height1)/2);
	            	break;
	            default:
	                System.out.println("Invalid Selection!!");
				}
			}else if (choice == 2) {
				volumeMenu();
				Scanner sc = new Scanner(System.in);
				char selection = sc.next().charAt(0);
				
				switch (selection) {
				case 'a': 
                	Scanner input2 = new Scanner(System.in);
            		System.out.println("Please enter the radius of the cylinder: ");
            		double radius = input2.nextDouble();
            		System.out.println("Please enter the height of the cylinder: ");
            		double height2 = input2.nextDouble();
            		System.out.println("The area of the cylinder " + ((2*Math.PI*Math.pow(radius, 2)) + 
            				(2*Math.PI*radius*height2)));
            		break;
				case 'b': 
                	Scanner input3 = new Scanner(System.in);
                	System.out.println("Please the radius of the sphere: ");
                	double radius1 = input3.nextDouble();
                	System.out.println("The area of the cylinder " + (4/3) * Math.PI * Math.pow(radius1, 3));
                	break;
				case 'c':
					break;
				default:
	                System.out.println("Invalid Selection!!");
				}
			}else if (choice == 3) {
				System.out.println("--- Drawing Rectangle ---");
	    		Scanner sc = new Scanner(System.in);
	    		System.out.print("Please enter the length of the rectangle: ");
	    		int length = sc.nextInt();
	    		System.out.print("Please enter the width of the rectangle: ");
	    		int width = sc.nextInt();
	    		for(int r=0; r<length; r++) {
	    			if(r==0 || r==length-1) {
	    				for (int i=0 ; i<width ; i++) {
	    					if(r==0 && i==0) {
	    						System.out.print("\u250C");
	    					}else if(r==0 && i==width-1) {
	    						System.out.print("\u2510");
	    					}else if (r==length-1 && i==0) {
	    						System.out.print("\u2514");
	    					}else if (r==length-1 && i==width-1) {
	    						System.out.print("\u2518");
	    					}else {
	    						System.out.print("\u2500");
	    					}
	    				}
	    				System.out.println();
	    			}else {
	    				for (int i=0; i<width ; i++) {
	    					if(i == 0) {
	    						System.out.print("\u2502");
	    					}else if (i == width-1) {
	    						System.out.println("\u2502");
	    					}else {
	    						System.out.print(" ");
	    					}
	    				}
	    			}
	    		}
			}else {
				System.out.println("-Please enter valid selection!-");
			}
			mainMenu();
			choice = in.nextInt();
		}
		System.out.println("Thank you for using our program!");

	}

}
