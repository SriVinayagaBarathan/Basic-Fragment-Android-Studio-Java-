package android.example.learning;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class RoleActivity extends AppCompatActivity {


    BottomNavigationView navi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);

        navi=findViewById(R.id.bnv);

        //Set Role Selected
        navi.setSelectedItemId(R.id.roleid);


        //Perform ItemSelectedListener

        navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.homeid:
                        Intent memoFragmentIntent=new Intent(RoleActivity.this,MainActivity.class);
                        startActivity(memoFragmentIntent);
                        overridePendingTransition(0,0);
                        Toast.makeText(RoleActivity.this,"HomeActivity Switched!",Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.memoid:
                        Intent roleFragmentIntent=new Intent(RoleActivity.this,MemoActivity.class);
                        startActivity(roleFragmentIntent);
                        overridePendingTransition(0,0);
                        Toast.makeText(RoleActivity.this,"MemoActivity Switched!",Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.roleid:

                        Toast.makeText(RoleActivity.this,"Already in RoleActivity!",Toast.LENGTH_SHORT).show();
                        return true;
                }

                return false;
            }
        });
    }
}