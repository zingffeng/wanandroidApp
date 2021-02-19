package top.zingfeng.wanandroid.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.UserBean;
import top.zingfeng.wanandroid.network.services.AccountService;

/**
 * @author zingfeng
 * @date On 2021/2/18
 */
@Route(path = "/view/LoginActivity")
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.et_username)
    EditText mEtUsername;

    @BindView(R.id.et_password)
    EditText mEtPassword;

    @BindView(R.id.btn_login)
    Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        initData();
        initEvent();
    }

    private void initData(){

    }

    private void initEvent(){
        mBtnLogin.setOnClickListener(v -> {
            String username = mEtUsername.getText().toString();
            String password = mEtPassword.getText().toString();
            Retrofit retrofit = BaseRetrofit.getRetrofit();
            AccountService userService = retrofit.create(AccountService.class);
            Call<UserBean> userlogin = userService.login(username, password);
            userlogin.enqueue(new Callback<UserBean>() {
                @Override
                public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                    int errorCode = response.body().getErrorCode();
                    String errorMsg = response.body().getErrorMsg();
                    if (errorCode == 0){
                        String username = response.body().getData().getUsername();
                        SharedPreferences config = getSharedPreferences("config", Context.MODE_PRIVATE);
                        SharedPreferences.Editor edit = config.edit();
                        edit.putString("username", username);
                        edit.apply();
                        Toast.makeText(LoginActivity.this, getText(R.string.login_successful).toString(), Toast.LENGTH_SHORT).show();
                        ARouter.getInstance()
                                .build("/view/MainActivity")
                                .withString("username", username)
                                .navigation();
                    }else if (errorCode == -1){
                        Toast.makeText(LoginActivity.this, errorMsg, Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(LoginActivity.this, getText(R.string.param_error).toString(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<UserBean> call, Throwable t) {

                }
            });
        });
    }
}