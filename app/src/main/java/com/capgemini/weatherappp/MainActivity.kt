package com.capgemini.weatherappp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("succ", "after call")


        //  MyTask().execute()
        Log.d("succ", "before call")
        val frag = CityPicker.newInstance("", "")
        supportFragmentManager.beginTransaction()
                .add(R.id.parentL, frag)
                .commit()
    }


}
interface IOnBackPressed {
    fun onBackPressed(): Boolean
}
  /*  class MyTask : AsyncTask<Int, String, String?>() {
        override fun doInBackground(vararg params: Int?): String? {
            val key = "015a0e163e2cd6e99253a34375bf29b7"
            val request = OWInterface.getInstance().getMovies("12.9716", "77.5946", key, "7")
            // request.enqueue(OpenWeatherCallback())
          //val s=  request.execute().body()
            val y=request.execute().raw().toString()
            Log.d("succ",y)
           // Log.d("succ",s.toString())
            return ""
        }
    }*/
