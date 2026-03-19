package ru.shagaev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class containerTest 
{

    @Test
    void testInitial() 
    {
        container container = new container();
        
        assertEquals(0, container.size());
        assertFalse(container.isExist());
    }

    @Test
    void testAddElem() 
    {
        container container = new container();
        container.add(42);
        container.add(99);

        assertEquals(2, container.size());
        assertTrue(container.isExist());
        assertEquals(42, container.get(0));
        assertEquals(99, container.get(1));
    }

    @Test
    void testDynamicResizing() 
    {
        container container = new container();
        for (int i = 0; i < 15; i++) 
        {
            container.add(i);
        }

        assertEquals(15, container.size());
        assertEquals(14, container.get(14));
    }

    @Test
    void testPop() 
    {
        container container = new container();
        container.add(10);
        container.add(20);
        
        container.pop();
        
        assertEquals(1, container.size());
        assertEquals(10, container.get(0));
    }

    @Test
    void testPopOnEmpty() 
    {
        container container = new container();
        container.pop(); 
        
        assertEquals(0, container.size());
    }

    
}