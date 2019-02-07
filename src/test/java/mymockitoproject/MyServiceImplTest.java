package mymockitoproject;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyServiceImplTest {

    MyServiceImpl myServiceImpl;
    MyService myServiceMock;
    @Before
    public void setUp(){
        myServiceMock = mock(MyService.class);
        myServiceImpl = new MyServiceImpl(myServiceMock);
    }

    @Test
    public void testTodos(){

        List<String> todosList = Arrays.asList("Grocery Shopping","Car Service","Pay Utilities");
        when(myServiceMock.todos()).thenReturn(todosList);
        assertEquals(3,myServiceImpl.listMyTods().size());
        verify(myServiceMock).todos();
    }

}