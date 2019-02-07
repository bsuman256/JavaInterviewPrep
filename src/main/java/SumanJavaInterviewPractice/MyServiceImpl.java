package mymockitoproject;

import java.util.List;

public class MyServiceImpl {

    public MyService myService;

    public MyServiceImpl(MyService myService) {
        this.myService = myService;
    }


    List<String> listMyTods(){
        List<String> listtods=myService.todos();

        return listtods;

    }
}
