package com.zx.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //先试着反射一下
            Class<?> OkHttpClient = Class.forName("javax.net.ssl.HostnameVerifier", true,getClassLoader());


            if(OkHttpClient==null){
                //特征寻找
                Log.e("tttttttttttt","tttttttttttttttttttttttt    ");
            }else {
                Log.e("tttttttttttt","444444444444444444444             ");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.e("tttttttttttt","11111111111111111111222222222222222222222");


        }


    }
}
