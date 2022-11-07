package com.miu.walmartlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.walmart_shopping.*


class ShoppingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.walmart_shopping)

         val user = intent.getSerializableExtra("user") as User
         val userName = user.username
         welcomeTextView.text = "Welcome $userName"
    }

    fun onElectronicsClick(view: View) {
        startActivity(Intent(this, ElectronicsItemsActivity::class.java))
    }
    fun onClothesClick(view: View) {
        Toast.makeText(applicationContext,"Clothes", Toast.LENGTH_LONG).show()
    }
    fun onBeautyClick(view: View) {
        Toast.makeText(applicationContext,"Beauty", Toast.LENGTH_LONG).show()
    }
    fun onFoodClick(view: View) {
        Toast.makeText(applicationContext,"Food", Toast.LENGTH_LONG).show()
    }


}