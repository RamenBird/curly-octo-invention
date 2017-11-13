package boobs.like.ramenbird.howmanypiecesuniqlo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import boobs.like.ramenbirds.howmanypiecesuniqlo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (menu != null) {
            menuInflater.inflate(R.menu.aaa, menu)
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.add -> {
                AddDialog().show(fragmentManager, "add")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
