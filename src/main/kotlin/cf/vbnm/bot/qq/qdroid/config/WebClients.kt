package cf.vbnm.bot.qq.qdroid.config

import cf.vbnm.bot.qq.qdroid.client.GuildBot
import cf.vbnm.log.Slf4kt
import org.springframework.web.client.RestOperations
import org.springframework.web.client.RestTemplate
import org.springframework.web.socket.WebSocketHttpHeaders
import org.springframework.web.socket.client.WebSocketClient
import java.net.URI

class RestClient(private var restTemplate: RestTemplate) : RestOperations by restTemplate {

    fun setRestTemplate(restTemplate: RestTemplate) {
        this.restTemplate = restTemplate
    }

}

class WsClient(private var webSocketClient: WebSocketClient) {
    companion object {
        private val log = Slf4kt.getLogger(WsClient::class.java)
    }

    fun setWebSocketClient(webSocketClient: WebSocketClient) {
        this.webSocketClient = webSocketClient
    }

    fun startConnection(bot: GuildBot, uri: URI, headers: WebSocketHttpHeaders? = null) {
        webSocketClient.execute(bot.BotWebSocketHandler(), headers, uri)
    }

}