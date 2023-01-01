package org.ferdyhaspin.jalarcom.ui.screen.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.google.accompanist.flowlayout.FlowMainAxisAlignment
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.SizeMode
import org.ferdyhaspin.jalarcom.R
import org.ferdyhaspin.jalarcom.di.Injection
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.model.FeedsData
import org.ferdyhaspin.jalarcom.ui.ViewModelFactory
import org.ferdyhaspin.jalarcom.ui.common.UiState
import org.ferdyhaspin.jalarcom.ui.component.BottomFeed
import org.ferdyhaspin.jalarcom.ui.component.SectionItem
import org.ferdyhaspin.jalarcom.ui.component.TopFeed
import org.ferdyhaspin.jalarcom.ui.navigation.Screen
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme

/**
 * Created by ferdyhaspin on 30/12/22.
 */

@Composable
fun FeedScreen(
    feedId: Int,
    navController: NavHostController,
    modifier: Modifier = Modifier,
    viewModel: FeedViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
) {
    var feed by remember { mutableStateOf(FeedsData.dummy) }
    var otherFeeds by remember { mutableStateOf(listOf<Feed>()) }

    viewModel.otherFeedsState.collectAsState(initial = UiState.Loading).value.let { state ->
        when (state) {
            is UiState.Loading -> {
                viewModel.getFeeds(feedId)
            }
            is UiState.Success -> {
                otherFeeds = state.data
            }
            is UiState.Error -> {}
        }
    }

    viewModel.feedState.collectAsState(initial = UiState.Loading).value.let { state ->
        when (state) {
            is UiState.Loading -> {
                viewModel.getFeedById(feedId)
            }
            is UiState.Success -> {
                feed = state.data
            }
            is UiState.Error -> {}
        }
    }

    FeedDetail(feed = feed, feeds = otherFeeds, modifier, navController)
}


@Composable
fun FeedDetail(
    feed: Feed,
    feeds: List<Feed>,
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    LazyColumn(modifier = modifier)
    {
        item {
            FeedContent(feed)
        }
        item {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .background(Color.LightGray)
            )
            FeedContentList(feeds, navController)
        }
    }
}

@Composable
fun FeedContent(
    feed: Feed,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
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
        TopFeed(feed = feed)
        Divider()
        BottomFeed(feed = feed, showDetail = true)
    }
}

@Composable
fun FeedContentList(
    feeds: List<Feed>,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        SectionItem("Jelajahi")

        val itemSize: Dp = (LocalConfiguration.current.screenWidthDp.dp / 3)
        FlowRow(
            modifier = Modifier.padding(15.dp),
            mainAxisSize = SizeMode.Expand,
            mainAxisSpacing = 1.dp,
            crossAxisSpacing = 10.dp,
            mainAxisAlignment = FlowMainAxisAlignment.SpaceBetween
        ) {
            feeds.forEach {
                AsyncImage(
                    placeholder = painterResource(R.drawable.bg_gray),
                    model = it.photo,
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                    modifier = Modifier
                        .size(itemSize - 17.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .clickable {
                            navController.navigate(Screen.Feed.createRoute(it.id))
                        }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedScreenPreview() {
    JalarComTheme {
        FeedContent(FeedsData.dummy)
    }
}
