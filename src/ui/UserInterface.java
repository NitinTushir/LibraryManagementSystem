package ui;
import java.util.ArrayList;
import java.util.Scanner;

import bean.Audio;
import bean.Book;
import bean.MediaItem;
import exception.ItemException;
import service.BookManiaLibrary;
import validate.DataValidator;

public class UserInterface {
public static void main(String[] args) throws ItemException{
	BookManiaLibrary bm=new BookManiaLibrary();
	Scanner sc=new Scanner(System.in);Scanner sc1=new Scanner(System.in);Scanner sc2=new Scanner(System.in);
	int choice,year; String st,auth; double d;
	do{
		System.out.println("1. Insert details");
		System.out.println("2. Search item by id");
		System.out.println("3. Update Item");
		System.out.println("4. Display Item");
		System.out.println("5. Delete Item");
		System.out.println("6. Exit");
		choice=sc.nextInt();
	switch(choice){
	case 1:System.out.println("1. Book\n2. Audio\nEnter the choice:");
			int k=sc.nextInt();
			if(k==1)
			{
				do{
				System.out.println("Enter the Title:");
				st=sc1.nextLine();
				if(!DataValidator.validateTitle(st))
				{
					System.out.println("\nEnter a valid Title");
				}
				}while(!DataValidator.validateTitle(st));		
				System.out.println("Enter the price:");
				d=sc.nextDouble();
				System.out.println("Enter the year:");
				year=sc.nextInt();
				System.out.println("Enter the Author:");
				auth=sc1.nextLine();
				MediaItem e=new Book(st,d,year,auth);
				bm.addItem(e);
			}
			else if(k==2)
			{
				System.out.println("Enter the Title:");
				st=sc2.nextLine();
				System.out.println("Enter the price:");
				d=sc.nextDouble();
				System.out.println("Enter the year:");
				year=sc.nextInt();
				System.out.println("Enter the Artist:");
				auth=sc2.nextLine();
				MediaItem e=new Audio(st,d,year,auth);
				bm.addItem(e);
			}
	break;
	case 2:System.out.println("Enter the ID:");
			int id1=sc.nextInt();
			if(bm.searchItemById(id1))
			{
				System.out.println("Item Found!!");
			}
			else
			{
				System.out.println("Invalid ID!!");
			}
	break;
	case 3:System.out.println("Enter the Item ID:");
			int id3=sc.nextInt();
			if(bm.searchItemById(id3))
			{
				bm.updateItem(id3);
				System.out.println("Details Updated successfully!!!");
			}
			else
			{
				System.out.println("Invalid ID!!");
			}
			
		
	break;
	case 4: bm.getItems();
	break;
	case 5: System.out.println("Enter the ID of the Item to be removed:");
			int id2=sc.nextInt();
			if(bm.deleteItem(id2))
			{
				System.out.println("Item removed!!");
			}
			else
			{
				System.out.println("Invalid Item ID!!");
			}
	break;
	case 6:
	System.exit(0);
	default:System.out.println("Wrong choice!!");
	break;
	}
	System.out.println("\n\n");
	}while(choice!=6);
	sc.close();sc1.close();sc2.close();
}
}
