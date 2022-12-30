package org.ferdyhaspin.jalarcom.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.ui.theme.Green
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme
import org.ferdyhaspin.jalarcom.ui.theme.Yellow

/**
 * Created by ferdyhaspin on 31/12/22.
 */

@Composable
fun MenuListItem(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        MenuItem(
            title = "Panen",
            color = Green,
            icon = R.drawable.ic_rice,
            backgroundIcon = R.drawable.ic_rice_bg,
            modifier = modifier.weight(1F)
        )
        MenuItem(
            title = "Pengiriman",
            color = Yellow,
            icon = R.drawable.ic_pick_up,
            backgroundIcon = R.drawable.ic_pick_up_bg,
            modifier = modifier.weight(1F)
        )
    }
}

@Composable
fun MenuItem(
    title: String,
    color: Color,
    @DrawableRes icon: Int,
    @DrawableRes backgroundIcon: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(15.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            modifier = modifier.background(color)
        ) {
            Image(
                painter = painterResource(backgroundIcon),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(120.dp)
            )
            Column(
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.BottomEnd),
            ) {
                Image(
                    painter = painterResource(icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
                Text(
                    text = title,
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}


@Preview
@Composable
fun MenuListPreview() {
    JalarComTheme {
        MenuListItem()
    }
}