package b.com.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_second, container, false)

        v.button2.setOnClickListener({
            val transaction = getParentFragment()!!.childFragmentManager.beginTransaction()
            transaction.replace(R.id.root2_frame, DetailsFragment())
            transaction.addToBackStack(null);
            transaction.commit()
        })
        return v
    }


}
