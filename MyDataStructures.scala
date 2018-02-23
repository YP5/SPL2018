import Array._


//create, initialize, process
object Program1 {
   def main(args: Array[String]) {
      var myArr = Array(10.9, 4.5, 6.7, 8.9, 8.9)
      
      // print
      for ( myPrint <- myArr ) {
         println( myPrint )
      }

      // sum
      var mySum = 0.0;
      
      for ( myElement <- 0 to (myArr.length - 1)) {
         mySum += myArr(myElement);
      }
      println(mySum);

      // max
      var myMax = myArr(0);
      
      for ( myElement <- 1 to (myArr.length - 1) ) {
         if (myArr(myElement) > myMax) myMax = myArr(myElement);
      }
      
      println(myMax);
   }
}

//multidimensional array
object Program2 {
	//define main
	def main(args: Array[String]) {
		//initialize vaiables
		val xdim = 10
		val ydim = 7
		var my2DArray = ofDim[Int](xdim,ydim)
      
	    // build a 2D array
      	for (x <- 0 to xdim-1) {
        	for ( y <- 0 to ydim-1) {
            	my2DArray(x)(y) = y;
         		}
      		}
      
      // Print 2D array
      	for (x <- 0 to xdim-1) {
        	for ( y <- 0 to ydim-1) {
            	print(" " + my2DArray(x)(y));
         		}
         	println();
      		}
   		}
	}

//concatenate arrays
object Program3 {
   def main(args: Array[String]) {
      var myArr1 = Array(4.3, 2.5, 6.7)
      var myArr2 = Array(8.0, 7.5, 5.4)
      var myArr3 =  concat(myArr1, myArr2)
      
      // print
      for ( myElement <- myArr3 ) {
         println( myElement )
      }
   }
}
