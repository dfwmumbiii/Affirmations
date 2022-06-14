package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.util.*

data class Affirmation(@StringRes val stringResourceId:Int,
                       @DrawableRes val imageResourceId:Int )