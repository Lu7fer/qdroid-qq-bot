package cf.vbnm.bot.qq.qdroid.client

abstract class BotLifecycle {
    fun onStart(bot: GuildBot) {}
    fun onResume(bot: GuildBot) {}
    fun onAuthenticationFailed(bot: GuildBot) {}
    fun onResumeFailed(bot: GuildBot) {}
    fun onConnectionClosed(bot: GuildBot) {}
    fun onShutdown(bot: GuildBot) {}
}
