package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import hikmetanil.fragmentotto.R;
import hikmetanil.fragmentotto.communication.P008NavigationHost;
import hikmetanil.fragmentotto.fragment.P008Fragment;

public class P008FragmentCodeLab extends AppCompatActivity implements P008NavigationHost {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p008_fragment_codelab);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayoutP008, new P008Fragment());
            fragmentTransaction.commit();
        }


        //navigateTo(new P008Fragment(), true);

    }

    @Override
    public void navigateTo(Fragment fragment, Boolean addToBackstack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayoutP008, fragment);
        if (addToBackstack) {
            fragmentTransaction.commit();
        }
    }
}
