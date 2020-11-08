package com.touchizen.drawerwithbottomnavigation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import org.w3c.dom.Text;

import java.util.List;

public class NostraAdapter extends RecyclerView.Adapter {
    List<QuesAns> fetchData;

    public NostraAdapter(List<QuesAns> fetchData) {
        this.fetchData = fetchData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quesans,parent,false);
        viewHolder viewHolderClass =new viewHolder(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        viewHolder viewHolder=(NostraAdapter.viewHolder)holder;
        QuesAns qa = fetchData.get(position);
        viewHolder.question.setText(qa.getQuestion());
        viewHolder.answer.setText(qa.getAnswer());
    }

    @Override
    public int getItemCount() {
        return fetchData.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView question,answer;
        public  viewHolder(View itemView){
            super(itemView);
            question = itemView.findViewById(R.id.question);
            answer =itemView.findViewById(R.id.answer);
        }
    }
}
