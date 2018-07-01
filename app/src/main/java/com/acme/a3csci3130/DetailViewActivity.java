package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText nameField, numberField, primaryBusinessField, addressField, provinceField;
    Contact receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Contact)getIntent().getSerializableExtra("Contact");

        nameField = (EditText) findViewById(R.id.name);
        numberField = (EditText) findViewById(R.id.number);
        primaryBusinessField = (EditText) findViewById(R.id.primaryBusiness);
        addressField = (EditText) findViewById(R.id.addressField);
        provinceField = (EditText) findViewById(R.id.provinceField);

        if(receivedPersonInfo != null){
            nameField.setText(receivedPersonInfo.name);
            numberField.setText(receivedPersonInfo.number);
            primaryBusinessField.setText(receivedPersonInfo.primaryBusiness);
            addressField.setText(receivedPersonInfo.address);
            provinceField.setText(receivedPersonInfo.province);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality

        if(!nameField.getText().toString().equals(receivedPersonInfo.name))
            receivedPersonInfo.name = nameField.getText().toString();
        if(!numberField.getText().toString().equals(receivedPersonInfo.number))
            receivedPersonInfo.number = numberField.getText().toString();
        if(!primaryBusinessField.getText().toString().equals(receivedPersonInfo.primaryBusiness))
            receivedPersonInfo.primaryBusiness = primaryBusinessField.getText().toString();
        if(!addressField.getText().toString().equals(receivedPersonInfo.address))
            receivedPersonInfo.address = addressField.getText().toString();
        if(!provinceField.getText().toString().equals(receivedPersonInfo.province))
            receivedPersonInfo.province= provinceField.getText().toString();


    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality

    }
}
