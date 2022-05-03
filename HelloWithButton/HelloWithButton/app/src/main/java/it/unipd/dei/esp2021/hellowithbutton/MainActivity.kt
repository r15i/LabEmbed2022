package it.unipd.dei.esp2021.hellowithbutton

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

private val TAG = MainActivity::class.java.simpleName // i doppi punti sono per prendere mainactivity.class.java.simpleName
class MainActivity : AppCompatActivity()
{

    // Called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d(TAG , "onCreate")
        var i = 10

        // Create the TextView
        val tv = TextView(this)
        tv.text = "Press the button, please"

        // Create the Button
        val bu = Button(this)
        bu.text = "Press me"

        val b2 = Button(this)
        b2.text = "+1"
        b2.setEnabled(false)

        // Set the action to be performed when the button is pressed
        bu.setOnClickListener { // Perform action on click
            tv.text = ""+i

            b2.setEnabled(true)

        }
        // Set the action to be performed when the button is pressed
        b2.setOnClickListener { // Perform action on click
            tv.text = ""+(++i)
        }

        // All UI elements must have IDs to use ConstraintSet
        bu.id = View.generateViewId()
        b2.id = View.generateViewId()
        tv.id = View.generateViewId()

        // Create the layout
        val myLayout = ConstraintLayout(this)

        // Add the UI elements to the layout
        myLayout.addView(bu)
        myLayout.addView(b2)
        myLayout.addView(tv)


        // Add constraints to the layout so that UI elements are positioned correctly
        val mySet = ConstraintSet()
        mySet.clone(myLayout)

        mySet.connect(bu.id, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT)
        mySet.connect(bu.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)

        mySet.connect(tv.id, ConstraintSet.LEFT, bu.id, ConstraintSet.RIGHT)
        mySet.connect(tv.id, ConstraintSet.BASELINE, bu.id, ConstraintSet.BASELINE)

        mySet.connect(b2.id, ConstraintSet.LEFT,ConstraintSet.PARENT_ID, ConstraintSet.LEFT)
        mySet.connect(b2.id, ConstraintSet.TOP,bu.id, ConstraintSet.BOTTOM)

        mySet.applyTo(myLayout)

        // Display the layout
        setContentView(myLayout)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG , "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG , "onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG , "onDestroy")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG , "onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG , "onStop")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG , "onPause")

    }
}
