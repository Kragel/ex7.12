package com.company;

public class Stem2 extends Root2 {
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;
    Stem2()
    {
        super();
        System.out.println("Stem2()");
        c1stem = new Component1();
        c2stem = new Component2();
        c3stem = new Component3();
    }
}
