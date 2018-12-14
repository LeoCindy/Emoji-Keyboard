package com.leonardpark.emoji;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.leonardpark.emoji.emoji.Emoji;
import com.leonardpark.emoji.listeners.OnEmojiClickedListener;

import java.util.Collection;

final class RecentEmojiGridView extends EmojiGridView {
    private RecentEmoji recentEmojis;

    RecentEmojiGridView(@NonNull final Context context) {
        super(context);
    }

    public RecentEmojiGridView init(@Nullable final OnEmojiClickedListener onEmojiClickedListener,
                                    @Nullable final OnEmojiLongClickedListener onEmojiLongClickedListener,
                                    @NonNull final RecentEmoji recentEmoji) {
        recentEmojis = recentEmoji;

        final Collection<Emoji> emojis = recentEmojis.getRecentEmojis();
        emojiArrayAdapter = new EmojiArrayAdapter(getContext(), emojis.toArray(new Emoji[emojis.size()]), onEmojiClickedListener, onEmojiLongClickedListener);
        setAdapter(emojiArrayAdapter);

        return this;
    }

    public void invalidateEmojis() {
        emojiArrayAdapter.updateEmojis(recentEmojis.getRecentEmojis());
    }
}
