fun main(args: Array<String>) {
    val url = "https://google.com"
    val json = "{'a': '42', 'b': '45'}"
    val responseHeadersGetter = HeadersGetter(HttpServer())
    print("Get header:\n")
    responseHeadersGetter.getInfo(url)
    print("\nPost Header:\n")
    responseHeadersGetter.sendInfo(url, json)
}