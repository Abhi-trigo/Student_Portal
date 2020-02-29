package com.example.student_portal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText Roll,full,email,pass,phone,sem;
    Button register;
    //Button register,login;
    String roll,name,emails,pass1,tel,sem1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Roll=(EditText) findViewById(R.id.et_id);
        full=(EditText)findViewById(R.id.et_name);
        email=(EditText)findViewById(R.id.et_email);
        pass=(EditText)findViewById(R.id.et_password);
        phone=(EditText)findViewById(R.id.et_Phone);
        sem=(EditText)findViewById(R.id.et_sem);
        register=findViewById(R.id.btn_register);
        Log.d("register","register");
        Button login=findViewById(R.id.btn_login);
        ViewPager viewPager = findViewById(R.id.viewPager);
        AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragmet(new LoginFragment());
        pagerAdapter.addFragmet(new RegisterFragment());
        viewPager.setAdapter(pagerAdapter);
        final Database_Handler  db =new Database_Handler(this);
        Log.d("before","before");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("click","click");
                //roll=Roll.getText().toString();
                //name=full.getText().toString();
                //emails=email.getText().toString();
                //pass1=pass.getText().toString();
                //tel=phone.getText().toString();
              //  sem1=sem.getText().toString();
                //db.erase();
            //    Log.d("erase","erase");
                //Log.d("Insert ","Inserting");
                //db.adddata(new Signup_data(001,"Ravi","Jain",1,"asaini@gmail.com","abhi","12345678"));
                //db.adddata(new Signup_data(002,"Ravi","Jain",1,"asaini@gmail.com","abhi","12345678"));
                //db.adddata(new Signup_data(003,"Ravis","Jain",1,"asaini@gmail.com","abhi","12345678"));
                //Log.d("Reading ","Reading all contacts..");
                //int value=db.getvalue();
                //Log.d("entries", String.valueOf(value));
            }
        });
    }

    class AuthenticationPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        void addFragmet(Fragment fragment) {
            fragmentList.add(fragment);
        }
    }
}
