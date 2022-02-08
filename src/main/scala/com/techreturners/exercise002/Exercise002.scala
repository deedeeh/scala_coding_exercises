package com.techreturners.exercise002



class Exercise002 {
  def isFromManchester(person: Person): Boolean = {
      var result: Boolean = false
      if(person.city ==  "Manchester") {
        result = true
      }
      result
    }

    def canWatchFilm(/*person: Person, ageLimit: Int */): Boolean = false

}


