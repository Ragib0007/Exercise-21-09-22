package com.aut.dll;

public class TestBook {
	public static void main(String args[]) {
		//Author's Detail
		Author author = new Author("Robert Kiyosaki ","robert123@gmail.com");
		System.out.println("\n");
        System.out.println("********************************");
        System.out.println(author);
        System.out.println("********************************");

        System.out.println("\n");
        System.out.println("********************************");

        //Book Detail
        Book book = new Book("1543626610","Rich Dad And Poor Dad ",author,500.78,40);
       
        System.out.println("Book name : "+ "''"+book.getName()+" , Book isbn : "+ "''"+book.getIsbn() +"''" + " by " +book.getAuthor() +"\n\n\n" +"Book Price :"
        		+book.getPrice() +"\t"+ "Qty :" + book.getQty() );
        System.out.println("********************************");
	}

}
