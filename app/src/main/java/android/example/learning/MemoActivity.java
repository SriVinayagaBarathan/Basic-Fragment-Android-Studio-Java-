package android.example.learning;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MemoActivity extends AppCompatActivity {




    BottomNavigationView navi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);


        navi=findViewById(R.id.bnv);

        //Set Memo Selected
        navi.setSelectedItemId(R.id.memoid);


        //Perform ItemSelectedListener

        navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.homeid:
                        Intent memoFragmentIntent=new Intent(MemoActivity.this,MainActivity.class);
                        startActivity(memoFragmentIntent);
                        overridePendingTransition(0,0);
                        Toast.makeText(MemoActivity.this,"HomeActivity Switched!",Toast.LENGTH_SHORT).show();

                        return true;

                    case R.id.memoid:

                        Toast.makeText(MemoActivity.this,"Already in MemoActivity!",Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.roleid:
                        Intent roleFragmentIntent=new Intent(MemoActivity.this,RoleActivity.class);
                        startActivity(roleFragmentIntent);
                        overridePendingTransition(0,0);
                        Toast.makeText(MemoActivity.this,"RoleActivity Switched!",Toast.LENGTH_SHORT).show();
                        return true;
                }

                return false;
            }
        });
    }
}