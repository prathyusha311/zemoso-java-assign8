package com.labs.zemoso;

public class Demo {

    public void throwExceptions(int a) throws MyException1, MyException2, MyException3 {

        if(a>100)
            throw new MyException1("input gretaer than 100");
        else if(a>50)
            throw new MyException2("input greater than 50");
        else if(a>10)
            throw new MyException3("input greater than 10");

    }
}
