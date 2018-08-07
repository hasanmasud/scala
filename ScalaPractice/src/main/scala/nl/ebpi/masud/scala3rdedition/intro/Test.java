package nl.ebpi.masud.scala3rdedition.intro;

import java.util.ArrayList;
import java.util.List;


// generic collections are invarient when it comes to subtyping

public class Test {

    public static void main(String... args) {

        List<A> aList = new ArrayList();
        List<B> bList = new ArrayList();

        // invarient
        //aList = bList;

        A a = null;
        B b = null;

        // covarient
        a = b;

        A aArray[] = new A[10];
        B bArray[] = new B[10];

        aArray = bArray;

    }


}


class A {

}


class B extends A {

}
