package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.worldvisionsoft.kotlinbasicprojectsetup.BR
import com.worldvisionsoft.kotlinbasicprojectsetup.R
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.base.BaseActivity
import javax.inject.Inject

class HomeActivity : BaseActivity<ViewDataBinding, HomeViewModel>(), HomeNavigator {

    @set:Inject
    internal lateinit var mHomeViewModel: HomeViewModel

    private var mActivityLoginBinding: ViewDataBinding? = null

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_home
    }

    override fun getViewModel(): HomeViewModel {
        return mHomeViewModel
    }

    override fun home() {
        mHomeViewModel.performHome()
    }

    override fun handleError(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openMainActivity() {
        mHomeViewModel.onServerLoginClick()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityLoginBinding = getViewDataBinding()
        mHomeViewModel.setNavigator(this)
    }
}
