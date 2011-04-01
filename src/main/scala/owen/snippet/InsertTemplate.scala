package owen
package snippet

import scala.xml._
import net.liftweb._
import http._
import js._
import JsCmds._
import util.Helpers._
import common._

class InsertTemplate {
  def render = {
    def insertTemplate(): JsCmd = {
      SetHtml("here", S.runTemplate("static" :: "designer-friendly" :: Nil).open_!)
    }

    "#insert" #> ((in: NodeSeq) => SHtml.a(insertTemplate _, in))
  }
}
