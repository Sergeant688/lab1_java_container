package ru.shagaev;

public class main {
	
	public static void main(String[] args) 
	{
        container container = new container();
        
        for(int i = 0;i < 15;i++)
        {
        	container.add(i);
        }
        
        System.out.print("Кол-во элементов в контейнере:");
        System.out.println(container.size());
        
        container.pop();
        
        System.out.print("Кол-во элементов в контейнере:");
        System.out.println(container.size());
        
        container.print();
        
        System.out.println(container.isExist());
        
        container.del();
        
        System.out.print("Кол-во элементов в контейнере:");
        System.out.println(container.size());
        
        System.out.println(container.isExist());

    }
}
