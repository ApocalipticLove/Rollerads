package config;


import org.aeonbits.owner.Config;

@ProjectConfig.LoadPolicy(ProjectConfig.LoadType.MERGE)
@ProjectConfig.Sources({
        "classpath:remote.properties"})
public interface ProjectConfig extends Config {

    @Key("baseUrl")
    String baseUrl();
    @Key("browser")
    String browser();
    @Key("browserSize")
    String browserSize();
    @Key("browserVersion")
    String browserVersion();
    @Key("remoteUrl")
    String remoteUrl();

}
