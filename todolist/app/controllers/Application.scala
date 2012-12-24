package controllers

import play.api._
import play.api.mvc.{Controller, Action}

object Application extends Controller {
  
  def index = Action {
    Redirect(routes.Application.tasks)
  }
  
  def tasks = TODO //Action { Ok("tasks")}
  
  def newTask = TODO//Action { Ok("newTask")}
  
  def deleteTask(id: Long) = TODO//Action {Ok("delete")}
}