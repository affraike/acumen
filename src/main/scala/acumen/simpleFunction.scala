package acumen
import org.scalajs.dom
import dom.document

trait example {
    def add10(x:Int): Unit = {
        var sum:Int = 0
        sum = x + 10
         dom.document.getElementsByTagName("textarea")(0).innerHTML = sum.toString;
    }
}