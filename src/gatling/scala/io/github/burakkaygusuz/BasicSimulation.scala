package io.github.burakkaygusuz

import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class BasicSimulation extends Simulation {

  private val httpConfig: HttpProtocolBuilder = http
    .baseUrl("https://jsonplaceholder.typicode.com")
    .contentTypeHeader(HttpHeaderValues.ApplicationJson)

  private val builder: ScenarioBuilder = scenario("JSONPlaceholder Load Testing")
    .exec(gettingResource())
    .pause(5)
    .exec(creatingResource())
    .pause(5)
    .exec(updatingResource())
    .pause(5)
    .exec(deletingResource())

  private def gettingResource(): ChainBuilder = {
    exec(
      http("Getting a resource")
        .get("/posts/1")
        .check(status.is(200), jsonPath("$.userId").is("1"))
    )
  }

  private def creatingResource(): ChainBuilder = {
    exec(
      http("Creating a resource")
        .post("/posts")
        .body(StringBody("""{"title": "foo", "body": "bar", "userId": 1}"""))
        .check(status.is(201), jsonPath("$.id").is("101"))
    )
  }

  private def updatingResource(): ChainBuilder = {
    exec(
      http("Updating a resource")
        .put("/posts/1")
        .body(
          StringBody(
            """{"id": "1","title": "foo", "body": "bar", "userId": 1}"""
          )
        )
        .check(status.is(200), jsonPath("$.id").is("1"))
    )
  }

  private def deletingResource(): ChainBuilder = {
    exec(
      http("Deleting a resource")
        .delete("/posts/1")
        .check(status.is(200))
    )
  }

  setUp(builder.inject(atOnceUsers(1)))
    .protocols(httpConfig)
    .assertions(
      global.responseTime.max.lt(1000),
      global.successfulRequests.percent.gt(95),
      global.failedRequests.percent.is(0)
    )
}
