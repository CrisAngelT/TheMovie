package com.crisangel.multi.themovie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform