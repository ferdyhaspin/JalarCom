package org.ferdyhaspin.jalarcom.ui.screen.home

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
class HomeViewModel(
    private val repository: FeedRepository
) : ViewModel() {

    private val _feedState: MutableStateFlow<UiState<List<Feed>>> =
        MutableStateFlow(UiState.Loading)
    val feedState: StateFlow<UiState<List<Feed>>>
        get() = _feedState

    private val _greetingState: MutableStateFlow<UiState<String>> =
        MutableStateFlow(UiState.Loading)
    val greetingState: StateFlow<UiState<String>>
        get() = _greetingState

    fun getFeeds() {
        viewModelScope.launch {
            repository.getFeeds()
                .catch {
                    _feedState.value = UiState.Error(it.message.toString())
                }
                .collect { feeds ->
                    _feedState.value = UiState.Success(feeds)
                }
        }
    }

    fun getGreeting() {
        viewModelScope.launch {
            repository.getGreetings().catch {
                _greetingState.value = UiState.Error(it.message.toString())
            }.collect {
                _greetingState.value = UiState.Success(it)
            }
        }
    }
}