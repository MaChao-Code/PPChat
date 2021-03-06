package com.mc.ppchat;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class RegisterActivity extends BaseActivity implements OnClickListener {
    ImageView vc_image; // 图片
    Button vc_refresh, vc_ok;
    String getCode = null;
    EditText vc_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        vc_image = (ImageView) findViewById(R.id.vc_image);
        vc_image.setImageBitmap(Code.getInstance().getBitmap());
        vc_code = (EditText) findViewById(R.id.vc_code);
        getCode = Code.getInstance().getCode(); // 获取显示的验证码
        vc_refresh = (Button) findViewById(R.id.vc_refresh);
        vc_refresh.setOnClickListener(this);
        vc_ok = (Button) findViewById(R.id.vc_ok);
        vc_ok.setOnClickListener(this);
    }
    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//// Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
    @Override
    public void onClick(View view) {
// TODO Auto-generated method stub
        switch (view.getId()) {
            case R.id.vc_refresh:
                vc_image.setImageBitmap(Code.getInstance().getBitmap());
                getCode = Code.getInstance().getCode();
                break;
            case R.id.vc_ok:
                String v_code = vc_code.getText().toString().trim();
                if (v_code == null || v_code.equals("")) {
                    Toast.makeText(RegisterActivity.this, "验证码为空", Toast.LENGTH_SHORT).show();
                } else if (!v_code.equals(getCode)) {
                    Toast.makeText(RegisterActivity.this, "验证码错误", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "注册成功,跳转到登录页面", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
                break;
        }

    }
}



