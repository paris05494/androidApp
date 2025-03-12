package com.example.crypto.ui

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.crypto.data.CryptoItem

@Composable
fun CryptoItemCard(crypto: CryptoItem, isClickable: Boolean) {
    var isClicked by remember { mutableStateOf(false) }

    // เพิ่มแอนิเมชันให้เลื่อนไปด้านขวาเมื่อกด
    val offsetX by animateDpAsState(targetValue = if (isClicked) 40.dp else 0.dp, label = "")

    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 16.dp)
            .offset(x = offsetX)  // ขยับเฉพาะที่กดได้
            .then(if (isClickable) Modifier.clickable { isClicked = !isClicked } else Modifier)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = crypto.imageResId),
                contentDescription = crypto.name,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(text = crypto.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text(text = crypto.symbol, fontSize = 14.sp, color = Color.Gray)
            }
        }
    }
}
