package controllers

import play.api.mvc._
import models.Artist

class Application extends Controller {
  
//  def index = Action {
//    Ok(views.html.main())
//  }
  
  def listArtist = Action {
    Ok(views.html.home(Artist.fetch))
  }
}