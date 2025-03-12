package com.example.crypto.data

import com.example.crypto.R

data class CryptoItem(
    val name: String,
    val symbol: String,
    val imageResId: Int
)

object CryptoData {
    private val baseList = listOf(
        CryptoItem("Bitcoin", "BTC", R.drawable.ic_bitcoin),
        CryptoItem("Ethereum", "ETH", R.drawable.ic_ethereum),
        CryptoItem("Binance Coin", "BNB", R.drawable.ic_binance),
        CryptoItem("Tether USD", "USD", R.drawable.ic_tether),
        CryptoItem("AXS", "AXS", R.drawable.ic_axs),
        CryptoItem("Decentraland", "MANA", R.drawable.ic_decentraland),
        CryptoItem("Solana", "SOL", R.drawable.ic_solana),
        CryptoItem("Internet Computer (DFIN)", "ICP", R.drawable.ic_internet_computer)
    )

    val cryptoList = List(100) { baseList[it % baseList.size] }  // ทำให้รายการวนซ้ำ 100 รอบ
}
