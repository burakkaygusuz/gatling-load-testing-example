package io.github.burakkaygusuz

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object GatlingRunner {

  def main(args: Array[String]): Unit = {

    val simulationClass = classOf[BasicSimulation].getName
    val props = new GatlingPropertiesBuilder()

    props.simulationClass(simulationClass)

    Gatling.fromMap(props.build)
  }

}
