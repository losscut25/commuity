package com.example.sns_project2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.signUpButton).setOnClickListener(onClickListener);
        findViewById(R.id.gotoLoginbutton).setOnClickListener(onClickListener);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }


    View.OnClickListener onClickListener = (v) -> {
            switch (v.getId()) {
                case R.id.signUpButton:
                    signUp();
                    break;
                case R.id.gotoLoginbutton:
                    myStartActivity(LoginActivity.class);
                    break;
            }
        };



        private void signUp() {
            String email = ((EditText) findViewById(R.id.emailEditText)).getText().toString();
            String password = ((EditText) findViewById(R.id.passwordEditText)).getText().toString();
            String passwordCheck = ((EditText) findViewById(R.id.passwordcheckEditText)).getText().toString();

            if (email.length() > 0 && password.length() > 0 && passwordCheck.length() > 0) {

                if (password.equals(passwordCheck)) {
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(this, (task) -> {
                                if (task.isSuccessful()) {
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    startToast("??????????????? ???????????????.");
                                    myStartActivity(MainActivity.class);
                                    //UI
                                } else {
                                    if (task.getException() != null) {
                                        startToast(task.getException().toString());
                                    }
                                }
                            });

                } else {
                    startToast("??????????????? ???????????? ????????????.");
                }
            } else {
                startToast("????????? ?????? ??????????????? ??????????????????");

            }
        }

        private void startToast(String msg) {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
    private void myStartActivity(Class c) {
        Intent intent = new Intent(this, c);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
     }

    }
