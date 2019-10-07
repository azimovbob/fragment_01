package azimov.example.fragment_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import azimov.example.fragment_01.Fragments.ImageFragment
import azimov.example.fragment_01.Fragments.TextFragTwo
import azimov.example.fragment_01.Fragments.TextFragmentOne
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragOneBtn.setOnClickListener {

//            val textFragment = TextFragmentOne()
//
//            val manager = supportFragmentManager
//
//            val transaction = manager.beginTransaction()
//
//            transaction.replace(R.id.fragment_container, textFragment)
//
//            transaction.addToBackStack(null)
//
//            transaction.commit()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, TextFragmentOne())
                .addToBackStack(TextFragmentOne().toString())
                .commit()
        }

        fragTwoBtn.setOnClickListener {

            //val textFragmentTwo =  TextFragTwo()
//
//            val manager = supportFragmentManager
//
//            val transaction = manager.beginTransaction()
//
//            transaction.replace(R.id.fragment_container, textFragmentTwo)
//
//            transaction.addToBackStack(null)
//
//            transaction.commit()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, TextFragTwo())
                .addToBackStack(null)
                .commit()

        }

        imageBtn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ImageFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
