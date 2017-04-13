package net.yckao.utils

/**
 * Created by yckao85 on 2017/3/13.
 */


import android.content.Context
import android.graphics.Typeface
import android.util.Log

object TypefaceUtil {
    fun overrideFont(context: Context, defaultFontNameToOverride: String, customFontFileNameInAssets: String) {
        try {
            val customFontTypeface = Typeface.createFromAsset(context.assets, customFontFileNameInAssets)

            val defaultFontTypefaceField = Typeface::class.java.getDeclaredField(defaultFontNameToOverride)
            defaultFontTypefaceField.isAccessible = true
            defaultFontTypefaceField.set(null, customFontTypeface)

        } catch (e: Exception) {
            Log.e("TypefaceUtil","Can not set custom font $customFontFileNameInAssets instead of $defaultFontNameToOverride")
        }
    }
}