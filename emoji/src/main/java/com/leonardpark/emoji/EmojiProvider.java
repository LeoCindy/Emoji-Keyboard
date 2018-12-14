package com.leonardpark.emoji;

import android.support.annotation.NonNull;

import com.leonardpark.emoji.emoji.EmojiCategory;

/**
 * Interface for a custom emoji implementation that can be used with {@link EmojiManager}
 *
 * @since 0.4.0
 */
public interface EmojiProvider {
    /**
     * Returns an array of categories.
     *
     * @return The Array of categories.
     * @since 0.4.0
     */
    @NonNull
    EmojiCategory[] getCategories();
}
