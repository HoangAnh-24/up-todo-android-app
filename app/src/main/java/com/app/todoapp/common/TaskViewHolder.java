package com.app.todoapp.common;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.todoapp.R;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    public CheckBox checkBox;
    public TextView title;
    public TextView dueDate;
    public TextView category;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        checkBox = itemView.findViewById(R.id.checkBox);
        title = itemView.findViewById(R.id.taskTitle);
        dueDate = itemView.findViewById(R.id.taskDueDate);
        category = itemView.findViewById(R.id.taskCategory);
    }
}