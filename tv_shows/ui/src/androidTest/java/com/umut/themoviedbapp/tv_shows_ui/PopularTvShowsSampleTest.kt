package com.umut.themoviedbapp.tv_shows_ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsFragment
import com.umut.themoviedbapp.tv_shows_ui.popular_shows.PopularTvShowsViewModel
import com.umut.tv_shows_domain.GetPopularTvShowsUseCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

@RunWith(AndroidJUnit4::class)
@SmallTest
class PopularTvShowsSampleTest {

    @get:Rule
    val singleFragmentActivityRule = ActivityTestRule(SingleFragmentActivity::class.java)

    lateinit var popularTvShowsViewModel: PopularTvShowsViewModel

    lateinit var vmFactory: ViewModelProvider.Factory

    private lateinit var popularTvShowsFragment: PopularTvShowsFragment

    @Before
    fun setup() {
        popularTvShowsFragment = PopularTvShowsFragment.newInstance()

        vmFactory = mock(ViewModelProvider.Factory::class.java)
        val mockedUseCase = mock(GetPopularTvShowsUseCase::class.java)
        popularTvShowsViewModel = PopularTvShowsViewModel(mockedUseCase)
        `when`(vmFactory.create<ViewModel>(any())).thenReturn(popularTvShowsViewModel)

        popularTvShowsFragment.vmFactory = vmFactory
        singleFragmentActivityRule.activity.setFragment(popularTvShowsFragment)
    }

    @Test
    fun testPopularTvShows() {
        onView(ViewMatchers.withId(R.id.helloWorldTextView)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World")))
    }

}