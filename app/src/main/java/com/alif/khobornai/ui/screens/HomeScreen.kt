package com.alif.khobornai.ui.screens

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
