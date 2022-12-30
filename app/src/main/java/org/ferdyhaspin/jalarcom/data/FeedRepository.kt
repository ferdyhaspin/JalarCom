package org.ferdyhaspin.jalarcom.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.ferdyhaspin.jalarcom.model.Feed
import org.ferdyhaspin.jalarcom.model.FeedsData
import java.util.*

/**
 * Created by ferdyhaspin on 30/12/22.
 */
class FeedRepository {

    fun getFeedById(feedId: Int): Flow<Feed> {
        return flowOf(FeedsData.feeds.find { it.id == feedId } ?: FeedsData.dummy)
    }

    fun getFeeds(): Flow<List<Feed>> {
        return flowOf(FeedsData.feeds.shuffled())
    }

    fun getGreetings(): Flow<String> {
        val cal by lazy { Calendar.getInstance() }
        return flowOf(
            when (cal[Calendar.HOUR_OF_DAY]) {
                in 12..15 -> "Selamat Siang,"
                in 16..18 -> "Selamat Sore,"
                in 19..23 -> "Selamat Malam,"
                else -> "Selamat Pagi,"
            }
        )
    }

    companion object {
        @Volatile
        private var instance: FeedRepository? = null

        fun getInstance(): FeedRepository =
            instance ?: synchronized(this) {
                FeedRepository().apply {
                    instance = this
                }
            }
    }
}