import cf.vbnm.bot.qq.qdroid.client.BotEventDispatcher
import cf.vbnm.bot.qq.qdroid.client.BotManager
import cf.vbnm.bot.qq.qdroid.client.HttpRequestPool
import cf.vbnm.bot.qq.qdroid.client.Intents
import cf.vbnm.bot.qq.qdroid.config.RestClient
import cf.vbnm.bot.qq.qdroid.config.WsClient
import cf.vbnm.bot.qq.qdroid.logic.Echo
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import org.springframework.web.socket.client.standard.StandardWebSocketClient
import kotlin.system.exitProcess

fun main() {

    try {
        val objectMapper = ObjectMapper().apply {
            this.registerModule(JavaTimeModule())
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        }
        val converter = MappingJackson2HttpMessageConverter(objectMapper)
        val botManager = BotManager(
            "****",
            "****",
            "https://sandbox.api.sgroup.qq.com",
            RestClient(RestTemplate(listOf(converter))),
            WsClient(StandardWebSocketClient()),
            HttpRequestPool().apply { init() },
            arrayOf(Intents.GUILDS, Intents.GUILD_MESSAGE_REACTIONS, Intents.PUBLIC_GUILD_MESSAGES),
            objectMapper,
            arrayListOf(),
            BotEventDispatcher(
                arrayListOf(Echo()), objectMapper
            ),
            1
        )
        botManager.startAsync()
    } catch (e: Exception) {
        e.printStackTrace()
        exitProcess(-1)
    }
}