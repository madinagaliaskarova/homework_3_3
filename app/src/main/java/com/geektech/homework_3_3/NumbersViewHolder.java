package com.geektech.homework_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersViewHolder extends RecyclerView.ViewHolder {

    private TextView NumbersList;

    public NumbersViewHolder(@NonNull View itemView) {
        super(itemView);
        NumbersList = itemView.findViewById(R.id.numbers);
    }


        public void bind(String numbers ){
            NumbersList.setText(numbers);
        }

    }

