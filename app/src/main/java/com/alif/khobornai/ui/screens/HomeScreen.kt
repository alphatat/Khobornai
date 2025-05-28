package com.alif.khobornai.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.alif.khobornai.data.model.Newspaper

@Composable
fun HomeScreen(newspapers: List<Newspaper>) {
    LazyColumn {
        items(newspapers) { paper ->
            NewspaperItem(paper)
        }
    }
}

@Composable
fun NewspaperItem(paper: Newspaper) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            AsyncImage(
                model = paper.thumbnailUrl,
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = paper.title, style = MaterialTheme.typography.titleMedium)
                Text(text = paper.date, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
