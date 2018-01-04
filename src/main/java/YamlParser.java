import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;

public class YamlParser {
    public static void main(String[] args) throws IOException {
        URL url = Resources.getResource("env.yaml");
        String text = Resources.toString(url, Charsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory()).configure(DeserializationFeature
                .FAIL_ON_UNKNOWN_PROPERTIES, false);
        AnthemEnv env = mapper.readValue(text, AnthemEnv.class);
        System.out.println("My home dir:" + env.getDev().getSpark().getHadoop_home_dir());
        env.getDev().getJunk().forEach((s, s2) -> {
            System.out.println(s + "=>" );
            s2.forEach((s1, s21) -> {
                System.out.println("\t\t"+s1+"==>"+s21);
            });
        });
    }
}
