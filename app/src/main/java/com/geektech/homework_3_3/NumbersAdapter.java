package com.geektech.homework_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersAdapter extends RecyclerView.Adapter <NumbersViewHolder> {
    private ArrayList<String> numbers = new ArrayList<>();

    public NumbersAdapter(ArrayList<String> numbers){
        this.numbers = numbers;
    }


    @NonNull
    @Override
    public NumbersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumbersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersViewHolder holder, int position) {
        holder.bind(numbers.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }


}
