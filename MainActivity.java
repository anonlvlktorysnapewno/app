import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        // Konfiguracja WebView
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);  // Włączenie JavaScript, jeśli wymagane przez stronę
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);  // Opcjonalne - ustawienia cache'u

        // Załadowanie strony logowania
        webView.loadUrl("https://eduvulcan.pl/logowanie");
    }
}
