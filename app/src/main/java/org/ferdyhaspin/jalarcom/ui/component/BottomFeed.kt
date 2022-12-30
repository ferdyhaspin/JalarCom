package org.ferdyhaspin.jalarcom.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.ui.theme.Purple500

/**
 * Created by ferdyhaspin on 31/12/22.
 */


@Composable
fun BottomFeed(
    feed: Feed,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.padding(20.dp)) {
        Column(modifier = modifier.weight(1F)) {
            Text(
                text = feed.caption,
                fontSize = 14.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = modifier.height(8.dp))
            Text(
                text = feed.location,
                fontSize = 14.sp,
                color = Purple500,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = modifier.width(8.dp))
        Image(
            painter = painterResource(R.drawable.ic_chat),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
        )
    }
}