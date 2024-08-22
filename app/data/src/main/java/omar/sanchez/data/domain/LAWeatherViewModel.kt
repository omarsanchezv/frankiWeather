package omar.sanchez.data.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import omar.sanchez.data.model.WeatherObj

class LAWeatherViewModel(provider: WeatherProvider) : ViewModel() {
    private val _state = MutableStateFlow<LoadingState<WeatherObj>>(LoadingState.Loading())
    val state: StateFlow<LoadingState<WeatherObj>> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val data = provider.losAngelesWeather()
            _state.value = data
        }
    }
}