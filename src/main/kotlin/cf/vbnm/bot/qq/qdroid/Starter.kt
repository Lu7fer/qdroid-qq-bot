package cf.vbnm.bot.qq.qdroid

import cf.vbnm.bot.qq.qdroid.client.BotApi
import cf.vbnm.bot.qq.qdroid.client.BotManager
import cf.vbnm.bot.qq.qdroid.client.GuildBot
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@ComponentScan
@Configuration
open class Starter {
    fun initSpring() {
        val applicationContext = AnnotationConfigApplicationContext(Starter::class.java)
        applicationContext.refresh()
        val bot = applicationContext.getBean(BotManager::class.java)
        bot.startAsync()
    }
}