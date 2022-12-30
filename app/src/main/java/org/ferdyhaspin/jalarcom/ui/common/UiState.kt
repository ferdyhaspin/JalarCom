package org.ferdyhaspin.jalarcom.ui.common

/**
 * Created by ferdyhaspin on 30/12/22.
 */

sealed class UiState<out T: Any?> {
    object Loading : UiState<Nothing>()
    data class Success<out T: Any>(val data: T) : UiState<T>()
    data class Error(val errorMessage: String) : UiState<Nothing>()
}
