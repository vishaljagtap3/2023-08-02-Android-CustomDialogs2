package com.bitcodetech.customdialogs2;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDialog extends Dialog {
    private EditText edtUsername, edtPassword;
    private Button btnSignIn;

    public LoginDialog(Context context) {
        super(context);

        setContentView(R.layout.login_dialog);
        initViews();

        btnSignIn.setOnClickListener(new BtnSignInClickListener());
    }

    private class BtnSignInClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if(edtUsername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode")) {
                mt("Login Successful!");
                dismiss();
            }
            else {
                mt("Login Failed!");
            }
        }
    }

    private void mt(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }

    private void initViews() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
    }
}
