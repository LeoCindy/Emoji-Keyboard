package com.leonardpark.emoji_sample;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.leonardpark.emoji.EmojiEditText;
import com.leonardpark.emoji.EmojiManager;
import com.leonardpark.emoji.EmojiPopup;
import com.leonardpark.emoji.emoji.Emoji;
import com.leonardpark.emoji.google.GoogleEmojiProvider;
import com.leonardpark.emoji.listeners.OnEmojiBackspaceClickListener;
import com.leonardpark.emoji.listeners.OnEmojiClickedListener;
import com.leonardpark.emoji.listeners.OnEmojiPopupDismissListener;
import com.leonardpark.emoji.listeners.OnEmojiPopupShownListener;
import com.leonardpark.emoji.listeners.OnSoftKeyboardCloseListener;
import com.leonardpark.emoji.listeners.OnSoftKeyboardOpenListener;

public class MainActivity extends AppCompatActivity {

    String TAG = "Emoji - MainActivity";


    ChatAdapter chatAdapter;

    EmojiPopup emojiPopup;

    EmojiEditText editText;
    ViewGroup rootView;
    ImageView emojiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        chatAdapter = new ChatAdapter();

        editText = findViewById(R.id.main_activity_chat_bottom_message_edittext);
        rootView = findViewById(R.id.main_activity_root_view);
        emojiButton = findViewById(R.id.main_activity_emoji);
        final ImageView sendButton = findViewById(R.id.main_activity_send);

        emojiButton.setColorFilter(ContextCompat.getColor(this, R.color.emoji_icons), PorterDuff.Mode.SRC_IN);
        sendButton.setColorFilter(ContextCompat.getColor(this, R.color.emoji_icons), PorterDuff.Mode.SRC_IN);

        emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                emojiPopup.toggle();
            }
        });
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if(editText.getText()!=null) {
                    final String text = editText.getText().toString().trim();

                    if (text.length() > 0) {
                        chatAdapter.add(text);

                        editText.setText("");
                    }
                }
            }
        });

        final RecyclerView recyclerView = findViewById(R.id.main_activity_recycler_view);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        setUpEmojiPopup();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.switch_ios:
                //EmojiManager.install(new IosEmojiProvider());
                return true;
            case R.id.switch_google:
                EmojiManager.install(new GoogleEmojiProvider());
                recreate();
                return true;
            case R.id.switch_microsoft:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            case R.id.switch_samsung:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            case R.id.switch_twitter:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            case R.id.switch_facebook:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            case R.id.switch_emojione:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            case R.id.switch_emojipedia:
                //EmojiManager.install(new GoogleEmojiProvider());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (emojiPopup != null && emojiPopup.isShowing()) {
            emojiPopup.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStop() {
        if (emojiPopup != null) {
            emojiPopup.dismiss();
        }

        super.onStop();
    }

    private void setUpEmojiPopup() {
        emojiPopup = EmojiPopup.Builder.fromRootView(rootView)
                .setOnEmojiBackspaceClickListener(new OnEmojiBackspaceClickListener() {
                    @Override
                    public void onEmojiBackspaceClicked(final View v) {
                        Log.d(TAG, "Clicked on Backspace");
                    }
                })
                .setOnEmojiClickedListener(new OnEmojiClickedListener() {
                    @Override
                    public void onEmojiClicked(final Emoji emoji) {
                        Log.d(TAG, "Clicked on emoji");
                    }
                })
                .setOnEmojiPopupShownListener(new OnEmojiPopupShownListener() {
                    @Override
                    public void onEmojiPopupShown() {
                        emojiButton.setImageResource(R.drawable.ic_keyboard);
                    }
                })
                .setOnSoftKeyboardOpenListener(new OnSoftKeyboardOpenListener() {
                    @Override
                    public void onKeyboardOpen(final int keyBoardHeight) {
                        Log.d(TAG, "Opened soft keyboard");
                    }
                })
                .setOnEmojiPopupDismissListener(new OnEmojiPopupDismissListener() {
                    @Override
                    public void onEmojiPopupDismiss() {
                        emojiButton.setImageResource(R.drawable.emoji_google_category_people);
                    }
                })
                .setOnSoftKeyboardCloseListener(new OnSoftKeyboardCloseListener() {
                    @Override
                    public void onKeyboardClose() {
                        Log.d(TAG, "Closed soft keyboard");
                    }
                })
                .build(editText);
    }
}
