package com.self.programs;

public class Constructor_1 {
    private int redbags;
    private int yelbags;

    public Constructor_1(int redbags){
        this.redbags=redbags;
    }

    public Constructor_1(int redbags,int yelbags){
        this(redbags);          // Calling 1st Constructor
        this.yelbags=yelbags;
    }


    public int getRedbags(){
        return redbags;
    }

    public int getYelbags(){
        return yelbags;
    }
}
