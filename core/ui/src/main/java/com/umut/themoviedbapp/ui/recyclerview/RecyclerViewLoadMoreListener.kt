package com.umut.themoviedbapp.ui.recyclerview

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

abstract class RecyclerViewLoadMoreListener(private val loadFrom: Int = 3) : RecyclerView.OnScrollListener() {

    private var isLoading = true
    private var currentSize = 0

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val linearLayoutManager = recyclerView.layoutManager as LinearLayoutManager

        if (!isLoading) {
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == currentSize - loadFrom) {
                //bottom of list!
                loadMore()
                isLoading = true
            }
        }
    }

    fun loadCompleted(currentSize: Int?) {
        this.isLoading = false
        this.currentSize = currentSize ?: 0
    }

    protected abstract fun loadMore()


}