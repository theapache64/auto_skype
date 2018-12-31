package com.theah64.auto_skype.ui.adapters.binding_adapters;

import android.graphics.Color;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.theah64.auto_skype.utils.GlideApp;

import androidx.databinding.BindingAdapter;

public class ImageViewBindingAdapter {

    @BindingAdapter({"imageUrlNoCache"})
    public static void imageUrlNoCache(ImageView iv, String imageUrlNoCache) {

        GlideApp.with(iv.getContext())
                .load(imageUrlNoCache)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(iv);
    }
}

