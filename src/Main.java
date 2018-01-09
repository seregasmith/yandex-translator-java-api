/**
 * Created by IntelliJ IDEA.
 * User: SBT-Kuznetsov-SV
 * Date: 09.01.2018
 * Time: 10:03
 */
import com.rmtheis.yandtran.ApiKeys;
import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;

public class Main {
    public static void main(String[] args) throws Exception {
        Translate.setKey(ApiKeys.YANDEX_API_KEY);

        String translatedText = Translate.execute("Привет, мужик!", Language.RUSSIAN, Language.ENGLISH);

        System.out.println(translatedText);
    }
}
