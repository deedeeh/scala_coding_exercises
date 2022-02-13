package com.techreturners.exercise004

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def this(localDate: LocalDate) = {
    this(localDate.atStartOfDay())
  }

  def getDateTimeWithGigaSecond: LocalDateTime = {
    val year = dateTime.getYear
    val nanoOfSecond = dateTime.getNano
    val getDateTimeData: Array[Int] = Array(dateTime.getMonthValue, dateTime.getDayOfMonth, dateTime.getHour, dateTime.getMinute, dateTime.getSecond)
    val correctDateTimeStrFormat: Array[String] = for (data <- getDateTimeData) yield {
      String.format("%02d", data)
    }
    val dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")
    val dateTimeParsed = LocalDateTime.parse(s"${year}-${correctDateTimeStrFormat(0)}-${correctDateTimeStrFormat(1)} ${correctDateTimeStrFormat(2)}:${correctDateTimeStrFormat(3)}:${correctDateTimeStrFormat(4)}.${nanoOfSecond}", dateTimeFormatter)
    dateTimeParsed.plusSeconds(1000000000)
  }
}
