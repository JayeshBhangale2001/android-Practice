package com.example.myapplication; // Replace with your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AddExpenseActivity extends AppCompatActivity {

    EditText editTextNumber, editTextDescription, editTextTag;
    Button buttonAddExpense;
    TableLayout tableLayoutExpenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextDescription = findViewById(R.id.editTextDescription);
        editTextTag = findViewById(R.id.editTextTag);
        buttonAddExpense = findViewById(R.id.buttonAddExpense);
        tableLayoutExpenses = findViewById(R.id.tableLayoutExpenses);

        buttonAddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editTextNumber.getText().toString();
                String description = editTextDescription.getText().toString();
                String tag = editTextTag.getText().toString();

                addExpenseToTable(number, description, tag);
            }
        });
    }

    private void addExpenseToTable(String number, String description, String tag) {
        TableRow newRow = new TableRow(this);

        TextView textViewNumber = new TextView(this);
        TextView textViewDescription = new TextView(this);
        TextView textViewTag = new TextView(this);

        textViewNumber.setText(number);
        textViewDescription.setText(description);
        textViewTag.setText(tag);

        newRow.addView(textViewNumber);
        newRow.addView(textViewDescription);
        newRow.addView(textViewTag);

        tableLayoutExpenses.addView(newRow);
    }
}
