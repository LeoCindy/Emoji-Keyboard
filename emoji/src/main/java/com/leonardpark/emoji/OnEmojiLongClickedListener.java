package com.leonardpark.emoji;

import android.view.View;

import com.leonardpark.emoji.emoji.Emoji;

interface OnEmojiLongClickedListener {
    void onEmojiLongClicked(View view, Emoji emoji);
}
