package com.outr.pixijs.PIXI

import scala.scalajs.js

@js.native
class Point(var x: Double = js.native,
            var y: Double = js.native) extends js.Object {
  def copy(p: Point): Unit = js.native
  def equals(p: Point): Boolean = js.native
  def set(x: Double = js.native, y: Double = js.native): Unit = js.native
}