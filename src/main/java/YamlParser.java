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
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        AnthemEnv env = mapper.readValue(text, AnthemEnv.class);
        System.out.println("My home dir:" + env.getDev().getSpark().getHadoop_home_dir());
    }
}
