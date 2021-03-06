package com.leonardpark.emoji.google.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.leonardpark.emoji.emoji.Emoji;
import com.leonardpark.emoji.emoji.EmojiCategory;
import com.leonardpark.emoji.google.R;

public class FlagsCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(0x1f3f3, R.drawable.emoji_google_1f3f3),
            new Emoji(0x1f3f4, R.drawable.emoji_google_1f3f4),
            new Emoji(new int[]{0x1f3f4, 0x200d, 0x2620, 0xfe0f}, R.drawable.emoji_google_1f3f4_200d_2620),
            new Emoji(0x1f3c1, R.drawable.emoji_google_1f3c1),
            new Emoji(0x1f6a9, R.drawable.emoji_google_1f6a9),
            new Emoji(new int[]{0x1f3f3, 0xfe0f, 0x200d, 0x1f308}, R.drawable.emoji_google_1f3f3_200d_1f308),
            new Emoji(new int[]{0x1f1fa, 0x1f1f3}, R.drawable.emoji_google_1f1fa_1f1f3),
            new Emoji(new int[]{0x1f1e6, 0x1f1eb}, R.drawable.emoji_google_1f1e6_1f1eb),
            new Emoji(new int[]{0x1f1e6, 0x1f1fd}, R.drawable.emoji_google_1f1e6_1f1fd),
            new Emoji(new int[]{0x1f1e6, 0x1f1f1}, R.drawable.emoji_google_1f1e6_1f1f1),
            new Emoji(new int[]{0x1f1e9, 0x1f1ff}, R.drawable.emoji_google_1f1e9_1f1ff),
            new Emoji(new int[]{0x1f1e6, 0x1f1f8}, R.drawable.emoji_google_1f1e6_1f1f8),
            new Emoji(new int[]{0x1f1e6, 0x1f1e9}, R.drawable.emoji_google_1f1e6_1f1e9),
            new Emoji(new int[]{0x1f1e6, 0x1f1f4}, R.drawable.emoji_google_1f1e6_1f1f4),
            new Emoji(new int[]{0x1f1e6, 0x1f1ee}, R.drawable.emoji_google_1f1e6_1f1ee),
            new Emoji(new int[]{0x1f1e6, 0x1f1f6}, R.drawable.emoji_google_1f1e6_1f1f6),
            new Emoji(new int[]{0x1f1e6, 0x1f1ec}, R.drawable.emoji_google_1f1e6_1f1ec),
            new Emoji(new int[]{0x1f1e6, 0x1f1f7}, R.drawable.emoji_google_1f1e6_1f1f7),
            new Emoji(new int[]{0x1f1e6, 0x1f1f2}, R.drawable.emoji_google_1f1e6_1f1f2),
            new Emoji(new int[]{0x1f1e6, 0x1f1fc}, R.drawable.emoji_google_1f1e6_1f1fc),
            new Emoji(new int[]{0x1f1e6, 0x1f1fa}, R.drawable.emoji_google_1f1e6_1f1fa),
            new Emoji(new int[]{0x1f1e6, 0x1f1f9}, R.drawable.emoji_google_1f1e6_1f1f9),
            new Emoji(new int[]{0x1f1e6, 0x1f1ff}, R.drawable.emoji_google_1f1e6_1f1ff),
            new Emoji(new int[]{0x1f1e7, 0x1f1f8}, R.drawable.emoji_google_1f1e7_1f1f8),
            new Emoji(new int[]{0x1f1e7, 0x1f1ed}, R.drawable.emoji_google_1f1e7_1f1ed),
            new Emoji(new int[]{0x1f1e7, 0x1f1e9}, R.drawable.emoji_google_1f1e7_1f1e9),
            new Emoji(new int[]{0x1f1e7, 0x1f1e7}, R.drawable.emoji_google_1f1e7_1f1e7),
            new Emoji(new int[]{0x1f1e7, 0x1f1fe}, R.drawable.emoji_google_1f1e7_1f1fe),
            new Emoji(new int[]{0x1f1e7, 0x1f1ea}, R.drawable.emoji_google_1f1e7_1f1ea),
            new Emoji(new int[]{0x1f1e7, 0x1f1ff}, R.drawable.emoji_google_1f1e7_1f1ff),
            new Emoji(new int[]{0x1f1e7, 0x1f1ef}, R.drawable.emoji_google_1f1e7_1f1ef),
            new Emoji(new int[]{0x1f1e7, 0x1f1f2}, R.drawable.emoji_google_1f1e7_1f1f2),
            new Emoji(new int[]{0x1f1e7, 0x1f1f9}, R.drawable.emoji_google_1f1e7_1f1f9),
            new Emoji(new int[]{0x1f1e7, 0x1f1f4}, R.drawable.emoji_google_1f1e7_1f1f4),
            new Emoji(new int[]{0x1f1e7, 0x1f1e6}, R.drawable.emoji_google_1f1e7_1f1e6),
            new Emoji(new int[]{0x1f1e7, 0x1f1fc}, R.drawable.emoji_google_1f1e7_1f1fc),
            new Emoji(new int[]{0x1f1e7, 0x1f1f7}, R.drawable.emoji_google_1f1e7_1f1f7),
            new Emoji(new int[]{0x1f1ee, 0x1f1f4}, R.drawable.emoji_google_1f1ee_1f1f4),
            new Emoji(new int[]{0x1f1fb, 0x1f1ec}, R.drawable.emoji_google_1f1fb_1f1ec),
            new Emoji(new int[]{0x1f1e7, 0x1f1f3}, R.drawable.emoji_google_1f1e7_1f1f3),
            new Emoji(new int[]{0x1f1e7, 0x1f1ec}, R.drawable.emoji_google_1f1e7_1f1ec),
            new Emoji(new int[]{0x1f1e7, 0x1f1eb}, R.drawable.emoji_google_1f1e7_1f1eb),
            new Emoji(new int[]{0x1f1e7, 0x1f1ee}, R.drawable.emoji_google_1f1e7_1f1ee),
            new Emoji(new int[]{0x1f1f0, 0x1f1ed}, R.drawable.emoji_google_1f1f0_1f1ed),
            new Emoji(new int[]{0x1f1e8, 0x1f1f2}, R.drawable.emoji_google_1f1e8_1f1f2),
            new Emoji(new int[]{0x1f1e8, 0x1f1e6}, R.drawable.emoji_google_1f1e8_1f1e6),
            new Emoji(new int[]{0x1f1ee, 0x1f1e8}, R.drawable.emoji_google_1f1ee_1f1e8),
            new Emoji(new int[]{0x1f1e8, 0x1f1fb}, R.drawable.emoji_google_1f1e8_1f1fb),
            new Emoji(new int[]{0x1f1f0, 0x1f1fe}, R.drawable.emoji_google_1f1f0_1f1fe),
            new Emoji(new int[]{0x1f1e8, 0x1f1eb}, R.drawable.emoji_google_1f1e8_1f1eb),
            new Emoji(new int[]{0x1f1f9, 0x1f1e9}, R.drawable.emoji_google_1f1f9_1f1e9),
            new Emoji(new int[]{0x1f1e8, 0x1f1f1}, R.drawable.emoji_google_1f1e8_1f1f1),
            new Emoji(new int[]{0x1f1e8, 0x1f1f3}, R.drawable.emoji_google_1f1e8_1f1f3),
            new Emoji(new int[]{0x1f1e8, 0x1f1fd}, R.drawable.emoji_google_1f1e8_1f1fd),
            new Emoji(new int[]{0x1f1e8, 0x1f1e8}, R.drawable.emoji_google_1f1e8_1f1e8),
            new Emoji(new int[]{0x1f1e8, 0x1f1f4}, R.drawable.emoji_google_1f1e8_1f1f4),
            new Emoji(new int[]{0x1f1f0, 0x1f1f2}, R.drawable.emoji_google_1f1f0_1f1f2),
            new Emoji(new int[]{0x1f1e8, 0x1f1ec}, R.drawable.emoji_google_1f1e8_1f1ec),
            new Emoji(new int[]{0x1f1e8, 0x1f1e9}, R.drawable.emoji_google_1f1e8_1f1e9),
            new Emoji(new int[]{0x1f1e8, 0x1f1f0}, R.drawable.emoji_google_1f1e8_1f1f0),
            new Emoji(new int[]{0x1f1e8, 0x1f1f7}, R.drawable.emoji_google_1f1e8_1f1f7),
            new Emoji(new int[]{0x1f1e8, 0x1f1ee}, R.drawable.emoji_google_1f1e8_1f1ee),
            new Emoji(new int[]{0x1f1ed, 0x1f1f7}, R.drawable.emoji_google_1f1ed_1f1f7),
            new Emoji(new int[]{0x1f1e8, 0x1f1fa}, R.drawable.emoji_google_1f1e8_1f1fa),
            new Emoji(new int[]{0x1f1e8, 0x1f1fc}, R.drawable.emoji_google_1f1e8_1f1fc),
            new Emoji(new int[]{0x1f1e8, 0x1f1fe}, R.drawable.emoji_google_1f1e8_1f1fe),
            new Emoji(new int[]{0x1f1e8, 0x1f1ff}, R.drawable.emoji_google_1f1e8_1f1ff),
            new Emoji(new int[]{0x1f1e9, 0x1f1f0}, R.drawable.emoji_google_1f1e9_1f1f0),
            new Emoji(new int[]{0x1f1e9, 0x1f1ef}, R.drawable.emoji_google_1f1e9_1f1ef),
            new Emoji(new int[]{0x1f1e9, 0x1f1f2}, R.drawable.emoji_google_1f1e9_1f1f2),
            new Emoji(new int[]{0x1f1e9, 0x1f1f4}, R.drawable.emoji_google_1f1e9_1f1f4),
            new Emoji(new int[]{0x1f1ea, 0x1f1e8}, R.drawable.emoji_google_1f1ea_1f1e8),
            new Emoji(new int[]{0x1f1ea, 0x1f1ec}, R.drawable.emoji_google_1f1ea_1f1ec),
            new Emoji(new int[]{0x1f1f8, 0x1f1fb}, R.drawable.emoji_google_1f1f8_1f1fb),
            new Emoji(new int[]{0x1f1ec, 0x1f1f6}, R.drawable.emoji_google_1f1ec_1f1f6),
            new Emoji(new int[]{0x1f1ea, 0x1f1f7}, R.drawable.emoji_google_1f1ea_1f1f7),
            new Emoji(new int[]{0x1f1ea, 0x1f1ea}, R.drawable.emoji_google_1f1ea_1f1ea),
            new Emoji(new int[]{0x1f1ea, 0x1f1f9}, R.drawable.emoji_google_1f1ea_1f1f9),
            new Emoji(new int[]{0x1f1ea, 0x1f1fa}, R.drawable.emoji_google_1f1ea_1f1fa),
            new Emoji(new int[]{0x1f1eb, 0x1f1f4}, R.drawable.emoji_google_1f1eb_1f1f4),
            new Emoji(new int[]{0x1f1eb, 0x1f1ef}, R.drawable.emoji_google_1f1eb_1f1ef),
            new Emoji(new int[]{0x1f1eb, 0x1f1ee}, R.drawable.emoji_google_1f1eb_1f1ee),
            new Emoji(new int[]{0x1f1eb, 0x1f1f7}, R.drawable.emoji_google_1f1eb_1f1f7),
            new Emoji(new int[]{0x1f1f5, 0x1f1eb}, R.drawable.emoji_google_1f1f5_1f1eb),
            new Emoji(new int[]{0x1f1ec, 0x1f1e6}, R.drawable.emoji_google_1f1ec_1f1e6),
            new Emoji(new int[]{0x1f1ec, 0x1f1f2}, R.drawable.emoji_google_1f1ec_1f1f2),
            new Emoji(new int[]{0x1f1ec, 0x1f1ea}, R.drawable.emoji_google_1f1ec_1f1ea),
            new Emoji(new int[]{0x1f1e9, 0x1f1ea}, R.drawable.emoji_google_1f1e9_1f1ea),
            new Emoji(new int[]{0x1f1ec, 0x1f1ed}, R.drawable.emoji_google_1f1ec_1f1ed),
            new Emoji(new int[]{0x1f1ec, 0x1f1ee}, R.drawable.emoji_google_1f1ec_1f1ee),
            new Emoji(new int[]{0x1f1ec, 0x1f1f7}, R.drawable.emoji_google_1f1ec_1f1f7),
            new Emoji(new int[]{0x1f1ec, 0x1f1f1}, R.drawable.emoji_google_1f1ec_1f1f1),
            new Emoji(new int[]{0x1f1ec, 0x1f1e9}, R.drawable.emoji_google_1f1ec_1f1e9),
            new Emoji(new int[]{0x1f1ec, 0x1f1fa}, R.drawable.emoji_google_1f1ec_1f1fa),
            new Emoji(new int[]{0x1f1ec, 0x1f1f9}, R.drawable.emoji_google_1f1ec_1f1f9),
            new Emoji(new int[]{0x1f1ec, 0x1f1ec}, R.drawable.emoji_google_1f1ec_1f1ec),
            new Emoji(new int[]{0x1f1ec, 0x1f1f3}, R.drawable.emoji_google_1f1ec_1f1f3),
            new Emoji(new int[]{0x1f1ec, 0x1f1fc}, R.drawable.emoji_google_1f1ec_1f1fc),
            new Emoji(new int[]{0x1f1ec, 0x1f1fe}, R.drawable.emoji_google_1f1ec_1f1fe),
            new Emoji(new int[]{0x1f1ed, 0x1f1f9}, R.drawable.emoji_google_1f1ed_1f1f9),
            new Emoji(new int[]{0x1f1ed, 0x1f1f3}, R.drawable.emoji_google_1f1ed_1f1f3),
            new Emoji(new int[]{0x1f1ed, 0x1f1f0}, R.drawable.emoji_google_1f1ed_1f1f0),
            new Emoji(new int[]{0x1f1ed, 0x1f1fa}, R.drawable.emoji_google_1f1ed_1f1fa),
            new Emoji(new int[]{0x1f1ee, 0x1f1f8}, R.drawable.emoji_google_1f1ee_1f1f8),
            new Emoji(new int[]{0x1f1ee, 0x1f1f3}, R.drawable.emoji_google_1f1ee_1f1f3),
            new Emoji(new int[]{0x1f1ee, 0x1f1e9}, R.drawable.emoji_google_1f1ee_1f1e9),
            new Emoji(new int[]{0x1f1ee, 0x1f1f7}, R.drawable.emoji_google_1f1ee_1f1f7),
            new Emoji(new int[]{0x1f1ee, 0x1f1f6}, R.drawable.emoji_google_1f1ee_1f1f6),
            new Emoji(new int[]{0x1f1ee, 0x1f1ea}, R.drawable.emoji_google_1f1ee_1f1ea),
            new Emoji(new int[]{0x1f1ee, 0x1f1f2}, R.drawable.emoji_google_1f1ee_1f1f2),
            new Emoji(new int[]{0x1f1ee, 0x1f1f1}, R.drawable.emoji_google_1f1ee_1f1f1),
            new Emoji(new int[]{0x1f1ee, 0x1f1f9}, R.drawable.emoji_google_1f1ee_1f1f9),
            new Emoji(new int[]{0x1f1ef, 0x1f1f2}, R.drawable.emoji_google_1f1ef_1f1f2),
            new Emoji(new int[]{0x1f1ef, 0x1f1f5}, R.drawable.emoji_google_1f1ef_1f1f5),
            new Emoji(new int[]{0x1f38c}, R.drawable.emoji_google_1f38c),
            new Emoji(new int[]{0x1f1ef, 0x1f1ea}, R.drawable.emoji_google_1f1ef_1f1ea),
            new Emoji(new int[]{0x1f1ef, 0x1f1f4}, R.drawable.emoji_google_1f1ef_1f1f4),
            new Emoji(new int[]{0x1f1f0, 0x1f1ff}, R.drawable.emoji_google_1f1f0_1f1ff),
            new Emoji(new int[]{0x1f1f0, 0x1f1ea}, R.drawable.emoji_google_1f1f0_1f1ea),
            new Emoji(new int[]{0x1f1f0, 0x1f1ee}, R.drawable.emoji_google_1f1f0_1f1ee),
            new Emoji(new int[]{0x1f1f0, 0x1f1fc}, R.drawable.emoji_google_1f1f0_1f1fc),
            new Emoji(new int[]{0x1f1f0, 0x1f1ec}, R.drawable.emoji_google_1f1f0_1f1ec),
            new Emoji(new int[]{0x1f1f1, 0x1f1e6}, R.drawable.emoji_google_1f1f1_1f1e6),
            new Emoji(new int[]{0x1f1f1, 0x1f1fb}, R.drawable.emoji_google_1f1f1_1f1fb),
            new Emoji(new int[]{0x1f1f1, 0x1f1e7}, R.drawable.emoji_google_1f1f1_1f1e7),
            new Emoji(new int[]{0x1f1f1, 0x1f1f8}, R.drawable.emoji_google_1f1f1_1f1f8),
            new Emoji(new int[]{0x1f1f1, 0x1f1f7}, R.drawable.emoji_google_1f1f1_1f1f7),
            new Emoji(new int[]{0x1f1f1, 0x1f1fe}, R.drawable.emoji_google_1f1f1_1f1fe),
            new Emoji(new int[]{0x1f1f1, 0x1f1ee}, R.drawable.emoji_google_1f1f1_1f1ee),
            new Emoji(new int[]{0x1f1f1, 0x1f1f9}, R.drawable.emoji_google_1f1f1_1f1f9),
            new Emoji(new int[]{0x1f1f1, 0x1f1fa}, R.drawable.emoji_google_1f1f1_1f1fa),
            new Emoji(new int[]{0x1f1f2, 0x1f1f4}, R.drawable.emoji_google_1f1f2_1f1f4),
            new Emoji(new int[]{0x1f1f2, 0x1f1f0}, R.drawable.emoji_google_1f1f2_1f1f0),
            new Emoji(new int[]{0x1f1f2, 0x1f1ec}, R.drawable.emoji_google_1f1f2_1f1ec),
            new Emoji(new int[]{0x1f1f2, 0x1f1fc}, R.drawable.emoji_google_1f1f2_1f1fc),
            new Emoji(new int[]{0x1f1f2, 0x1f1fe}, R.drawable.emoji_google_1f1f2_1f1fe),
            new Emoji(new int[]{0x1f1f2, 0x1f1fb}, R.drawable.emoji_google_1f1f2_1f1fb),
            new Emoji(new int[]{0x1f1f2, 0x1f1f1}, R.drawable.emoji_google_1f1f2_1f1f1),
            new Emoji(new int[]{0x1f1f2, 0x1f1f9}, R.drawable.emoji_google_1f1f2_1f1f9),
            new Emoji(new int[]{0x1f1f2, 0x1f1ed}, R.drawable.emoji_google_1f1f2_1f1ed),
            new Emoji(new int[]{0x1f1f2, 0x1f1f7}, R.drawable.emoji_google_1f1f2_1f1f7),
            new Emoji(new int[]{0x1f1f2, 0x1f1fa}, R.drawable.emoji_google_1f1f2_1f1fa),
            new Emoji(new int[]{0x1f1f2, 0x1f1fd}, R.drawable.emoji_google_1f1f2_1f1fd),
            new Emoji(new int[]{0x1f1eb, 0x1f1f2}, R.drawable.emoji_google_1f1eb_1f1f2),
            new Emoji(new int[]{0x1f1f2, 0x1f1e9}, R.drawable.emoji_google_1f1f2_1f1e9),
            new Emoji(new int[]{0x1f1f2, 0x1f1e8}, R.drawable.emoji_google_1f1f2_1f1e8),
            new Emoji(new int[]{0x1f1f2, 0x1f1f3}, R.drawable.emoji_google_1f1f2_1f1f3),
            new Emoji(new int[]{0x1f1f2, 0x1f1ea}, R.drawable.emoji_google_1f1f2_1f1ea),
            new Emoji(new int[]{0x1f1f2, 0x1f1f8}, R.drawable.emoji_google_1f1f2_1f1f8),
            new Emoji(new int[]{0x1f1f2, 0x1f1e6}, R.drawable.emoji_google_1f1f2_1f1e6),
            new Emoji(new int[]{0x1f1f2, 0x1f1ff}, R.drawable.emoji_google_1f1f2_1f1ff),
            new Emoji(new int[]{0x1f1f2, 0x1f1f2}, R.drawable.emoji_google_1f1f2_1f1f2),
            new Emoji(new int[]{0x1f1f3, 0x1f1e6}, R.drawable.emoji_google_1f1f3_1f1e6),
            new Emoji(new int[]{0x1f1f3, 0x1f1f7}, R.drawable.emoji_google_1f1f3_1f1f7),
            new Emoji(new int[]{0x1f1f3, 0x1f1f5}, R.drawable.emoji_google_1f1f3_1f1f5),
            new Emoji(new int[]{0x1f1f3, 0x1f1f1}, R.drawable.emoji_google_1f1f3_1f1f1),
            new Emoji(new int[]{0x1f1f3, 0x1f1ff}, R.drawable.emoji_google_1f1f3_1f1ff),
            new Emoji(new int[]{0x1f1f3, 0x1f1ee}, R.drawable.emoji_google_1f1f3_1f1ee),
            new Emoji(new int[]{0x1f1f3, 0x1f1ea}, R.drawable.emoji_google_1f1f3_1f1ea),
            new Emoji(new int[]{0x1f1f3, 0x1f1ec}, R.drawable.emoji_google_1f1f3_1f1ec),
            new Emoji(new int[]{0x1f1f3, 0x1f1fa}, R.drawable.emoji_google_1f1f3_1f1fa),
            new Emoji(new int[]{0x1f1f3, 0x1f1eb}, R.drawable.emoji_google_1f1f3_1f1eb),
            new Emoji(new int[]{0x1f1f0, 0x1f1f5}, R.drawable.emoji_google_1f1f0_1f1f5),
            new Emoji(new int[]{0x1f1f2, 0x1f1f5}, R.drawable.emoji_google_1f1f2_1f1f5),
            new Emoji(new int[]{0x1f1f3, 0x1f1f4}, R.drawable.emoji_google_1f1f3_1f1f4),
            new Emoji(new int[]{0x1f1f4, 0x1f1f2}, R.drawable.emoji_google_1f1f4_1f1f2),
            new Emoji(new int[]{0x1f1f5, 0x1f1f0}, R.drawable.emoji_google_1f1f5_1f1f0),
            new Emoji(new int[]{0x1f1f5, 0x1f1fc}, R.drawable.emoji_google_1f1f5_1f1fc),
            new Emoji(new int[]{0x1f1f5, 0x1f1f8}, R.drawable.emoji_google_1f1f5_1f1f8),
            new Emoji(new int[]{0x1f1f5, 0x1f1e6}, R.drawable.emoji_google_1f1f5_1f1e6),
            new Emoji(new int[]{0x1f1f5, 0x1f1ec}, R.drawable.emoji_google_1f1f5_1f1ec),
            new Emoji(new int[]{0x1f1f5, 0x1f1fe}, R.drawable.emoji_google_1f1f5_1f1fe),
            new Emoji(new int[]{0x1f1f5, 0x1f1ea}, R.drawable.emoji_google_1f1f5_1f1ea),
            new Emoji(new int[]{0x1f1f5, 0x1f1ed}, R.drawable.emoji_google_1f1f5_1f1ed),
            new Emoji(new int[]{0x1f1f5, 0x1f1f3}, R.drawable.emoji_google_1f1f5_1f1f3),
            new Emoji(new int[]{0x1f1f5, 0x1f1f1}, R.drawable.emoji_google_1f1f5_1f1f1),
            new Emoji(new int[]{0x1f1f5, 0x1f1f9}, R.drawable.emoji_google_1f1f5_1f1f9),
            new Emoji(new int[]{0x1f1f5, 0x1f1f7}, R.drawable.emoji_google_1f1f5_1f1f7),
            new Emoji(new int[]{0x1f1f6, 0x1f1e6}, R.drawable.emoji_google_1f1f6_1f1e6),
            new Emoji(new int[]{0x1f1f7, 0x1f1f4}, R.drawable.emoji_google_1f1f7_1f1f4),
            new Emoji(new int[]{0x1f1f7, 0x1f1fa}, R.drawable.emoji_google_1f1f7_1f1fa),
            new Emoji(new int[]{0x1f1f7, 0x1f1fc}, R.drawable.emoji_google_1f1f7_1f1fc),
            new Emoji(new int[]{0x1f1fc, 0x1f1f8}, R.drawable.emoji_google_1f1fc_1f1f8),
            new Emoji(new int[]{0x1f1f8, 0x1f1f2}, R.drawable.emoji_google_1f1f8_1f1f2),
            new Emoji(new int[]{0x1f1f8, 0x1f1f9}, R.drawable.emoji_google_1f1f8_1f1f9),
            new Emoji(new int[]{0x1f1f8, 0x1f1e6}, R.drawable.emoji_google_1f1f8_1f1e6),
            new Emoji(new int[]{0x1f1f8, 0x1f1f3}, R.drawable.emoji_google_1f1f8_1f1f3),
            new Emoji(new int[]{0x1f1f7, 0x1f1f8}, R.drawable.emoji_google_1f1f7_1f1f8),
            new Emoji(new int[]{0x1f1f8, 0x1f1e8}, R.drawable.emoji_google_1f1f8_1f1e8),
            new Emoji(new int[]{0x1f1f8, 0x1f1f1}, R.drawable.emoji_google_1f1f8_1f1f1),
            new Emoji(new int[]{0x1f1f8, 0x1f1ec}, R.drawable.emoji_google_1f1f8_1f1ec),
            new Emoji(new int[]{0x1f1f8, 0x1f1fd}, R.drawable.emoji_google_1f1f8_1f1fd),
            new Emoji(new int[]{0x1f1f8, 0x1f1f0}, R.drawable.emoji_google_1f1f8_1f1f0),
            new Emoji(new int[]{0x1f1f8, 0x1f1ee}, R.drawable.emoji_google_1f1f8_1f1ee),
            new Emoji(new int[]{0x1f1f8, 0x1f1e7}, R.drawable.emoji_google_1f1f8_1f1e7),
            new Emoji(new int[]{0x1f1f8, 0x1f1f4}, R.drawable.emoji_google_1f1f8_1f1f4),
            new Emoji(new int[]{0x1f1ff, 0x1f1e6}, R.drawable.emoji_google_1f1ff_1f1e6),
            new Emoji(new int[]{0x1f1f0, 0x1f1f7}, R.drawable.emoji_google_1f1f0_1f1f7),
            new Emoji(new int[]{0x1f1f8, 0x1f1f8}, R.drawable.emoji_google_1f1f8_1f1f8),
            new Emoji(new int[]{0x1f1ea, 0x1f1f8}, R.drawable.emoji_google_1f1ea_1f1f8),
            new Emoji(new int[]{0x1f1f1, 0x1f1f0}, R.drawable.emoji_google_1f1f1_1f1f0),
            new Emoji(new int[]{0x1f1f8, 0x1f1ed}, R.drawable.emoji_google_1f1f8_1f1ed),
            new Emoji(new int[]{0x1f1f0, 0x1f1f3}, R.drawable.emoji_google_1f1f0_1f1f3),
            new Emoji(new int[]{0x1f1f1, 0x1f1e8}, R.drawable.emoji_google_1f1f1_1f1e8),
            new Emoji(new int[]{0x1f1fb, 0x1f1e8}, R.drawable.emoji_google_1f1fb_1f1e8),
            new Emoji(new int[]{0x1f1f8, 0x1f1e9}, R.drawable.emoji_google_1f1f8_1f1e9),
            new Emoji(new int[]{0x1f1f8, 0x1f1f7}, R.drawable.emoji_google_1f1f8_1f1f7),
            new Emoji(new int[]{0x1f1f8, 0x1f1ff}, R.drawable.emoji_google_1f1f8_1f1ff),
            new Emoji(new int[]{0x1f1f8, 0x1f1ea}, R.drawable.emoji_google_1f1f8_1f1ea),
            new Emoji(new int[]{0x1f1e8, 0x1f1ed}, R.drawable.emoji_google_1f1e8_1f1ed),
            new Emoji(new int[]{0x1f1f8, 0x1f1fe}, R.drawable.emoji_google_1f1f8_1f1fe),
            new Emoji(new int[]{0x1f1f9, 0x1f1fc}, R.drawable.emoji_google_1f1f9_1f1fc),
            new Emoji(new int[]{0x1f1f9, 0x1f1ef}, R.drawable.emoji_google_1f1f9_1f1ef),
            new Emoji(new int[]{0x1f1f9, 0x1f1ff}, R.drawable.emoji_google_1f1f9_1f1ff),
            new Emoji(new int[]{0x1f1f9, 0x1f1ed}, R.drawable.emoji_google_1f1f9_1f1ed),
            new Emoji(new int[]{0x1f1f9, 0x1f1f1}, R.drawable.emoji_google_1f1f9_1f1f1),
            new Emoji(new int[]{0x1f1f9, 0x1f1ec}, R.drawable.emoji_google_1f1f9_1f1ec),
            new Emoji(new int[]{0x1f1f9, 0x1f1f0}, R.drawable.emoji_google_1f1f9_1f1f0),
            new Emoji(new int[]{0x1f1f9, 0x1f1f4}, R.drawable.emoji_google_1f1f9_1f1f4),
            new Emoji(new int[]{0x1f1f9, 0x1f1f9}, R.drawable.emoji_google_1f1f9_1f1f9),
            new Emoji(new int[]{0x1f1f9, 0x1f1f3}, R.drawable.emoji_google_1f1f9_1f1f3),
            new Emoji(new int[]{0x1f1f9, 0x1f1f7}, R.drawable.emoji_google_1f1f9_1f1f7),
            new Emoji(new int[]{0x1f1f9, 0x1f1f2}, R.drawable.emoji_google_1f1f9_1f1f2),
            new Emoji(new int[]{0x1f1f9, 0x1f1e8}, R.drawable.emoji_google_1f1f9_1f1e8),
            new Emoji(new int[]{0x1f1f9, 0x1f1fb}, R.drawable.emoji_google_1f1f9_1f1fb),
            new Emoji(new int[]{0x1f1fb, 0x1f1ee}, R.drawable.emoji_google_1f1fb_1f1ee),
            new Emoji(new int[]{0x1f1fa, 0x1f1ec}, R.drawable.emoji_google_1f1fa_1f1ec),
            new Emoji(new int[]{0x1f1fa, 0x1f1e6}, R.drawable.emoji_google_1f1fa_1f1e6),
            new Emoji(new int[]{0x1f1e6, 0x1f1ea}, R.drawable.emoji_google_1f1e6_1f1ea),
            new Emoji(new int[]{0x1f1ec, 0x1f1e7}, R.drawable.emoji_google_1f1ec_1f1e7),
            new Emoji(new int[]{0x1f3f4, 0xe0067, 0xe0062, 0xe0065, 0xe006e, 0xe0067, 0xe007f}, R.drawable.emoji_google_1f3f4_e0067_e0062_e0065_e006e_e0067_e007f),
            new Emoji(new int[]{0x1f3f4, 0xe0067, 0xe0062, 0xe0073, 0xe0063, 0xe0074, 0xe007f}, R.drawable.emoji_google_1f3f4_e0067_e0062_e0073_e0063_e0074_e007f),
            new Emoji(new int[]{0x1f3f4, 0xe0067, 0xe0062, 0xe0077, 0xe006c, 0xe0073, 0xe007f}, R.drawable.emoji_google_1f3f4_e0067_e0062_e0077_e006c_e0073_e007f),
            new Emoji(new int[]{0x1f1fa, 0x1f1f8}, R.drawable.emoji_google_1f1fa_1f1f8),
            new Emoji(new int[]{0x1f1fa, 0x1f1fe}, R.drawable.emoji_google_1f1fa_1f1fe),
            new Emoji(new int[]{0x1f1fa, 0x1f1ff}, R.drawable.emoji_google_1f1fa_1f1ff),
            new Emoji(new int[]{0x1f1fb, 0x1f1fa}, R.drawable.emoji_google_1f1fb_1f1fa),
            new Emoji(new int[]{0x1f1fb, 0x1f1e6}, R.drawable.emoji_google_1f1fb_1f1e6),
            new Emoji(new int[]{0x1f1fb, 0x1f1ea}, R.drawable.emoji_google_1f1fb_1f1ea),
            new Emoji(new int[]{0x1f1fb, 0x1f1f3}, R.drawable.emoji_google_1f1fb_1f1f3),
            new Emoji(new int[]{0x1f1fe, 0x1f1ea}, R.drawable.emoji_google_1f1fe_1f1ea),
            new Emoji(new int[]{0x1f1ff, 0x1f1f2}, R.drawable.emoji_google_1f1ff_1f1f2),
            new Emoji(new int[]{0x1f1ff, 0x1f1fc}, R.drawable.emoji_google_1f1ff_1f1fc),

    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_google_category_flags;
    }
}
