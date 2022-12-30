package org.ferdyhaspin.jalarcom.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.ferdyhaspin.jalarcom.data.FeedRepository
import org.ferdyhaspin.jalarcom.ui.screen.feed.FeedViewModel
import org.ferdyhaspin.jalarcom.ui.screen.home.HomeViewModel

/**
 * Created by ferdyhaspin on 31/12/22.
 */

class ViewModelFactory(private val repository: FeedRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(FeedViewModel::class.java)) {
            return FeedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}