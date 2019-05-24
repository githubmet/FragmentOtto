package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import hikmetanil.fragmentotto.fragment.P002Fragment;

public class P002AddRemoveFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002add_remove_fragment);
    }

    public void onClickAddMtdP002(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.relativeLayoutP002, new P002Fragment(), "first_fragment_p002");
        fragmentTransaction.commit();
    }

    public void onClickRemoveMtdP002(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = fragmentManager.findFragmentByTag("first_fragment_p002");
        if(fragment != null) {
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }
}
