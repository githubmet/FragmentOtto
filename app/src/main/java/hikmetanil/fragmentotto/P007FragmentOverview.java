package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import hikmetanil.fragmentotto.fragment.P007Fragment;


public class P007FragmentOverview extends AppCompatActivity implements View.OnClickListener {


    //geri tuşu ile çıkamıyoruz!
    private Button buttonShowP007;
    private Boolean isFragmentDisplayed=false;
    static final String STATE_FRAGMENT="state_of_fragment_p002";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007_fragment_overview);

        buttonShowP007= findViewById(R.id.buttonShowP007);
        buttonShowP007.setOnClickListener(this);

        if(savedInstanceState !=null){
            isFragmentDisplayed=savedInstanceState.getBoolean(STATE_FRAGMENT);
            if(isFragmentDisplayed){
                buttonShowP007.setText(R.string.close);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(STATE_FRAGMENT,isFragmentDisplayed);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {

        if(!isFragmentDisplayed) {
            P007Fragment p007Fragment = getInstanceOfFragmentP002();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayoutP007, p007Fragment).addToBackStack(null).commit();

            buttonShowP007.setText(R.string.close);
            isFragmentDisplayed = true;
        }
        else{
            closeP002Fragment();
        }
    }
    public static P007Fragment getInstanceOfFragmentP002(){
        return new P007Fragment();
    }

    public void closeP002Fragment(){
        FragmentManager fragmentManager= getSupportFragmentManager();
        P007Fragment p007Fragment=(P007Fragment) fragmentManager.findFragmentById(R.id.frameLayoutP007);
        if(p007Fragment !=null) {
            fragmentManager.beginTransaction().remove(p007Fragment).commit();
        }

        buttonShowP007.setText(R.string.show);
        isFragmentDisplayed=false;
    }
}
