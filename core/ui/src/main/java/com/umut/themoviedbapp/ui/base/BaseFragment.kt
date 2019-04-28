package com.umut.themoviedbapp.ui.base


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class BaseFragment<VM : ViewModel, B : ViewDataBinding>(
    private val layoutRestId: Int?, private val modelClass: Class<VM>
) : Fragment() {

    @Inject
    internal lateinit var vmFactory: ViewModelProvider.Factory

    internal lateinit var viewModel: VM

    internal lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        if (activity is HasSupportFragmentInjector) {
            AndroidSupportInjection.inject(this)
        }
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layoutRestId?.let {
            binding = DataBindingUtil.inflate(inflater, layoutRestId, container, false)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, vmFactory).get(modelClass)
    }

}