package $package$

import org.scalatra.test.scalatest._
import org.scalatest.FunSpec

// For more on ScalaTest, see http://www.scalatest.org/quick_start
class $servlet_name$Spec extends ScalatraSuite with FunSpec {
  addServlet(classOf[$servlet_name$], "/*")

  describe("GET / on $servlet_name$") {
    it("should return status 200") {
      get("/") {
        status should be (200)
      }
    }
  }
}
