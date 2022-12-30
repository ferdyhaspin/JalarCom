package org.ferdyhaspin.jalarcom.ui.screen.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.ferdyhaspin.jalarcom.di.Injection
import org.ferdyhaspin.jalarcom.ui.ViewModelFactory
import org.ferdyhaspin.jalarcom.ui.common.UiState
import org.ferdyhaspin.jalarcom.ui.component.FeedItem
import org.ferdyhaspin.jalarcom.ui.component.MenuListItem
import org.ferdyhaspin.jalarcom.ui.component.SectionItem

/**
 * Created by ferdyhaspin on 30/12/22.
 */

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
    navigateToFeed: (Int) -> Unit,
    greetings: (String) -> Unit,
) {

    viewModel.greetingState.collectAsState(
        initial = UiState.Loading
    ).value.let { state ->
        when (state) {
            is UiState.Loading -> viewModel.getGreeting()
            is UiState.Success -> greetings(state.data)
            is UiState.Error -> {}
        }
    }

    viewModel.feedState.collectAsState(
        initial = UiState.Loading
    ).value.let { state ->
        when (state) {
            is UiState.Loading -> {
                viewModel.getFeeds()
            }
            is UiState.Success -> {
                LazyColumn(modifier = modifier) {
                    item {
                        SectionItem("Jadwal")
                        MenuListItem()
                        SectionItem("Jelajahi")
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    items(state.data, key = { it.id }) {
                        FeedItem(it, {
                            navigateToFeed(it.id)
                        })
                    }
                }
            }
            is UiState.Error -> {}
        }
    }
}