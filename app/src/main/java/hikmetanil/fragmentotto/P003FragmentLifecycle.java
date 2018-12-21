package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import hikmetanil.fragmentotto.fragment.P003Fragment;

public class P003FragmentLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003fragment_lifecyc);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.relativelayoutP003,new P003Fragment());
        fragmentTransaction.commit();
        Log.i("fragment_lifecycle","activity_onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("fragment_lifecycle","activity_onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("fragment_lifecycle","activity_onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("fragment_lifecycle","activity_onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("fragment_lifecycle","activity_onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("fragment_lifecycle","activity_onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("fragment_lifecycle","activity_onDestroy()");
    }
}
