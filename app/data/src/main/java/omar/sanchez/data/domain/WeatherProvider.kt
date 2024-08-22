package omar.sanchez.data.domain

import omar.sanchez.data.model.WeatherObj

interface WeatherProvider {
    suspend fun losAngelesWeather(): LoadingState<WeatherObj>
}

class LosAngelesWeatherProvider(val api: WeatherAPI) : WeatherProvider {
    override suspend fun losAngelesWeather(): LoadingState<WeatherObj> =
        try {
            LoadingState.Success(api.getLosAngelesWeather())
        } catch (e: Exception) {
            LoadingState.ErrorOnLoad(e.message.orEmpty())
        }

}