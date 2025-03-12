package com.example.crypto.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.crypto.data.CryptoData

@Composable
fun CryptoListScreen() {
    Surface(color = Color(0xFFF5F5F5), modifier = Modifier.fillMaxSize()) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text(text = "BTC", style = MaterialTheme.typography.headlineSmall)
            }

            LazyColumn(modifier = Modifier.padding(top = 8.dp)) {
                itemsIndexed(CryptoData.cryptoList) { index, crypto ->  // ใช้ itemsIndexed
                    CryptoItemCard(crypto = crypto, isClickable = (index + 1) % 5 == 0)
                }
            }
        }
    }
}
