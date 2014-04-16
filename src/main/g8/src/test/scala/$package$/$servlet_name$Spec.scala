package $package$

import org.scalatra.test.scalatest._

// For more on ScalaTest, see http://www.scalatest.org/quick_start
class $servlet_name$Spec extends ScalatraSpec {
  addServlet(classOf[$servlet_name$], "/*")

  describe("GET / on $servlet_name$") {
    it("should return status 200") {
      get("/") {
        status should be (200)
      }
    }
  }
}
