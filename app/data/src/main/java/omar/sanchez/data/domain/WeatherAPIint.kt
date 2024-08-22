package omar.sanchez.data.domain

import omar.sanchez.data.model.WeatherObj

interface WeatherAPI {
    suspend fun getLosAngelesWeather(): WeatherObj
}