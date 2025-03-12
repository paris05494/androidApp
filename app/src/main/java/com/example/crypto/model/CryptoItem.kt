package com.example.crypto.model

data class CryptoItem(
    val id: String,
    val name: String,
    val symbol: String,
    val iconUrl: String,
    val rank: Int,
    val url: String,
    val value: Double,
    val imageResId: Int,
    val price: Double,
    val imageUrl: Int
)