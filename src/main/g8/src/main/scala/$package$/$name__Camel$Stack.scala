package $package$

import org.scalatra._
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._

trait $name;format="Camel"$Stack extends ScalatraServlet with NativeJsonSupport {

  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }
}
