package com.leonardpark.emoji.google;

import android.support.annotation.NonNull;

import com.leonardpark.emoji.google.category.ActivityCategory;
import com.leonardpark.emoji.google.category.FlagsCategory;
import com.leonardpark.emoji.google.category.FoodCategory;
import com.leonardpark.emoji.google.category.NatureCategory;
import com.leonardpark.emoji.google.category.ObjectsCategory;
import com.leonardpark.emoji.google.category.PeopleCategory;
import com.leonardpark.emoji.google.category.SymbolsCategory;
import com.leonardpark.emoji.google.category.TravelCategory;
import com.leonardpark.emoji.EmojiProvider;
import com.leonardpark.emoji.emoji.EmojiCategory;

public class GoogleEmojiProvider implements EmojiProvider {
    @NonNull
    @Override
    public EmojiCategory[] getCategories() {
        return new EmojiCategory[]{
                new PeopleCategory(),
                new NatureCategory(),
                new FoodCategory(),
                new ActivityCategory(),
                new TravelCategory(),
                new ObjectsCategory(),
                new SymbolsCategory(),
                new FlagsCategory()
        };
    }
}
