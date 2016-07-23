package com.example.michael.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunAct extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private TextView mFactTextView;
    private Button mShowButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        mFactTextView = (TextView) findViewById(R.id.funFactsTxt);
        mShowButton = (Button) findViewById(R.id.showFactsBtn);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.mRelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowButton.setTextColor(color);
            }

        };

        mShowButton.setOnClickListener(listener);
    }
}
