package android.example.learning;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    BottomNavigationView navi;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navi=findViewById(R.id.bnv);

        //Set Home Selected
        navi.setSelectedItemId(R.id.homeid);


        //Perform ItemSelectedListener

        navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
              switch(menuItem.getItemId())
              {
                  case R.id.homeid:
                      Toast.makeText(MainActivity.this,"Already in Home Space",Toast.LENGTH_SHORT).show();

                      return true;

                  case R.id.memoid:
                      Intent memoFragmentIntent=new Intent(MainActivity.this,MemoActivity.class);
                      startActivity(memoFragmentIntent);
                      overridePendingTransition(0,0);
                      Toast.makeText(MainActivity.this,"MemoActivity Switched!",Toast.LENGTH_SHORT).show();


                      return true;

                  case R.id.roleid:
                      Intent roleFragmentIntent=new Intent(MainActivity.this,RoleActivity.class);
                      startActivity(roleFragmentIntent);
                      overridePendingTransition(0,0);
                      Toast.makeText(MainActivity.this,"RoleActivity Switched!",Toast.LENGTH_SHORT).show();

                      return true;
              }

                return false;
            }
        });



    }
}