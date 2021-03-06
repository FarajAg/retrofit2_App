package com.example.all_the_way_up.retrofit2.data


data class User(
        var login: String = "",
        val id: Int = 0,
        val node_id: String = "",
        var avatar_url: String = "",
        val gravatar_id: String = "",
        val url: String = "",
        val html_url: String = "",
        val followers_url: String = "",
        val following_url: String = "",
        val gists_url: String = "",
        val starred_url: String = "",
        val subscriptions_url: String = "",
        val organizations_url: String = "",
        val repos_url: String = "",
        val events_url: String = "",
        val received_events_url: String = "",
        val type: String = "",
        val site_admin: Boolean = false
)