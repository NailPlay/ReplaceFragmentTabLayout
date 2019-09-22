package b.com.myapplication

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Получаем ViewPager и устанавливаем в него адаптер
        val viewPager = findViewById<ViewPager>(R.id.viewpager)
        viewPager.adapter = PagedAdapter(this, supportFragmentManager)

        // Передаём ViewPager в TabLayout
        val tabLayout = findViewById<TabLayout>(R.id.sliding_tabs)
        tabLayout.setupWithViewPager(viewPager)


    }

    override fun onBackPressed() {
        val fm = supportFragmentManager
        for (frag in fm.fragments) {
            if (frag.isVisible) {
                val childFm = frag.childFragmentManager
                if (childFm.backStackEntryCount > 0) {
                    childFm.popBackStack()
                    return
                }
            }
        }
        super.onBackPressed()


    }

}
