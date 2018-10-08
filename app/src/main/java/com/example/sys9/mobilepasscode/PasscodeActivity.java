package com.example.sys9.mobilepasscode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hanks.passcodeview.PasscodeView;

public class PasscodeActivity extends AppCompatActivity{
    PasscodeView passcodeview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);
        final PasscodeView passcodeView = (PasscodeView) findViewById(R.id.passcodeView);
        passcodeView.setListener(new PasscodeView.PasscodeViewListener() {
            @Override
            public void onFail() {

            }

            @Override
            public void onSuccess(String number) {
                Toast.makeText(getApplication(), "finish", Toast.LENGTH_SHORT).show();
                onBackPressed();
                Intent I=new Intent(PasscodeActivity.this,PasscodeActivity3.class);

              startActivity(I);

            }
        });
    }
}