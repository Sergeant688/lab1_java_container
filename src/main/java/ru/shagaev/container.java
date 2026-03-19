package ru.shagaev;

public class container {
    
    private int[] elements;
    private int index;
    private int DEFAULT = 10;

    
    public container() 
    {
        this.elements = new int[DEFAULT];
        this.index = 0;
    }

    public void add(int element) 
    {
        if (index == elements.length) 
        {
            grow();
        }
        elements[index] = element;
        index++;
    }
    
    public void pop()
    {
    	if(this.isExist())
    	{
    		elements[index - 1] = 0;
    		index--;
    	}
    }
    
    public void del()
    {
    	while(this.isExist())
    	{
    		this.pop();
    	}
    }
    
    public boolean isExist()
    {
    	if(index==0)
    	{
    		return false;
    	}
    	return true;
    }

   
    public int size() 
    {
        return index;
    }
    
    
    public int get(int i) {
        if (i < 0 || i >= index) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        return elements[i];
    }
    
    public void print()
    {
    	for(int i = 0;i < this.size();i++)
    	{
    		System.out.print(elements[i] + " ");
    	}
		System.out.println();

    }

    private void grow() 
    {
        int newSize = elements.length * 2;
        int[] newElements = new int[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}