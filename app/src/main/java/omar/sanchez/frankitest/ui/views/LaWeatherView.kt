package omar.sanchez.frankitest.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import omar.sanchez.data.model.WeatherObj

@Composable
fun LaWeatherView(weatherObj: WeatherObj) {
    Column {
        Text(text = weatherObj.name)
    }
}