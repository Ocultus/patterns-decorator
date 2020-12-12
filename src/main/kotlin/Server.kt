import java.net.http.HttpResponse

interface Server {
    fun getInfo(url: String): HttpResponse<String>
    fun sendInfo(url: String, json: String): HttpResponse<String>?
}