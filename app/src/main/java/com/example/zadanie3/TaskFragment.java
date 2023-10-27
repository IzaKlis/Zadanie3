package com.example.zadanie3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TaskFragment extends Fragment {
    Task task = new Task();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View oncreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);

        EditText name = view.findViewById(R.id.task_name);
        Button date = view.findViewById(R.id.task_date);
        CheckBox checkBox = view.findViewById(R.id.task_done);

        name.setText(task.getName());
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //empty
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                task.setName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        date.setText(task.getDate().toString());
        date.setEnabled(false);

        checkBox.setChecked(task.isDone());
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            task.setDone(isChecked);
        });
        return view;
    }
}