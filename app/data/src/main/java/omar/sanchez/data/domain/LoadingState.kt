package omar.sanchez.data.domain
sealed class LoadingState<T:Any> {
    class Loading<T: Any> : LoadingState<T>()
    data class Success<T: Any>(val payload: T): LoadingState<T>()
    data class ErrorOnLoad<T: Any>(val error: String): LoadingState<T>()
}