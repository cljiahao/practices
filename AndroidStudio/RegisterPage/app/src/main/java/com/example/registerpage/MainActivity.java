package com.example.registerpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText nameEdit, emailEdit, passEdit, rePassEdit;
    private Button registerBut, imageButton;
    private TextView nameTxt, emailTxt, passTxt, rePassTxt, termsTxt, countryTxt;
    private ImageView clipImage;
    private Spinner countrySpin;
    private RadioGroup genderRadio;
    private CheckBox agreeBox;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi!", Toast.LENGTH_SHORT).show();
            }
        });

        registerBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRegister();
            }
        });

    }

    private void initViews() {

        Log.d(TAG, "initViews: Started");

        nameEdit = findViewById(R.id.nameEdit);
        nameTxt = findViewById(R.id.nameTxt);
        emailEdit = findViewById(R.id.emailEdit);
        emailTxt = findViewById(R.id.emailTxt);

        passEdit = findViewById(R.id.passEdit);
        passTxt = findViewById(R.id.passTxt);
        rePassEdit = findViewById(R.id.rePassEdit);
        rePassTxt = findViewById(R.id.rePassTxt);

        termsTxt = findViewById(R.id.termsTxt);

        registerBut = findViewById(R.id.registerBut);
        imageButton = findViewById(R.id.imageButton);

        clipImage = findViewById(R.id.clipImage);

        genderRadio = findViewById(R.id.radioGroup);

        countrySpin = findViewById(R.id.countrySpin);
        countryTxt = findViewById(R.id.countryTxt);

        agreeBox = findViewById(R.id.agreeBox);

        parent = findViewById(R.id.parent);

    }

    private void initRegister() {

        Log.d(TAG, "initRegister: Started");

        if (dataValidated()) {
            if (agreeBox.isChecked()) {
                if (samePass()) {
                    if (passCriteria()) {
                        showSnackBar();
                    } else {
                        Toast.makeText(MainActivity.this, "Password Length less than 8!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                Toast.makeText(MainActivity.this, "Password do not match!!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "You need to agree to the License Agreement", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean dataValidated() {

        Log.d(TAG, "dataValidated: Started");

        if (nameEdit.getText().toString().equals("")) {
            nameTxt.setVisibility(View.VISIBLE);
            return false;
        }
        if (emailEdit.getText().toString().equals("")) {
            emailTxt.setVisibility(View.VISIBLE);
            return false;
        }
        if (passEdit.getText().toString().equals("")) {
            passTxt.setVisibility(View.VISIBLE);
            return false;
        }
        if (rePassEdit.getText().toString().equals("")) {
            rePassTxt.setVisibility(View.VISIBLE);
            return false;
        }
        return true;
    }

    private boolean passCriteria() {
        if (passEdit.getText().toString().length() >= 8) {
            return true;
        }
        return false;
    }

    private boolean samePass() {
        if (passEdit.getText().toString().equals(rePassEdit.getText().toString())) {
            return true;
        }
        return false;
    }

    private void showSnackBar() {
        Log.d(TAG,"showSnackBar: Started");

        nameTxt.setVisibility(View.GONE);
        emailTxt.setVisibility(View.GONE);
        passTxt.setVisibility(View.GONE);
        rePassTxt.setVisibility(View.GONE);

        String name = nameEdit.getText().toString();
        String email = emailEdit.getText().toString();
        String country = countrySpin.getSelectedItem().toString();
        String gender = "";

        switch (genderRadio.getCheckedRadioButtonId()) {
            case R.id.maleRadio:
                gender = "Male";
                break;
            case R.id.femaleRadio:
                gender = "Female";
                break;
            case R.id.otherRadio:
                gender = "Others";
                break;
            default:
                gender = "Unknown";
                break;
        }

        String snackbar = "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Gender: " + gender + "\n" +
                "Country: " + country;

        Snackbar.make(parent, "User Registered", Snackbar.LENGTH_INDEFINITE)
                .setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameEdit.setText("");
                emailEdit.setText("");
                passEdit.setText("");
                rePassEdit.setText("");
            }
        }).show();

    }

}