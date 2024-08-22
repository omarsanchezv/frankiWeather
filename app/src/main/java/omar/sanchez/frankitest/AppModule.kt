package omar.sanchez.frankitest

import omar.sanchez.data.client.Client
import omar.sanchez.data.data.WeatherAPIImp
import omar.sanchez.data.domain.LAWeatherViewModel
import omar.sanchez.data.domain.LosAngelesWeatherProvider
import omar.sanchez.data.domain.WeatherAPI
import omar.sanchez.data.domain.WeatherProvider
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { Client().httpClient }
    factory { WeatherAPIImp(get()) } bind WeatherAPI::class
    factory { LosAngelesWeatherProvider(get()) } bind WeatherProvider::class
    viewModel { LAWeatherViewModel(get()) }
}