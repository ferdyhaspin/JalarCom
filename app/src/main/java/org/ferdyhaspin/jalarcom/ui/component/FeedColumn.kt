package org.ferdyhaspin.jalarcom.ui.component

/**
 * Created by ferdyhaspin on 30/12/22.
 */

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.model.FeedsData
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme

@Composable
fun FeedColumn(
    feeds: List<Feed>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        items(feeds, key = { it.id }) {
            FeedItem(it, {})
        }
    }
}

@Preview
@Composable
fun FeedColumnPreview() {
    JalarComTheme {
        FeedColumn(feeds = FeedsData.feeds)
    }
}