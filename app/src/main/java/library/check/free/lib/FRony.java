package library.check.free.lib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sandeep.test.Main2Activity;
import com.example.sandeep.test.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FRony extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frony);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.save_user)
    public void startIntentToSaveUser() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.view_user)
    public void startIntentToViewUser() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}