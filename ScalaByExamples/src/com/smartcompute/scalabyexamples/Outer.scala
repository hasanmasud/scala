package com.smartcompute.scalabyexamples

class Outer {
  class Inner{
    private def f(){
      println("this is private f");
      class InnerMost{
        f();
      }
    }
  }
    //(new Inner).f();
}