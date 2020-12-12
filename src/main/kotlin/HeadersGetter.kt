import java.net.http.HttpResponse

class HeadersGetter(server: Server): ServerDecorator(server) {
    override fun getInfo(url: String): HttpResponse<String> {
        printHead(super.getInfo(url))
        return super.getInfo(url)
    }

    override fun sendInfo(url: String, json: String): HttpResponse<String>? {
        printHead(super.sendInfo(url, json))
        return super.sendInfo(url, json)
    }

    private fun printHead(response: HttpResponse<String>?){
        print(response?.headers().toString())
    }

}