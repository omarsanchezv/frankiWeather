package omar.sanchez.data.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import omar.sanchez.data.domain.WeatherAPI
import omar.sanchez.data.model.WeatherObj

private val URL =
    "https://api.openweathermap.org/data/2.5/weather?q=Los%20Angeles&appid=5deca2f99f97d972562a33188d696b4a"

class WeatherAPIImp(val client: HttpClient) : WeatherAPI {
    override suspend fun getLosAngelesWeather(): WeatherObj = client.get(URL).body()
}