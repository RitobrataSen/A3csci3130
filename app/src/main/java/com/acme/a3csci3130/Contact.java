package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Contact implements Serializable {

    public  String number;
    public  String name;
    public  String address;
    public  String primaryBusiness;
    public  String province;
    public Contact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Contact(String name, String num, String primaryBusiness){
        this.name=name;
        this.number=num;
        this.primaryBusiness=primaryBusiness;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", name);
        result.put("name", address);
        result.put("123456789",number);
        result.put("BC",province);
        result.put("FishMonger",primaryBusiness);

        return result;
    }
}
