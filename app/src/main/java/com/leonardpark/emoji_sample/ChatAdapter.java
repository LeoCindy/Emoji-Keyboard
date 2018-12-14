package com.leonardpark.emoji_sample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonardpark.emoji.EmojiTextView;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private List<String> texts = new ArrayList<>();

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_chat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder chatViewHolder, int position) {
        chatViewHolder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }

    public void add(String text) {
        texts.add(text);
        notifyDataSetChanged();
    }

    class ChatViewHolder extends RecyclerView.ViewHolder {
        EmojiTextView textView;

        ChatViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.adapter_chat_text_view);
        }

        void onBind(int pos){
            final String text = texts.get(pos);
            textView.setText(text);
        }

    }
}

