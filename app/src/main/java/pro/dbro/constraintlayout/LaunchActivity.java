package pro.dbro.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void onRelativeLayoutClick(View view) {
        startActivity(new Intent(this, RelativeActivity.class));
    }

    public void onConstraintLayoutClick(View view) {
        startActivity(new Intent(this, ConstraintActivity.class));

    }
}
