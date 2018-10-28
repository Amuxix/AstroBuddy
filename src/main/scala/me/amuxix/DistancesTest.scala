package me.amuxix

import me.amuxix.stanton.bases._

object DistancesTest {
  def main(args: Array[String]): Unit = {
    val base1 = GrimHex
    val base2 = ArcCorpMiningArea141
    val distance = base1.distanceTo(base2)
    println(distance)
    println(distance.timeToTravel(Freelancer))
    println(distance.timeToTravel(`325a`))
  }
}
