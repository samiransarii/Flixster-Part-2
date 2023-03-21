package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("response")
    val response: BaseResponse?
)

@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val docs: List<Actor>?
)

@Keep
@Serializable
data class Actor(
    @SerialName("name")
    val name: String?,
    @SerialName("profile_path")
    val profilePath: String?,
    @SerialName("overview")
    val overview: String?,
) : java.io.Serializable {
    val mediaImageUrl = profilePath
}
