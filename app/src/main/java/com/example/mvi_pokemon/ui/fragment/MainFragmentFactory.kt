package com.example.mvi_pokemon.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.mvi_pokemon.ui.FirstFragment
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject


@ExperimentalCoroutinesApi
class MainFragmentFactory
@Inject constructor(): FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className) {
            FirstFragment::class.java.name -> {
                FirstFragment()
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}