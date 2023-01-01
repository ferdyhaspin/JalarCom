package org.ferdyhaspin.jalarcom.ui.component

/**
 * Created by ferdyhaspin on 30/12/22.
 */

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.model.FeedsData
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme

@Composable
fun FeedItem(
    feed: Feed,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp, start = 15.dp, end = 15.dp)
            .clickable { onClick() },
        elevation = 10.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = modifier
        ) {
            TopFeed(feed)
            AsyncImage(
                placeholder = painterResource(R.drawable.bg_gray),
                model = feed.photo,
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(200.dp)
                    .wrapContentHeight()
            )
            BottomFeed(feed)
        }
    }
}

@Preview
@Composable
fun FeedItemPreview() {
    JalarComTheme {
        FeedItem(FeedsData.dummy, {})
    }
}