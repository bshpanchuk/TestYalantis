package com.bshpanchuk.testyalantis.domain.model

data class Credentials(
    val clientId: String,
    val redirectUrl: String,

    val scriptClientId: String,
    val scriptClientSecret: String,
    val username: String,
    val password: String,

    val scopes: List<String>
)
