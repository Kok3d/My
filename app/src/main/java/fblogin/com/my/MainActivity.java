package fblogin.com.my;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends FragmentActivity {
    public CallbackManager callbackManager;
    public View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        callbackManager = CallbackManager.Factory.create();
//        LoginButton loginButton = (LoginButton)findViewById(R.id.login_button);
//        LoginButton loginButton = (LoginButton) view.findViewById(R.id.usersettings_fragment_login_button);
//        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//            @Override
//            public void onSuccess(LoginResult loginResult) {
//
//            }
//
//            @Override
//            public void onCancel() {
//                Toast.makeText(MainActivity.this,"取消登录",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onError(FacebookException error) {
//
//            }
//        });
    }
}
