package org.ferdyhaspin.jalarcom.ui.component

/**
 * Created by ferdyhaspin on 30/12/22.
 */

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.model.FeedsData
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme
import org.ferdyhaspin.jalarcom.ui.theme.Purple500

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

@Composable
fun TopFeed(
    feed: Feed,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(20.dp)
    ) {
        Row {
            AsyncImage(
                placeholder = painterResource(R.drawable.bg_gray),
                model = feed.user.photo,
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1F)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = feed.user.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Image(
                        painter = painterResource(R.drawable.ic_approved),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(18.dp)
                    )
                }
                Text(
                    text = feed.createdAt,
                    fontSize = 13.sp,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.width(3.dp))
            Text(
                text = feed.type,
                fontSize = 12.sp,
                modifier = modifier
                    .shadow(
                        1.dp,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .background(color = Color.LightGray)
                    .padding(vertical = 2.dp, horizontal = 6.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = feed.user.type,
            fontSize = 12.sp,
            color = Color.White,
            modifier = modifier
                .shadow(
                    1.dp,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(color = Purple500)
                .padding(vertical = 2.dp, horizontal = 6.dp)
        )
    }
}

@Preview
@Composable
fun FeedItemPreview() {
    JalarComTheme {
        FeedItem(FeedsData.dummy, {})
    }
}