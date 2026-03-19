package ru.shagaev;


/**
 * Класс-контейнер для хранения целых чисел.
 * Реализован на основе динамически расширяемого массива.
 * Позволяет добавлять, извлекать и удалять элементы, также реализованы методы удаления и проверки на пустоту.
 * * @author Shagaev
 * @version 1.0
 */
public class container {
    
	/** Внутренний массив для хранения данных. */
    private int[] elements;
    
    /** Текущее количество элементов в контейнере. */
    private int index;
    
    /** Вместимость массива по умолчанию. */
    private int DEFAULT = 10;

    
    /**
     * Конструктор по умолчанию.
     * Создает новый контейнер с начальной вместимостью 10 элементов.
     */
    public container() 
    {
        this.elements = new int[DEFAULT];
        this.index = 0;
    }

    
    /**
     * Добавляет новый элемент в конец контейнера.
     * Если массив заполнен, его размер автоматически увеличивается вдвое.
     * * @param element целое число, которое нужно добавить.
     */
    public void add(int element) 
    {
        if (index == elements.length) 
        {
            grow();
        }
        elements[index] = element;
        index++;
    }
    
    
    /**
     * Удаляет последний добавленный элемент из контейнера.
     * Если контейнер пуст, операция игнорируется.
     */
    public void pop()
    {
    	if(this.isExist())
    	{
    		elements[index - 1] = 0;
    		index--;
    	}
    }
    
    
    /**
     * Полностью очищает контейнер, удаляя все элементы.
     */
    public void del()
    {
    	while(this.isExist())
    	{
    		this.pop();
    	}
    }
    
    
    /**
     * Проверяет, содержит ли контейнер хотя бы один элемент.
     * * @return true, если контейнер не пуст; false в противном случае.
     */
    public boolean isExist()
    {
    	if(index==0)
    	{
    		return false;
    	}
    	return true;
    }

   
    /**
     * Возвращает текущее количество элементов в контейнере.
     * * @return количество элементов.
     */
    public int size() 
    {
        return index;
    }
    
    
    /**
     * Извлекает элемент по указанному индексу.
     * * @param i индекс элемента (от 0 до size-1).
     * @return значение элемента по указанному индексу.
     * @throws IndexOutOfBoundsException если переданный индекс выходит за границы массива.
     */
    public int get(int i) {
        if (i < 0 || i >= index) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        return elements[i];
    }
    
    
    /**
     * Выводит все элементы контейнера в консоль в одну строку.
     */
    public void print()
    {
    	for(int i = 0;i < this.size();i++)
    	{
    		System.out.print(elements[i] + " ");
    	}
		System.out.println();

    }

    
    /**
     * Приватный метод для увеличения вместимости массива.
     * Увеличивает размер внутреннего хранилища в два раза.
     */
    private void grow() 
    {
        int newSize = elements.length * 2;
        int[] newElements = new int[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}