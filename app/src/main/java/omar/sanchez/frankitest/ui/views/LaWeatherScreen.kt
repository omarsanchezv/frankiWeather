package omar.sanchez.frankitest.ui.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import omar.sanchez.data.domain.LAWeatherViewModel
import omar.sanchez.data.domain.LoadingState
import omar.sanchez.data.model.WeatherObj
import org.koin.androidx.compose.koinViewModel

@Composable
fun LaWeatherScreen(viewModel: LAWeatherViewModel = koinViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    when(state){
        is LoadingState.Loading -> LoadingView()
        is LoadingState.Success -> LaWeatherView(
            (state as LoadingState.Success<WeatherObj>).payload
        )
        is LoadingState.ErrorOnLoad -> Box(modifier = Modifier.fillMaxSize())
    }

}

@Composable
@Preview
private fun LaWeatherScreenPreview() {
    LaWeatherScreen()
}