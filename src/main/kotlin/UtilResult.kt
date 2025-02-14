sealed class UtilResult {
    data class Error(val message: String) : UtilResult()
    data class Success(val data: Set<String>) : UtilResult()
}
