package io.github.damirtugushev.introduction.view

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment

inline var Fragment.hasOptionsMenu: Boolean
    @SuppressLint("RestrictedApi")
    get() = hasOptionsMenu()
    set(value) = setHasOptionsMenu(value)
