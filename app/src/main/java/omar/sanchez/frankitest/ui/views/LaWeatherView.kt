package omar.sanchez.frankitest.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import omar.sanchez.data.model.WeatherObj

@Composable
fun LaWeatherView(weatherObj: WeatherObj) {
    Column(modifier = Modifier.padding(50.dp)) {
        Text(text = weatherObj.name)
        Text(text = weatherObj.weather.firstOrNull()?.description.orEmpty())
        Text(text = "Temp" + weatherObj.main.temp.toString())
        Text(text = "min" + weatherObj.main.temp_min.toString())
    }
}