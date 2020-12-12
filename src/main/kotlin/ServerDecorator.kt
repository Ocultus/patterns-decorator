import java.net.http.HttpResponse

open class ServerDecorator(protected var server: Server):Server {
    override fun getInfo(url: String): HttpResponse<String> {
        return this.server.getInfo(url)
    }

    override fun sendInfo(url: String, json: String): HttpResponse<String>? {
        return this.server.sendInfo(url, json)
    }
}