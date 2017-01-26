package com.outr.pixijs.PIXI

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("PIXI.RoundedRectangle")
class RoundedRectangle(var x: Double = js.native,
                       var y: Double = js.native,
                       var width: Double = js.native,
                       var height: Double = js.native,
                       var radius: Double = js.native) extends js.Object {
  def `type`: Double = js.native

  def contains(x: Double, y: Double): Boolean = js.native
}
