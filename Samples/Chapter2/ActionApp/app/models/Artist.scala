package models

case class Artist(name: String, country: String)

object Artist {
  val availableArtist = Seq(Artist("Wolfgang Amadeus Mozart", "Austria"),
                            Artist("Ludwig van Beethoven", "Germany"))
  
  def fetch: Seq[Artist] = {
    availableArtist
  }
  
  def fetchByName(name: String): Seq[Artist] = {
    availableArtist.filter(a => a.name.contains(name))
  }
  
  def fetchByCountry(country: String): Seq[Artist] = {
    availableArtist.filter(a => a.country == country)
  }
  
  def fetchByNameOrCountry(name: String, country: String): Seq[Artist] = {
    availableArtist.filter(a => a.name.contains(name) || a.country == country)
  }
  
  def fetchByNameAndCountry(name: String, country: String): Seq[Artist] = {
    availableArtist.filter(a => a.name.contains(name) && a.country == country)
  }
}