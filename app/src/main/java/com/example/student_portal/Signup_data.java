package com.example.student_portal;

public class Signup_data {
    int _id,sem;
    String First_name,Last_name,email,phone,pass;
    public Signup_data(){}

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Signup_data(int _id, String First_name, String Last_name, int sem, String email, String pass, String phone){
        this._id=_id;
        this.First_name=First_name;
        this.Last_name=Last_name;
        this.sem=sem;
        this.email=email;
        this.pass=pass;
        this.phone=phone;
    }
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
