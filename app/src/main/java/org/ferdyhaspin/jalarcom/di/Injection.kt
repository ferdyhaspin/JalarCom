package org.ferdyhaspin.jalarcom.di

import org.ferdyhaspin.jalarcom.data.FeedRepository

/**
 * Created by ferdyhaspin on 30/12/22.
 */

object Injection {

    fun provideRepository(): FeedRepository {
        return FeedRepository.getInstance()
    }

}