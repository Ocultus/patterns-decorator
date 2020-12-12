import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpRequest.BodyPublishers.ofString
import java.net.http.HttpResponse

open class HttpServer: Server {
    override fun getInfo(url: String): HttpResponse<String> {
        val client: HttpClient = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build()
        return client.send(request, HttpResponse.BodyHandlers.ofString())
    }

    override fun sendInfo(url: String, json: String): HttpResponse<String>? {
        val client: HttpClient = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder().uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(ofString(json)).build()
        return client.send(request, HttpResponse.BodyHandlers.ofString())
    }

}