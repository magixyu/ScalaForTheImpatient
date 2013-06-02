package im.scala
import scala.io.Source
import java.io.PrintWriter

object Ch09 {

	// Ex01
	def reverseFileContent(filename: String) {
		val source = Source.fromFile(filename)
		val out = new PrintWriter("out/01.out")
		source.getLines.toArray[String].reverse.foreach { (line: String) =>
		out.println(line)
		}
		out.close()
	}

	// Ex03
	def findLongerThan(filename: String, length: Int) {
		Source.fromFile(filename).mkString.split("""[\s"\.,\)\()/]+""")
			  .filter(_.length() > 12).foreach(println(_))
	}

	def main(args:Array[String]) = {
		reverseFileContent("files/01.txt")
	}
}