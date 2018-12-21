package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import hikmetanil.fragmentotto.fragment.P001FragmentBottom;
import hikmetanil.fragmentotto.fragment.P001FragmentTop;

public class P001FragmentAppCompat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p001);

        //I need FragmentManager
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.relativeLayoutTopP001,new P001FragmentTop());
        fragmentTransaction.add(R.id.relativeLayoutBottomP001,new P001FragmentBottom());
        fragmentTransaction.commit();

    }
}
