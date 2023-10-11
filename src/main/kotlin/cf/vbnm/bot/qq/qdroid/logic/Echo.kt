package cf.vbnm.bot.qq.qdroid.logic

import cf.vbnm.bot.qq.qdroid.client.AtMessageCreateHandler
import cf.vbnm.bot.qq.qdroid.client.GuildBot
import cf.vbnm.bot.qq.qdroid.model.Message
import org.springframework.stereotype.Component

@Component
class Echo : AtMessageCreateHandler {
    override fun onEvent(bot: GuildBot, event: Message, type: String) {
        println(event.content)
        bot.postChannelsMessages(
            event.channelId,
            event.content?.replace(Regex("<@!\\d+>"), ""),
            msgId = event.id
        )
    }
}