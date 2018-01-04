import java.util.Map;

public class AnthemEnv {

    private Dev dev;

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

    public static class Dev extends Env {

    }

    public static abstract class Env {
        private Spark spark;
        private Map<String, Map<String, String>> junk;

        public Spark getSpark() {
            return spark;
        }

        public void setSpark(Spark spark) {
            this.spark = spark;
        }


        public Map<String, Map<String, String>> getJunk() {
            return junk;
        }

        public void setJunk(Map<String, Map<String, String>> junk) {
            this.junk = junk;
        }
    }


    public static class Spark {
        public Spark() {
        }

        private String hadoop_home_dir;

        public String getHadoop_home_dir() {
            return hadoop_home_dir;
        }

        public void setHadoop_home_dir(String hadoop_home_dir) {
            this.hadoop_home_dir = hadoop_home_dir;
        }
    }
}
