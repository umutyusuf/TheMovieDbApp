package com.umut.themoviedbapp.ui.base

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.CallSuper
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseActivity(private val layoutId: Int? = null) : AppCompatActivity(),
    HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        layoutId?.let {
            setContentView(it)
        }
        prepareDisplayHome()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidInjector

    open fun showBack() = false

    fun setScreenTitle(title: CharSequence?) {
        title?.let { t ->
            supportActionBar?.title = t
        }
    }

    // FIXME: remove unused methods
    fun setScreenTitle(@StringRes titleRes: Int) {
        setScreenTitle(getString(titleRes))
    }

    fun setScreenSubTitle(@StringRes subTitleRes: Int) {
        setScreenSubTitle(getString(subTitleRes))
    }

    fun setScreenSubTitle(subTitle: CharSequence?) {
        subTitle?.let { st ->
            supportActionBar?.subtitle = st
        }
    }

    private fun prepareDisplayHome() {
        supportActionBar?.apply {
            setDisplayShowTitleEnabled(true)
            if (showBack()) {
                setDisplayShowHomeEnabled(false)
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                if (showBack()) {
                    onBackPressed()
                    return true
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

}