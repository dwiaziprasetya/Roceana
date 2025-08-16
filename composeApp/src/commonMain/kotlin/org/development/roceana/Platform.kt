package org.development.roceana

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform