package top.zingfeng.wanandroid.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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
import top.zingfeng.wanandroid.network.bean.RegisterBean;
import top.zingfeng.wanandroid.network.services.AccountService;

/**
 * @author zingfeng
 * @date On 2021/2/18
 */
@Route(path = "/view/RegisterActivity")
public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.iv_side_nav)
    ImageView mIvSideNav;

    @BindView(R.id.tv_goto_login)
    TextView mTvGoToLogin;

    @BindView(R.id.et_username)
    EditText mEtUsername;

    @BindView(R.id.et_password)
    EditText mEtPassword;

    @BindView(R.id.et_password_again)
    EditText mEtPasswordAgain;

    @BindView(R.id.btn_registered)
    Button mBtnRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        initData();
        initEvent();
    }

    private void initData(){

    }

    private void initEvent(){
        mIvSideNav.setOnClickListener(v -> {
            finish();
        });
        mTvGoToLogin.setOnClickListener(v -> {
            ARouter.getInstance()
                    .build("/view/LoginActivity")
                    .withTransition(R.anim.fade_out, R.anim.fade_in)
                    .navigation();
        });
        mBtnRegistered.setOnClickListener(v -> {
            String username = mEtUsername.getText().toString();
            String password = mEtPassword.getText().toString();
            String passwordAgain = mEtPasswordAgain.getText().toString();
            if (password.equals(passwordAgain)){
                Retrofit retrofit = BaseRetrofit.getRetrofit();
                AccountService accountService = retrofit.create(AccountService.class);
                Call<RegisterBean> register = accountService.register(username, password, passwordAgain);
                register.enqueue(new Callback<RegisterBean>() {
                    @Override
                    public void onResponse(Call<RegisterBean> call, Response<RegisterBean> response) {
                        int errorCode = response.body().getErrorCode();
                        String errorMsg = response.body().getErrorMsg();
                        if (errorCode == 0){

                        }else {
                            Toast.makeText(RegisterActivity.this, errorMsg, Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<RegisterBean> call, Throwable t) {

                    }
                });
            }else {
                Toast.makeText(this, "密码不一致", Toast.LENGTH_SHORT).show();
            }
        });
    }
}