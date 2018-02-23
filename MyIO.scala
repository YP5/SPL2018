import java.io._
import scala.io.Source

//create file, write something
object myCreateFile {
   def main(args: Array[String]) {
      val myFile = new PrintWriter(new File("myTest.txt" ))
      myFile.write("Roger Federer")
      myFile.close()
   }
}

//ask user input
object myUserInput {
   def main(args: Array[String]) {
      println("Type something meaningful: " )
      val line = scala.io.StdIn.readLine()
      
      println("You just typed: " + line + " which is not meaningful at all!")
   }
}

//read a file
object myReadFile {
   def main(args: Array[String]) {
      Source.fromFile("myTest.txt" ).foreach { 
         print 
      }
   }
}
