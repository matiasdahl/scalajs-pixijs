package com.outr.pixijs.PIXI

import org.scalajs.dom.{CanvasGradient, CanvasPattern}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|

@js.native
@JSName("PIXI.TextStyle")
class TextStyle(style: StyleOptions = js.native) extends js.Object {
  def reset(): Unit = js.native
}

@ScalaJSDefined
trait StyleOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var breakWords: js.UndefOr[Boolean] = js.undefined
  var dropShadow: js.UndefOr[Boolean] = js.undefined
  var dropShadowAngle: js.UndefOr[Double] = js.undefined
  var dropShadowBlur: js.UndefOr[Double] = js.undefined
  var dropShadowColor: js.UndefOr[String] = js.undefined
  var dropShadowDistance: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String | Array[String] | Double | Array[Double] | CanvasGradient | CanvasPattern] = js.undefined
  var fillGradientType: js.UndefOr[Double] = js.undefined
  var fontFamily: js.UndefOr[String | Array[String]] = js.undefined
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontVariant: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String | Double] = js.undefined
  var strokeThickness: js.UndefOr[Double] = js.undefined
  var textBaseline: js.UndefOr[String] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
  var wordWrapWidth: js.UndefOr[Double] = js.undefined
}