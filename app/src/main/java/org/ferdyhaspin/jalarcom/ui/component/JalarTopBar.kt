package org.ferdyhaspin.jalarcom.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme

/**
 * Created by ferdyhaspin on 30/12/22.
 */


@Composable
fun TopBarHome(
    navigateToProfile: () -> Unit,
    greetings: String,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = 10.dp,
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    navigateToProfile()
                }
            ) {
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = "about_page",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Greetings(greetings = greetings)
            }
            Image(
                painter = painterResource(R.drawable.img_logo),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp)
            )
        }
    }
}

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    greetings: String
) {
    Column(
        modifier = modifier.padding(start = 10.dp)
    ) {
        Text(
            text = greetings,
            fontSize = 13.sp
        )
        Text(
            text = "Ferdi Haspi N",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}


@Composable
fun TopBarScreen(
    title: String,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = 10.dp,
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Button(
                modifier = Modifier.align(Alignment.CenterStart),
                elevation = null,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                onClick = {
                    navController.navigateUp()
                }) {
                Image(
                    painter = painterResource(R.drawable.ic_back),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }

            Text(
                modifier = Modifier.align(Alignment.Center),
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarScreenPreview() {
    JalarComTheme {
        TopBarScreen("Profil", rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarHomePreview() {
    JalarComTheme {
        TopBarHome({}, "Selamat Malam")
    }
}