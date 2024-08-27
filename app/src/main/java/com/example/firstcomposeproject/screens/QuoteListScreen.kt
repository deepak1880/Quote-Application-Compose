package com.example.firstcomposeproject.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeproject.R
import com.example.firstcomposeproject.modal.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    Column {
        Text(
            text = "Quote App",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1F),
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = FontFamily(Font(R.font.dmserif))
        )
        LazyColumn(
            modifier = Modifier.weight(1f),
            content = {
                items(data) { quote ->
                    QuoteListItem(quote = quote) {
                        onClick(quote)
                    }
                }
            }
        )
    }
}