package com.self.programs;

public class Construction_order {

    private int bags = 1;

    public int getBags() {
        return bags;
    }

    {
        bags = 10;
    }

   public Construction_order() {
        bags = 50;
    }


}

/*

1. Instance block code is invoked for every instance( object) created.
2. Static block code is invoked only for once  i.e  when the first object is created.

Order:
 static block > instance block > constructor

 */