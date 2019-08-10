package com.digital.honed.examendespegar.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        showSnackBarMessage();
    }

    public abstract int getLayoutId();

    private void showSnackBarMessage() {
        String message = getIntent().getStringExtra("SNACK_BAR_MESSAGE");
        if(message != null){
            Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }
}
