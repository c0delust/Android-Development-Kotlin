import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gridview.R

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    private var playerNames = arrayOf(
        "Cristiano Ronaldo",
        "Joao Felix",
        "Bernado Silva",
        "Andre    Silve",
        "BrunoFernandez",
        "William Carvalho",
        "Nelson Semedo",
        "Pepe",
        "Rui Patricio"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "GridView"
        gridView = findViewById(R.id.gridView)

        val mainAdapter = MainAdapter(this, playerNames)
        gridView.adapter = mainAdapter
    }
}