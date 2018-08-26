package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Audio;
import bean.Book;
import bean.MediaItem;
import exception.ItemException;
import validate.DataValidator;

public class BookManiaLibrary implements Library{
	List<MediaItem> l=new ArrayList<MediaItem>();
	
	public BookManiaLibrary() {
		super();
		MediaItem e=new Book("Java",100.0d,2010,"Head First");
		MediaItem m=new Audio("C++",100.0d,2011,"Aaron");
		this.l.add(e);
		this.l.add(m);
	}

	@Override
	public boolean searchItemById(int id) throws ItemException {
		for(int i=0;i<l.size();i++){
			if(l.get(i).getId()==id)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<MediaItem> getItems() {
		System.out.println("Id\t\tTitle\t\tPrice\t\tYear\t\tAuthor\\Artist");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i).toString());
		}
		return null;
	}

	@Override
	public MediaItem updateItem(int id) throws ItemException {
		Scanner sc3=new Scanner(System.in);Scanner sc4=new Scanner(System.in);
		int year; String st; double d;
		for(int i=0;i<l.size();i++){
			if(id==l.get(i).getId())
			{
				System.out.println("Select option:\n1. Update Title\n2. Update Price\n3. Update Year");
				int choice1=sc3.nextInt();
			switch(choice1){
				case 1: 
					do{
						System.out.println("Enter the new Title:");
				st=sc4.nextLine();
				if(!DataValidator.validateTitle(st))
				{
					System.out.println("\nEnter a valid Title");
				}
				}while(!DataValidator.validateTitle(st));
				l.get(i).setTitle(st);
				break;
				case 2: System.out.println("Enter the new price:");
				d=sc3.nextDouble();
				l.get(i).setPrice(d);
				break;
				case 3: System.out.println("Enter the new year:");
				year=sc3.nextInt();
				l.get(i).setYear(year);	
				break;
				default: System.out.println("Invaid choice!!");
				break;
				}
			}
		}
		return null;
	}

	@Override
	public boolean deleteItem(int id) throws ItemException {
		for(int i=0;i<l.size();i++){
			if(l.get(i).getId()==id)
			{
				l.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void addItem(MediaItem m) {
			this.l.add(m);
	}

}
