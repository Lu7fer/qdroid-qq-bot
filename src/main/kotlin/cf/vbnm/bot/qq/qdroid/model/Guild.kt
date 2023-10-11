package cf.vbnm.bot.qq.qdroid.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * id	string	频道ID
 * name	string	频道名称
 * icon	string	频道头像地址
 * owner_id	string	创建人用户ID
 * owner	bool	当前人是否是创建人
 * member_count	int	成员数
 * max_members	int	最大成员数
 * description	string	描述
 * joined_at	string	加入时间
 * */
open class Guild(
    val id: String,
    val name: String,
    val icon: String,
    @JsonProperty("owner_id")
    val ownerId: String,
    val owner: String,
    @JsonProperty("member_count")
    val memberCount: Int,
    @JsonProperty("max_members")
    val maxMembers: Int,
    val description: String,
    @JsonProperty("joined_at")
    val joinedAt: String
)