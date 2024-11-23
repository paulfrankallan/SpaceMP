package com.corbstech.spacemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform