package com.smartcompute.scalabyexamples

import scala.collection.mutable.ArrayBuffer

object ScalaTutorial{
		def main(args: Array[String]){
	
			var i = 0
			val rendletter = "ABCDEFGH"
			for(i <- 0 until rendletter.length)
				println(rendletter(i));
				
			for (i <-1 to 10)
				println(i);
				
			val aList = List(1,2,3,4,5)
			for(i <- aList){
				println("list item " + i)
			}
			
			var j = 0
			var evenList = for{ j <- 1 to 20 
				if(j % 2) == 0 
				} yield j
			
			for( i <- evenList)
				println("even number" + i)
				
			i=0
			while(i<10){
				print(i)
				i+=1
			}
				
			myFunction
			println("get sum " + getSum(1,2,3,4,5,6,7,8,9))
			println("factorial of 5 is : " + factorial(5))
			
			
			
			val favNums = new Array[Int](20)
			val friends = Array ("Bob" , "Tom")
			
			friends(0) = "Sue"
			
			println("Best friend " + friends(0))
			
			val freiends2 = ArrayBuffer[String]()
			freiends2.insert(0,"phil")
			
			for(s <- freiends2){
			  println(s)
			}
			
			println("totalFunctional:" + totalFunctional(List(1,2,3,4,5)))
			
			println("totalIterator:" + totalIterator(List(1,2,3,4,5)))
			println("totalEven:" + totalEven(List(1,2,3,4,5)))
			
			println("sum of all : " +  
			    totalSelectValues(List(1,2,3,4,5),{e => true}));
			
		  println("sum of even numbers : " +  
		      totalSelectValues(List(1,2,3,4,5),{e => (e % 2 == 0)}));
						
		  println("sum of  numbers > 4: " +  
		      totalSelectValues(List(1,2,3,4,5),{ e => (e > 4)}));
		}
		
		def myFunction(){
			println("this is first function")
		}
		
		
		def getSum(args : Int*) : Int = {
			var sum : Int = 0
			for(num <- args){
				sum +=num;
			}
			sum
		}
		
		def factorial(num : BigInt) : BigInt = {
			if(num <= 1){
				1
			}else{
				num * factorial(num -1)
			}
		}

		/* function programming		
		1.assignment less programming
		2.functions do not have side effect  --> referential transparency
		3.function is a first class citizen
		    i.	you can create function within i function
		    ii.	you can pas functions to functions
		    iii.you can return a function from a function
		4.
		
		
		*/
		def totalFunctional(list : List[Int]) = {
		  list.foldLeft(0){(carryover,e) =>
		      carryover + e
		  }
		}
		
		def totalIterator(list : List[Int]) = {
		  var sum = 0
		  list.foreach { e => sum += e }
		  sum
		}
		
		def totalEven(list : List[Int]) = {
		  var sum = 0
		  list.foreach { e => if(e%2 == 0) sum += e }
		  sum
		}
		
		def totalSelectValues(list : List[Int],selector : Int => Boolean) = {
		  var sum = 0
		  list.foreach { e => 
		    if(selector(e)) {sum += e} 
		  }
		  sum
		}
				
				
		
		
		
		

		
		
		
		
		
		
		
		
		
	}