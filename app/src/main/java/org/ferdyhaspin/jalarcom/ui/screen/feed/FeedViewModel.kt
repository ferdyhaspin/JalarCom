package org.ferdyhaspin.jalarcom.ui.screen.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import org.ferdyhaspin.jalarcom.data.FeedRepository
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.ui.common.UiState

/**
 * Created by ferdyhaspin on 31/12/22.
 */
class FeedViewModel(
    private val feedRepository: FeedRepository,
) : ViewModel() {
    private val _otherFeedsState: MutableStateFlow<UiState<List<Feed>>> = MutableStateFlow(UiState.Loading)
    val otherFeedsState: StateFlow<UiState<List<Feed>>>
        get() = _otherFeedsState

    private val _feedState: MutableStateFlow<UiState<Feed>> = MutableStateFlow(UiState.Loading)
    val feedState: StateFlow<UiState<Feed>>
        get() = _feedState

    fun getFeeds(feedId: Int) {
        viewModelScope.launch {
            feedRepository.getFeeds().catch {
                _otherFeedsState.value = UiState.Error(it.message.toString())
            }.collect {
                _otherFeedsState.value = UiState.Success(it.filter { feed -> feed.id != feedId })
            }
        }
    }

    fun getFeedById(feedId: Int) {
        viewModelScope.launch {
            feedRepository.getFeedById(feedId).catch {
                _feedState.value = UiState.Error(it.message.toString())
            }.collect {
                _feedState.value = UiState.Success(it)
            }
        }
    }


}